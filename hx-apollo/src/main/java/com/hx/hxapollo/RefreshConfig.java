package com.hx.hxapollo;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.stereotype.Component;

@Component
public class RefreshConfig {

    @Autowired
    private TestConfig testConfig;

    @Autowired
    private RefreshScope refreshScope;

    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent) {
        for (String changedKey : changeEvent.changedKeys()) {
            if (changedKey.startsWith("test")) {
                System.out.println("开始刷新");
                refreshScope.refresh("testConfig");
                break;
            }
        }

    }
}
