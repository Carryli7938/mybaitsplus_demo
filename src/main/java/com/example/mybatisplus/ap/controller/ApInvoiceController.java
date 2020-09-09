package com.example.mybatisplus.ap.controller;


import org.springframework.web.bind.annotation.*;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.ap.dao.input.ApInvoiceQueryPara;
import com.example.mybatisplus.ap.entity.ApInvoice;
import com.example.mybatisplus.ap.service.IApInvoiceService;
import com.example.mybatisplus.common.dto.ApiResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器2
 * </p>
 *
 * @author lida
 * @since 2020-09-10
 */
@RestController
@RequestMapping("/apInvoice")
public class ApInvoiceController {

    @Autowired
    IApInvoiceService apInvoicesService;

    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
    public ApiResult list(@RequestBody ApInvoiceQueryPara filter) {
        System.out.println(filter.getId());
        IPage<ApInvoice> result = apInvoicesService.list(filter);
        return ApiResult.ok("获取系统管理-用户基础信息表列表成功", result);
    }    
}

