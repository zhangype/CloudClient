package com.zhangype.cloudclient.moudles.user.controller;

import com.zhangype.cloudclient.moudles.user.dto.UserDTO;
import com.zhangype.cloudclient.moudles.user.model.UserModel;
import com.zhangype.cloudclient.moudles.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 用户Controller
 *
 * @author zhangype@yonyou.com
 * @version V1.0.0
 * @date 2018/1/9
 */
@RestController
@RequestMapping(value = "/sys/user", method = RequestMethod.POST)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/info")
    public String getUserInfo(@RequestBody @Valid UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAccount(userModel.getAccount());
        return userService.getUserInfo(userDTO);
    }
}
