package site.wtfu.framework.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright 2021 wtfu.site Inc. All Rights Reserved.
 *
 * @author: 12302
 * @date: 2021-05-01
 */
@Controller
@RequestMapping(value = "/properties")
public class TestPropertiesController {


    @Value(value = "${name}")
    public String name;

    @RequestMapping(value = "get")
    @ResponseBody
    public Object getProperties(){
        return name;
    }

}
