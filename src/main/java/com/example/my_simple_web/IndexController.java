package com.example.my_simple_web;

import com.alibaba.fastjson2.JSONObject;
import com.example.my_simple_web.service.UserAptitudeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class IndexController {

    @Autowired
    private UserAptitudeService userAptitudeService;

    @GetMapping("/index")
    public JSONObject index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "nihao" + new Date().getTime());
        return jsonObject;
    }

    @GetMapping("/get")
    public JSONObject get() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", userAptitudeService.getOne());
        return jsonObject;
    }
}
