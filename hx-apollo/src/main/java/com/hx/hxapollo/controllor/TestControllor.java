package com.hx.hxapollo.controllor;

import com.hx.hxapollo.SpringContextHolder;
import com.hx.hxapollo.TestConfig;
import com.hx.hxapollo.util.AppUtil;
import com.hx.hxapollo.util.BeanUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControllor {

    @RequestMapping(method = RequestMethod.POST, value = "/test", consumes="application/json")
    public @ResponseBody
    String login(@RequestBody Integer num){

        TestConfig testConfig = SpringContextHolder.getBean("testConfig");
        return testConfig.toString() + ">>>num:" + num;
    }
}
