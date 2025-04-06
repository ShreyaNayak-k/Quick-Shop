package com.shreya.simpleecommerceapp.controller;

import com.shreya.simpleecommerceapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
}
