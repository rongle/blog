package com.hdl.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
//@EnableWebMvc
public class WebSecurityConfig implements WebMvcConfigurer {

    public final static String SESSION_KEY = "user";

    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }


//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
//
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());

        // 排除配置
        addInterceptor.excludePathPatterns("/admin/**");
        addInterceptor.excludePathPatterns("/login");
        addInterceptor.excludePathPatterns("/getCode");

        addInterceptor.excludePathPatterns("/**/*.css");
        addInterceptor.excludePathPatterns("/**/*.js");
        addInterceptor.excludePathPatterns("/**/*.json");
        addInterceptor.excludePathPatterns("/**/*.jpg");
        addInterceptor.excludePathPatterns("/**/*.png");


        // 拦截配置
        addInterceptor.addPathPatterns("/**");
    }


    private class SecurityInterceptor extends HandlerInterceptorAdapter {

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                throws Exception {
            System.out.println("拦截到");
            HttpSession session = request.getSession();

            if (session.getAttribute(SESSION_KEY) != null) {
                return true;
            }

            response.sendRedirect("/login");

            return false;


        }
    }
}
