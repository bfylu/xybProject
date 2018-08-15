## springboot 2.0 集成 mybatis

### 环境：

* 开发工具：Intellij IDEA 2017.1.3
* springboot: **2.0.1.RELEASE**
* jdk：1.8.0_40
* maven:3.3.9
* alibaba Druid 数据库连接池：1.1.0

###功能列表：
1. PageHelper 分页插件，简化编写分页

2. 统一错误处理，并打印日志（包括时间）

3. 拦截器，拦截输入参数，输出参数，及时间等信息

4. 集成了session 共享

5. 集成redis，mybatis，mysql

6. 集成了Actuator可以查看系统运行情况

7. 集成了Swagger2，可以查看系统所有的Http API及输入输出参数等
　　http://localhost:8080/swagger-ui.html#/

8. 支持日志打印功能

9. 集成了mybatis代码自动生成功能

10.实现Redis二级缓存

11.支持开发环境，生产环境，测试环境配置
  如：java -jar -Dspring.profiles.active=prod ai-service-0.0.1-SNAPSHOT.jar
  
12.集成了开发的常用工具包

13.支持跨域功能

14.实体对象可以不用写set和get方法就可以实现同样的功能

15.使用热部署功能

16.集成了task配置运行功能

17.支持调用mysql执行的完整sql语句打印

18.支持多数据库源

19.用户登录拦截功能

