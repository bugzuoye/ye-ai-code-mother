package com.zuoye.yeaicodemother.controller;

import com.zuoye.yeaicodemother.common.BaseResponse;
import com.zuoye.yeaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:
 * @description:
 * @author: zhangjy
 * @create: 2025.11.04 11:16
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck(){
        return ResultUtils.success("ok");
    }
}
