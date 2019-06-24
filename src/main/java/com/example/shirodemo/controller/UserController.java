package com.example.shirodemo.controller;

import com.example.shirodemo.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping(value = "getuser")
    public String testShiro(){
        return "success";
    }

    @GetMapping(value = "visuser")
    public String test1Shiro(){
        Subject subject = SecurityUtils.getSubject();
        subject.checkRole("admin");
        return "success";
    }
    //
    //@Autowired
    //private UserMapper userMapper;
    //
    //@RequestMapping("/getUsers")
    //public List<User> getUsers() {
    //    List<User> users = userMapper.getAll();
    //    return users;
    //}
    //
    //@RequestMapping("/getUser")
    //public User getUser(Long id) {
    //    User user = userMapper.getOne(id);
    //    return user;
    //}
    //
    //@RequestMapping("/add")
    //public void save(User user) {
    //    userMapper.insert(user);
    //}
    //
    //@RequestMapping(value = "update")
    //public void update(User user) {
    //    userMapper.update(user);
    //}
    //
    //@RequestMapping(value = "/delete/{id}")
    //public void delete(@PathVariable("id") Long id) {
    //    userMapper.delete(id);
    //}


}