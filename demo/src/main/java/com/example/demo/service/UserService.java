package com.example.demo.service;
import com.example.demo.pojo.Roles;
import com.example.demo.pojo.User;
//import com.example.demo.reposity.RolesRepository;
//import com.example.demo.reposity.RolesUserRepository;
import com.example.demo.pojo.rolesUser;
import com.example.demo.reposity.RolesRepository;
import com.example.demo.reposity.RolesUserRepository;
import com.example.demo.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 14:09
 **/
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RolesRepository rolesRepository;
    @Autowired
    RolesUserRepository rolesUserRepository;
    public User getById(Long id)
    {
        return userRepository.findById(id).get();
    }
    public List<Roles> getRolesById(Long id)
    {
        List<rolesUser> ridByUid = rolesUserRepository.findByUid(id);
        List<Roles> roles=new ArrayList<>();
        for(rolesUser rid:ridByUid)
        {
            roles.add(rolesRepository.findById(rid.getUid()).get());
        }
        return roles;
    }
}
