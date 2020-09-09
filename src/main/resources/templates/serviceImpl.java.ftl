package ${package.ServiceImpl};

import com.baomidou.mybatisplus.core.metadata.IPage;
import ${superServiceImplClassPackage};
import com.example.mybatisplus.ap.dao.input.${entity}QueryPara;
import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ${table.comment!} 服务实现类1
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
    @Autowired
    ${table.mapperName} ${cfg.abc1}Mapper;

    @Override
    public IPage<${entity}> list(${entity}QueryPara filter) {
        return  ${cfg.abc1}Mapper.select${entity}s(filter);
    }
}
</#if>
