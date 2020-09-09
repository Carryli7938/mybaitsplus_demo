package ${package.Controller};


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.ap.dao.input.${table.entityName}QueryPara;
import com.example.mybatisplus.ap.entity.${entity};
import ${package.Service}.${table.serviceName};
import com.example.mybatisplus.common.dto.ApiResult;

<#if restControllerStyle>
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
 * <p>
 * ${table.comment!} 前端控制器2
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("<#if package.ModuleName??>/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    @Autowired
    ${table.serviceName} ${cfg.abc1};

    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
    public ApiResult list(@RequestBody ${table.entityName}QueryPara filter) {
        IPage<${table.entityName}> result = ${cfg.abc1}.list(filter);
        return ApiResult.ok("获取系统管理-用户基础信息表列表成功", result);
    }    
}
</#if>
