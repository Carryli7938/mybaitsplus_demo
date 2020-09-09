package com.example.mybatisplus.ap.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.ap.dao.input.ApInvoiceQueryPara;
import com.example.mybatisplus.ap.entity.ApInvoice;


/**
 * <p>
 *  服务类1
 * </p>
 *
 * @author lida
 * @since 2020-09-10
 */
public interface IApInvoiceService extends IService<ApInvoice> {
    /**
     * 系统管理-用户基础信息表列表
     *
     * @param filter
     * @return
     */
    IPage<ApInvoice> list(ApInvoiceQueryPara filter);
}
