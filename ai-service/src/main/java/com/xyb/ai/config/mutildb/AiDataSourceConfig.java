package com.xyb.ai.config.mutildb;

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
@MapperScan(basePackages = AiDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "aiSqlSessionFactory")
public class AiDataSourceConfig {
    // 精确到 ai 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.xyb.ai.mapper.ai";
    static final String MAPPER_LOCATION = "classpath:mapper/ai/*.xml";

    private Logger logger = LoggerFactory.getLogger(AiDataSourceConfig.class);

    @Autowired
    private PageInterceptor pageInterceptor;

    @Value("${db.ai.url}")
    private String dbUrl;

    @Value("${db.ai.username}")
    private String username;

    @Value("${db.ai.password}")
    private String password;

    @Value("${db.ai.driver-class-name}")
    private String driverClassName;

    @Value("${db.ai.initialSize}")
    private int initialSize;

    @Value("${db.ai.minIdle}")
    private int minIdle;

    @Value("${db.ai.maxActive}")
    private int maxActive;

    @Value("${db.ai.maxWait}")
    private int maxWait;

    @Value("${db.ai.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${db.ai.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${db.ai.validationQuery}")
    private String validationQuery;

    @Value("${db.ai.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${db.ai.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${db.ai.testOnReturn}")
    private boolean testOnReturn;

    @Value("${db.ai.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${db.ai.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${db.ai.filters}")
    private String filters;

    @Value("{db.ai.connectionProperties}")
    private String connectionProperties;

    @Bean(name = "aiDataSource")     //声明其为Bean实例
    @Primary    //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource aiDataSource() {
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

    @Bean(name = "aiTransactionManager")
    @Primary
    public DataSourceTransactionManager aiTransactionManager() {
        return new DataSourceTransactionManager(aiDataSource());
    }

    @Bean(name = "aiSqlSessionFactory")
    @Primary
    public SqlSessionFactory aiSqlSessionFactory(@Qualifier("aiDataSource") DataSource aiDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(aiDataSource);

        //该配置非常的重要，如果不将PageInterceptor设置到SqlSessionFactoryBean中，导致分页失效
        sessionFactory.setPlugins(new Interceptor[]{pageInterceptor});
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(AiDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
