package com.hx.hxapollo.util;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:application.properties"})
@EnableApolloConfig
public class BeanUtil {

    @Value("${test.timeout}")
    public Integer timeout;

    @Bean(name = "appUtil")
    public AppUtil appUtil(){
        AppUtil appUtil = new AppUtil();
        appUtil.setTimeout(timeout);
        return appUtil;
    }
}
