package com.zhangype.cloudclient.moudles.user.controller;

import com.zhangype.cloudclient.moudles.user.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传Controller
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/3/27
 */
@RestController
@RequestMapping(value = "/sys/upload", method = RequestMethod.POST)
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping(value = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFile(@RequestPart(value = "file") MultipartFile file) {
        return uploadService.handleFile(file);
    }

}
