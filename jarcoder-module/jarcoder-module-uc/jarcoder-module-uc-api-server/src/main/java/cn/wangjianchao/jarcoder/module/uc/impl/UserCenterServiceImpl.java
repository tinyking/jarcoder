package cn.wangjianchao.jarcoder.module.uc.impl;

import cn.wangjianchao.jarcoder.module.uc.IUserCenterService;
import cn.wangjianchao.jarcoder.module.uc.model.User;

/**
 * Created by tiny on 16-6-23.
 */
public class UserCenterServiceImpl implements IUserCenterService {
    public User getUserByName(String username) {
        return new User(username, "man", 18);
    }
}
