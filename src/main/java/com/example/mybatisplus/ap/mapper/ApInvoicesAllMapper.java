package com.example.mybatisplus.ap.mapper;

import com.example.mybatisplus.ap.entity.ApInvoicesAll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import java.util.List;

/**
 * <p>
 *  Mapper 接口类
 * </p>
 *
 * @author lida
 * @since 2020-09-09
 */
public interface ApInvoicesAllMapper extends BaseMapper<ApInvoicesAll> {
    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
     List<ApInvoicesAll> selectApInvoicesAlls(Pagination page, @Param("filter") ApInvoicesAllQueryPara filter);
}
