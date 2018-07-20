package com.zhangype.cloudclient.moudles.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhangype.cloudclient.moudles.user.dto.BillDTO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;


/**
 * 账单Service
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/7/18
 */
@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCollapser(batchMethod = "findAll", collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "100")
    })
    public Future<BillDTO> find(Long id) {
        logger.info(String.valueOf(id));
        return null;
    }

    @HystrixCommand
    public List<BillDTO> findAll(List<Long> ids) {
        logger.info("合并请求");
        BillDTO[] books = restTemplate.getForObject("http://myboot:8080/sys/bill/info?ids={1}", BillDTO[].class, StringUtils.join(ids, ","));
        return Arrays.asList(books);
    }


}
