package ${package.Service};

import com.baomidou.mybatisplus.core.metadata.IPage;
import ${superServiceClassPackage};
import com.example.mybatisplus.ap.dao.input.${entity}QueryPara;
import ${package.Entity}.${entity};


/**
 * <p>
 * ${table.comment!} 服务类1
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {
    /**
     * 系统管理-用户基础信息表列表
     *
     * @param filter
     * @return
     */
    IPage<${entity}> list(${entity}QueryPara filter);
}
</#if>
