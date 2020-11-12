package com.example.xiaoymin.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jovi
 */
@Data
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {
    /**
     * 项目应用名
     */
    private String applicationName;

    /**
     * 项目作者
     */
    private String applicationAuthor;

    /**
     * 项目版本信息
     */
    private String applicationVersion;

    /**
     * 项目描述信息
     */
    private String applicationDescription;

    /**
     * 接口调试地址
     */
    private String tryHost;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 基础路径
     */
    private String basePackage;
}
