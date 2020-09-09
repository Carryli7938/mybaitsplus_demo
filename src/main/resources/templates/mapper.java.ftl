package ${package.Mapper};

import ${superMapperClassPackage};
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.ap.dao.input.${entity}QueryPara;
import ${package.Entity}.${entity};

import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * ${table.comment!} Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
     IPage<${entity}> select${entity}s(Page page, @Param("filter") ${entity}QueryPara filter);
   
    /**
     * 列表
     *
     * @param filter
     * @return
     */
    IPage<${entity}> select${entity}s(@Param("filter") ${entity}QueryPara filter);     

}
</#if>
