package com.example.shirodemo.conf;

import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 14:56
 * @Description:
 */
public class JWTFilter extends AccessControlFilter {
    // 有请求进来就会执行的方法
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    // isAccessAllowed返回值为false时才会执行的方法
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
