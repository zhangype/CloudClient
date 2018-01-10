package com.zhangype.cloudclient.moudles.user.service;

import com.zhangype.cloudclient.moudles.user.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户Service
 *
 * @author zhangype@yonyou.com
 * @version V1.0.0
 * @date 2018/1/9
 */
@FeignClient(name = "myboot")
public interface UserService {

    @RequestMapping(value = "/sys/user/info", method = RequestMethod.POST)
    String getUserInfo(UserDTO userDTO);
}
