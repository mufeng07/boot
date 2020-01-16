package com.mufeng.config;

import com.mufeng.bean.Bean1;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: 测试@Import配置类
 * @author: mufeng
 * @create: 2020/1/14 17:52
 */
@Import({Bean1.class,TestConfiguration.class,TestImportBeanDefinitionRegistrar.class,TestImportSelector.class})
@Configuration
public class ImportConfiguration {

}
