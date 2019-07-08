package com.miaoshaproject.miaosha;

import com.miaoshaproject.miaosha.dao.UserDOMapper;
import com.miaoshaproject.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"} )
@MapperScan("com.miaoshaproject.miaosha.dao")//扫描mapper
@RestController
public class MiaoshaApplication {
    @Autowired
    UserDOMapper userDOMapper;


    @RequestMapping("/")
    public String home() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null) {
            return "用户对象不存在";
        } else {
            return userDO.getName();
        }

    }
    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

}
