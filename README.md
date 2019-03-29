# Spring-Boot-MyBatis

### applocalhost.properties

	## 数据源配置
	spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
	spring.datasource.url=jdbc:mariadb://localhost:3308/empDB
	spring.datasource.username=root
	spring.datasource.password=123456

	# 数据连接池
	spring.datasource.type=com.mchange.v2.c3p0.ComboPooledDataSource

	## tomcat 配置
	server.port=8080

	## 配置监控
	management.endpoints.web.exposure.include=*
    
	## 引入log4j的配置
	# spring.profiles.active=log4j

	## 配置mybatis
	### 映射的实体类
	mybatis.type-aliases-package=com.wgc.springboot20190328.entity
	### 配置映射文件
	mybatis.mapper-locations=classpath:mapper/*.xml
	### 开启日志管理
	mybatis.configuration.log-impl=org.apache.ibatis.logging.log4j.Log4jImpl
	### 开启驼峰命名转换:Table {create_time} -> Entity {createTime}
	mybatis.configuration.map-underscore-to-camel-case=true


	## pagehelper 分页插件
	pagehelper.helperDialect=mysql
	pagehelper.reasonable=true
	pagehelper.supportMethodsArguments=true
	pagehelper.params=count=countSql

	## 这里是默认配置
	spring.devtools.restart.enabled=true

	## 设置重启的目录
	spring.devtools.restart.additional-paths=src/main/java

	# classpath目录下的WEB-INF文件夹内容修改不重启
	# spring.devtools.restart.exclude: WEB-INF/**

			
