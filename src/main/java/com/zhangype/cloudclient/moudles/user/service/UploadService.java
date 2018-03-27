package com.zhangype.cloudclient.moudles.user.service;

import com.zhangype.cloudclient.config.MultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传Service
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/3/27
 */
@FeignClient(value = "myboot", configuration = MultipartSupportConfig.class)
public interface UploadService {

    @RequestMapping(value = "/sys/upload/file", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFile(@RequestPart(value = "file") MultipartFile file);
}
