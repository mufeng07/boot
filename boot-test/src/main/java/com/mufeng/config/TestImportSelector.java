package com.mufeng.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO
 * @author: mufeng
 * @create: 2020/1/15 11:03
 */
public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.mufeng.bean.bean2"};
    }
}
