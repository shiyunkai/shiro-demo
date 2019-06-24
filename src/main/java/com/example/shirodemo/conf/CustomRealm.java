package com.example.shirodemo.conf;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 13:59
 * @Description:
 */
@Component
public class CustomRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("----------认证方法 doGetAuthorizationInfo方法执行--------------");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("----------授权方法 doGetAuthenticationInfo方法执行--------------");
        return null;
    }
}
