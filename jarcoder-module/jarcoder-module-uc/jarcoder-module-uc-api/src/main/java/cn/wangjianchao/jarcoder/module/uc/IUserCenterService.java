package cn.wangjianchao.jarcoder.module.uc;

import cn.wangjianchao.jarcoder.module.uc.model.User;

/**
 * Created by tiny on 16-6-23.
 */
public interface IUserCenterService {

    User getUserByName(String username);
}
