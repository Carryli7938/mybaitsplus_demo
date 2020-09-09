package com.example.mybatisplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MyBatisPlusGenerator {
	public static String scanner(String tip) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder help = new StringBuilder();
		help.append("请输入" + tip + "：");
		System.out.println(help.toString());
		if (scanner.hasNext()) {
			String ipt = scanner.next();
			if (StringUtils.isNotEmpty(ipt)) {
				return ipt;
			}
		}
		throw new MybatisPlusException("请输入正确的" + tip + "！");
	}

	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();

		String projectPath = System.getProperty("user.dir");
		gc.setOutputDir(projectPath + "/src/main/java");// 生成文件的输出目录
		gc.setAuthor("lida");// 开发人员
		gc.setOpen(false);// 是否打开输出目录
		gc.setBaseResultMap(true);// 开启 BaseResultMap
		gc.setBaseColumnList(true);// 开启 baseColumnList
		// gc.setControllerName("SSSSScontroller");
		gc.setFileOverride(true);// 是否覆盖已有文件
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl(
				"jdbc:mysql://localhost:3306/ap?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true");
		// dataSourceConfig.setSchemaName("public");
		dsc.setDriverName("com.mysql.cj.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("111111");
		mpg.setDataSource(dsc);

		// 包配置
		PackageConfig pc = new PackageConfig();
		// pc.setModuleName(scanner("模块名"));//父包模块名
		pc.setParent("com.example.mybatisplus.ap");// 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
		// 这个地址是生成的配置文件的包路径
		//pc.setEntity(entity)
		// pc.setService(service)
		// pc.setServiceImpl(serviceImpl)
		// pc.setMapper(mapper)
		// pc.setXml(xml)
		// pc.setController(controller)
		// pc.setPathInfo(pathInfo)
		mpg.setPackageInfo(pc);

		// 自定义配置
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				// to do nothing
			}
		};

		// 如果模板引擎是 freemarker
		String templatePath = "/templates/mapper.xml.ftl";
		// 如果模板引擎是 velocity
		// String templatePath = "/templates/mapper.xml.vm";

		// 自定义输出配置
		List<FileOutConfig> focList = new ArrayList<>();
		// 自定义配置会被优先输出
		//String templatePath = "/templates/template.xml.ftl";
		focList.add(new FileOutConfig(templatePath) {
			@Override
			public String outputFile(TableInfo tableInfo) {
				// 自定义输出文件名
				return projectPath + "/src/main/resources/mapper/entityTest"
				+ "/" + tableInfo.getEntityName() + "MapperTest" + StringPool.DOT_XML;
				// String expand = CODE_FACTORY_OUT_PATH + "/" + "expand";
				// String entityFile = String.format((expand + File.separator + "%s" + ".java"),
				// 		tableInfo.getControllerName());
				// return entityFile;
			}
		});

		cfg.setFileOutConfigList(focList);
		mpg.setCfg(cfg);
		// // 配置模板
		// TemplateConfig templateConfig = new TemplateConfig();

		// // //配置自定义输出模板
		// // 不需要其他的类型时，直接设置为null就不会成对应的模版了
		// //templateConfig.setEntity("...");
		// templateConfig.setService(null);
		// templateConfig.setController(null);
		// templateConfig.setServiceImpl(null);
		// // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
		// // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也
		// // 可以自定义模板名称 只要放到目录下，名字不变 就会采用这个模版 下面这句有没有无所谓
		// // 模版去github上看地址：
		// /**https://github.com/baomidou/mybatis-plus/tree/3.0/mybatis-plus-generator/src/main/resources/templates*/
		// //templateConfig.setEntity("/templates/entity.java");
		// templateConfig.setXml(null);
		// mpg.setTemplate(templateConfig);

		// 配置模板
		TemplateConfig templateConfig = new TemplateConfig();

		// 配置自定义输出模板
		// 指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
		// templateConfig.setEntity("templates/entity2.java");
		// templateConfig.setService();
		// templateConfig.setController();
		//templateConfig.setMapper("templates/mapper.java");
		//templateConfig.setXml("/templates/template.xml");
		mpg.setTemplate(templateConfig);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		// strategy.setSuperEntityClass("com.cikers.ps.model.BaseEntity");
		// strategy.setSuperMapperClass("com.example.demo.util.IMapper");

		strategy.setEntityLombokModel(false);
		strategy.setRestControllerStyle(true);
		// strategy.setSuperControllerClass("com.cikers.ps.controller.MysqlController");
		strategy.setInclude(scanner("表名"));
		// 设置继承的父类字段
		strategy.setSuperEntityColumns("id", "modifiedBy", "modifiedOn", "createdBy", "createdOn");
		// strategy.setControllerMappingHyphenStyle(true);
		// strategy.setTablePrefix(pc.getModuleName() + "_");
		mpg.setStrategy(strategy);
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());
		mpg.execute();
	}

}
