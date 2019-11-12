package com.qf.realm;

import com.qf.dao.UserMsgMapper;
import com.qf.domain.UserMsg;
import com.qf.service.UserLoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserMsgMapper userMsgMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();

       /* String principal = (String) principals.getPrimaryPrincipal();
        User uname = userRepository.findByUname(principal);
        if(uname.getQaunxian()==1||uname.getQaunxian()==2){
            authorizationInfo.addStringPermission("管理员");
            authorizationInfo.addStringPermission("超级管理员");
        }*/
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String principal = (String) token.getPrincipal();
        System.out.println(principal);
        UserMsg byMail = userMsgMapper.findByMail(principal);//邮箱登录情况
        UserMsg byPhone = userMsgMapper.findByPhone(principal);//手机号码登录情况
        if(byMail!=null){
            SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(principal,byMail.getUserPass(),getName());
            return authenticationInfo;
        }
        else if(byPhone!=null){
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal, byPhone.getUserPass(), getName());
            System.out.println(byPhone.getUserPass());
            return simpleAuthenticationInfo;
        }
        return null;
    }
}
