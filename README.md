# springboot-shardingjdbc
项目技术栈：springBoot+mybatis+通用mapper+druid+shardingjdbc
介绍：项目中用到shardingjdbc，学习的过程中，从0开始搭建的一个springboot-shardingjdbc项目。。中间踩了很多坑，
如：1)尝试springBoot零配置--最终失败，发现application.properties是不能少的
   2）在尝试mybatis-generator生成mapper。调用insert方法时报错：java.sql.SQLException: Field 'order_id' doesn't have a default value(sharding jdbc的jar包引的不对)
   3)其它的一些报错：
     a，分片规则未生效，一直插入t_order_1表
     b，application.properties配置 转基于Java编码的规则配置时一直报如下异常
        Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker': Invocation of init method failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/apache/shardingsphere/shardingjdbc/spring/boot/SpringBootConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.sql.DataSource]: Factory method 'dataSource' threw exception; nested exception is java.lang.IllegalArgumentException: Data sources cannot be empty.（解决:springboot启动类中，排除org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration）
为了后期不再重新踩坑，故把最终成功的代码上传至github.


docker mysql主从复制搭建:http://724e8722.wiz06.com/wapp/pages/view/share/s/1OjEsy3iLk7Q2oE5Y51m7nw_03wUac2C2APF2ZS6N91DMSiG
shardingJdbc笔记:http://724e8722.wiz06.com/wapp/pages/view/share/s/1OjEsy3iLk7Q2oE5Y51m7nw_3DJY7N1FYQaY28qFdj0Ztffd
