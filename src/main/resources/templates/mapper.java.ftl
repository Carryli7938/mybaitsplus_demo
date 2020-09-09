package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import java.util.List;

/**
 * <p>
 * ${table.comment!} Mapper 接口类
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
     List<${entity}> select${entity}s(Pagination page, @Param("filter") ${entity}QueryPara filter);
}
</#if>
