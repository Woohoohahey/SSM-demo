package com.itactic.kaiy.ssm.config;

import com.itactic.kaiy.ssm.entity.Role;
import com.itactic.kaiy.ssm.entity.User;
import com.itactic.kaiy.ssm.model.user.IService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName MyShiroRealm
 * @Description TODO
 * @Author Yk
 * @Data 2019/7/18&14:02
 * @Version 1.0
 **/
@Slf4j
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private  IService userService;

    @Autowired
    private com.itactic.kaiy.ssm.model.role.IService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
        List<Role> roles = roleService.findRolesByUsername(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //创建简单的授权信息
        for(Role role:roles){
        simpleAuthorizationInfo.addRole(role.getName());
        }
        simpleAuthorizationInfo.addStringPermission("获取所有书籍");
        //将获取道德授权信息返回
        return simpleAuthorizationInfo;

    }



    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String) token.getPrincipal();

        //通过token 得到的用户名再到数据库获取用户信息
        User user = userService.findUserByUsername(username);
        //将获取到的用户信息封装到简单的身份验证对象
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUsername()
                ,user.getPassword()
                ,ByteSource.Util.bytes(user.getSalt())
                ,user.getName());
        log.info(simpleAuthenticationInfo.toString());
        return simpleAuthenticationInfo;
    }
}
