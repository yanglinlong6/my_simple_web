package com.example.my_simple_web.service;

import com.example.my_simple_web.MySimpleWebApplication;
import com.example.my_simple_web.entity.UserAptitudePO;
import com.xiaoleilu.hutool.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySimpleWebApplication.class)
public class UserAptitudeServiceTest {

    @Autowired
    private UserAptitudeService userAptitudeService;

    @Test
    public void getOne() {
        String one = userAptitudeService.getOne();
        System.out.println("one = " + one);
    }

    @Test
    public void getTwo() {
        UserAptitudePO two = userAptitudeService.getTwo();
        System.out.println("one = " + JSONUtil.toJsonStr(two));
    }
}
