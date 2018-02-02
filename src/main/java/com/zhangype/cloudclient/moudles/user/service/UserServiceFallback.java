package com.zhangype.cloudclient.moudles.user.service;

import com.zhangype.cloudclient.moudles.user.dto.UserDTO;
import org.springframework.stereotype.Component;

/**
 * 用户Service回调
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/2/2
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public String getUserInfo(UserDTO userDTO) {
        return "get user " + userDTO.getAccount() + "error";
    }
}
