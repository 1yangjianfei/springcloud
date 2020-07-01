package com.example.demo.reposity;

import com.example.demo.pojo.rolesUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 14:20
 **/
public interface RolesUserRepository extends CrudRepository<rolesUser,Long> {
    List<rolesUser> findByUid(Long uid);
//    List<Long> findRidByUid(Long uid);
}
