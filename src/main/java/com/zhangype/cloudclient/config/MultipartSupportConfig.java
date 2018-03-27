package com.zhangype.cloudclient.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件上传配置
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/3/27
 */
@Configuration
public class MultipartSupportConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }

}
