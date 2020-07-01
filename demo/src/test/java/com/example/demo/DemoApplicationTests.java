package com.example.demo;

import com.example.demo.pojo.rolesUser;
import com.example.demo.reposity.RolesUserRepository;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    RolesUserRepository rolesUserRepository;

    @Test
    void contextLoads() {
    }
    @Test
    void hutoolTest()
    {
        String dateStr = "2012-12-12 12:12:12";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }
    @Test
    void TestRU()
    {
        List<rolesUser> byUid = rolesUserRepository.findByUid((long) 6);
        for (rolesUser roles:byUid
             ) {
            System.out.println(roles.getRid());
        }
//        List<Long> ridByUid = rolesUserRepository.findRidByUid((long) 6);
//        for (Long r:ridByUid
//             ) {
//            System.out.println(r);
//        }

    }


}
