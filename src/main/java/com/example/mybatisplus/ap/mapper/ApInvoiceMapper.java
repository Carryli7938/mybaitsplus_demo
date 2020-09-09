package com.example.mybatisplus.ap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.ap.dao.input.ApInvoiceQueryPara;
import com.example.mybatisplus.ap.entity.ApInvoice;

import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lida
 * @since 2020-09-10
 */
public interface ApInvoiceMapper extends BaseMapper<ApInvoice> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
     IPage<ApInvoice> selectApInvoices(Page page, @Param("filter") ApInvoiceQueryPara filter);
   
    /**
     * 列表
     *
     * @param filter
     * @return
     */
    IPage<ApInvoice> selectApInvoices(@Param("filter") ApInvoiceQueryPara filter);     

}
