package com.jk.service;

import com.jk.model.User;
import sun.net.sdp.SdpSupport;

import java.util.List;
public interface UserService {
    List<User> queryUser();

    void addUser(User user);

    void delUser(Integer[] ids);

    User queryUserById(User user);


}
