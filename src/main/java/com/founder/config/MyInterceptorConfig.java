package com.founder.config;

import com.founder.interceptors.MyInterceptor;
import com.founder.interceptors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * 拦截器配置类
 *@Configuration自动配置
 */
@Configuration
public class MyInterceptorConfig extends WebMvcConfigurerAdapter {
	//根据自定义拦截类
    @Resource
    private MyInterceptor myInterceptor;

    //覆盖springboot中的默认拦截器方法  注意: springboot中拦截器同样不拦截jsp(真正存在jsp页面才不会拦截) 使用本地main函数启动时拦截jsp
    public void addInterceptors(InterceptorRegistry registry) {//json、product是@RequestMapping("/product")
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**","/json/**","/product/**")
                .excludePathPatterns("/user/aa");
    }


}
