package com.founder.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

//@Configuration  springboot 自动配置注解
@Configuration
public class FastJSONConfig {
    /**
     * 用来生成FastjsonHttpMessageConverts  HttpMessagConvert
     */
    @Bean
    public HttpMessageConverters getFastJSONHttpMessageConvert(){
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //创建fastjson的配置对象
         //FastJsonConfig fastJsonConfig = new FastJsonConfig();
        // fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);//漂亮的打印json格式
        // 处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);

        //修改响应类型
        fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);//注入修改的响应mediaType设置

      //  fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);//注入fastjson配置

        return  new HttpMessageConverters(fastJsonHttpMessageConverter,fastJsonHttpMessageConverter);
    }


}
