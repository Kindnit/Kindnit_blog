package com.kindnit;

import com.kindnit.dao.TypeMapper;
import com.kindnit.dao.UserMapper;
import com.kindnit.pojo.Type;
import com.kindnit.pojo.User;
import com.kindnit.service.TypeService;
import com.kindnit.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resources;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class BlogMybatisApplicationTests {

    @Test
    void contextLoads() {
        String str ="a,b,c";
        List<String> split= Arrays.asList(str.split(","));
        System.out.println(split);
    }

}
