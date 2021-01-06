package com;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //注解元信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //类元信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //资源信息，包括路径
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        //若类名中包含er则返回true，被过滤掉
        return className.contains("er");
    }
}
