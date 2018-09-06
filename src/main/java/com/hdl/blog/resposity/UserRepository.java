package com.hdl.blog.resposity;

import com.hdl.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {
    @Query(value = "select * from user where user_name=:userName and user_password=:userPassword", nativeQuery = true)
    User selectUser(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
