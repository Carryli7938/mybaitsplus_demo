package com.example.mybatisplus.ap.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.ap.dao.input.ApInvoiceQueryPara;
import com.example.mybatisplus.ap.entity.ApInvoice;
import com.example.mybatisplus.ap.mapper.ApInvoiceMapper;
import com.example.mybatisplus.ap.service.IApInvoiceService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类1
 * </p>
 *
 * @author lida
 * @since 2020-09-10
 */
@Service
public class ApInvoiceServiceImpl extends ServiceImpl<ApInvoiceMapper, ApInvoice> implements IApInvoiceService {
    @Autowired
    ApInvoiceMapper apInvoicesServiceMapper;

    @Override
    public IPage<ApInvoice> list(ApInvoiceQueryPara filter) {
        return  apInvoicesServiceMapper.selectApInvoices(filter);
    }
}
