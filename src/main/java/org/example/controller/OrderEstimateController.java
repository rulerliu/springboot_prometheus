package org.example.controller;

import org.example.entity.OrderEstimateCreateVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order-estimate")
@Validated
public class OrderEstimateController {

    @PostMapping("/save")
    public String saveOrderEstimate(@RequestBody OrderEstimateCreateVO orderEstimateCreateVO) {
        return "sss";
    }

}
