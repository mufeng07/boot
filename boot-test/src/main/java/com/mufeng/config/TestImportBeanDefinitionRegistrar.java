package com.mufeng.config;

import com.mufeng.bean.Bean3;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/15 11:06
 */
public class TestImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Bean3.class);
        beanDefinitionRegistry.registerBeanDefinition("Bean3",rootBeanDefinition);
    }
}
