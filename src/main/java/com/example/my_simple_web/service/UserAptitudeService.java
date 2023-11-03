package com.example.my_simple_web.service;


import com.example.my_simple_web.entity.UserAptitudePO;
import com.example.my_simple_web.mapper.UserAptitudeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAptitudeService {

    @Autowired
    private UserAptitudeDao userAptitudeDao;

    public String getOne() {
        return userAptitudeDao.getOneById(1);
    }

    public UserAptitudePO getTwo() {
        return userAptitudeDao.selectByPrimaryKey(1);
    }
}
