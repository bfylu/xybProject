package com.xyb.shop.config.mutildb;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@EnableTransactionManagement
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = XybDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "xybSqlSessionFactory")
public class XybDataSourceConfig {
    // 精确到 xyb 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.xyb.shop.mapper.xyb";
    static final String MAPPER_LOCATION = "classpath:mapper/xyb/*.xml";

    private Logger logger = LoggerFactory.getLogger(XybDataSourceConfig.class);

    @Autowired
    private PageInterceptor pageInterceptor;

    @Value("${db.xyb.url}")
    private String dbUrl;

    @Value("${db.xyb.username}")
    private String username;

    @Value("${db.xyb.password}")
    private String password;

    @Value("${db.xyb.driver-class-name}")
    private String driverClassName;

    @Value("${db.xyb.initialSize}")
    private int initialSize;

    @Value("${db.xyb.minIdle}")
    private int minIdle;

    @Value("${db.xyb.maxActive}")
    private int maxActive;

    @Value("${db.xyb.maxWait}")
    private int maxWait;

    @Value("${db.xyb.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${db.xyb.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${db.xyb.validationQuery}")
    private String validationQuery;

    @Value("${db.xyb.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${db.xyb.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${db.xyb.testOnReturn}")
    private boolean testOnReturn;

    @Value("${db.xyb.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${db.xyb.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${db.xyb.filters}")
    private String filters;

    @Value("{db.xyb.connectionProperties}")
    private String connectionProperties;

    @Bean(name = "xybDataSource")     //声明其为Bean实例
    @Primary    //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource xybDataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(connectionProperties);

        return datasource;
    }

    @Bean(name = "xybTransactionManager")
    @Primary
    public DataSourceTransactionManager xybTransactionManager() {
        return new DataSourceTransactionManager(xybDataSource());
    }

    @Bean(name = "xybSqlSessionFactory")
    @Primary
    public SqlSessionFactory xybSqlSessionFactory(@Qualifier("xybDataSource") DataSource xybDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(xybDataSource);

        //该配置非常的重要，如果不将PageInterceptor设置到SqlSessionFactoryBean中，导致分页失效
        sessionFactory.setPlugins(new Interceptor[]{pageInterceptor});
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(XybDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
