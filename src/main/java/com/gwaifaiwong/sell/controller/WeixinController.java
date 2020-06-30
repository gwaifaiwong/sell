package com.gwaifaiwong.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by
 *
 * @author gwaifaiwong
 * @date 2020/6/29
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {
    @GetMapping("auth")
    public void auth(@RequestParam("code")String code){
        log.info("进入auth");
        log.info("获取code");
    }
}