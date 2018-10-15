package com.hx.hxapollo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "test")
@Component("testConfig")
@RefreshScope
public class TestConfig {
    private Integer timeout;
    private String url;
    private String username;

    @Override
    public String toString() {
        return "TestConfig{" +
                "timeout=" + timeout +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
