package com.example.mybatisplus.ap.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mybatisplus.ap.service.IApInvoicesAllService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器2
 * </p>
 *
 * @author lida
 * @since 2020-09-09
 */
@Controller
@RequestMapping("//apInvoicesAll")
public class ApInvoicesAllController {

    @Autowired
    IApInvoicesAllService apInvoicesAllService;

}
