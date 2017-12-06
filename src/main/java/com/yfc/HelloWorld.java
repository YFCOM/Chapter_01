package com.yfc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yufuchang on 2017/12/6.
 */
@RestController
public class HelloWorld {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
