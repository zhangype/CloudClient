package com.zhangype.cloudclient.moudles.user.controller;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import com.zhangype.cloudclient.moudles.user.dto.BillDTO;
import com.zhangype.cloudclient.moudles.user.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 账单Controller
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/7/19
 */
@RestController
@RequestMapping(value = "/sys/bill", method = RequestMethod.POST)
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping("/info")
    public String getUserInfo() {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        Future<BillDTO> f1 = billService.find(1L);
        Future<BillDTO> f2 = billService.find(2L);
        Future<BillDTO> f3 = billService.find(3L);
        try {
            f1.get();
            f2.get();
            f3.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        context.close();
        return "success";
    }

}
