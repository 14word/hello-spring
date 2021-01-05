package org.hyc.core;

/**
 * @author hyc
 * @description 配置文件字段维护，用户自定义的配置文件字段只能在这里面选
 * @date 2021-01-04 16:34
 */
public interface ConfigConstants {

    // 配置文件的名称
    String CONFIG_FILE_NAME = "hello-spring.properties";

    // 数据库连接
    String JDBC_DRIVER = "hello-spring.jdbc.driver";
    String JDBC_URL = "hello-spring.jdbc.url";
    String JDBC_USERNAME = "hello-spring.jdbc.username";
    String JDBC_PASSWORD = "hello-spring.jdbc.password";

    // Java源码地址
    String APP_BASE_PACKAGE = "hello-spring.app.base_package";
    // jsp页面路径
    String APP_JSP_PATH = "hello-spring.app.jsp_path";
    // 静态资源路径
    String APP_ASSET_PATH = "hello-spring.app.asset_path";
}
