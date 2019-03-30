package van.service.impl;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import van.pojo.User;
import van.service.UserService;

/**
 * 详见http://shiro.apache.org/static/1.4.0/apidocs/org/apache/shiro/realm/AuthorizingRealm.html
 * 只要使用getAuthorizationInfo方法返回AuthorizationInfo,此实现将自动执行所有角色和权限检查，且子类不用编写此逻辑
 * 按文档介绍，在绝大多数Realm案例中，只需要使用AuthorizationInfo及其默认实现SimpleAuthorizationInfo就足够了
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    /**
     * 为当前登陆成功的用户授予权限和角色，已经登陆成功了
     * SimpleAuthorizationInfo为AuthorizationInfo接口的简单POJO实现，它将角色和权限存储为内部属性
     *
     * @param principals 存储各个用户
     * @return 包含roleList和permissionList的对象
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String username = (String) principals.getPrimaryPrincipal();  //获取登录的用户名
//        此处写判断,通过判断赋予不同的权限
//        info.setRoles(null);
//        info.setStringPermissions(null);
        return info;
    }

    /**
     * 在调用subject.login的时候，会进入，和return的info进行匹配
     *
     * @param token token
     * @return 要匹配的用户信息
     * @throws AuthenticationException 授权失败
     */
    @Override
    protected  AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userId = (String) token.getPrincipal();
        User user = userService.getUserByUserId(userId);

        if (user == null) {
            throw new UnknownAccountException();
        }

        String userInputPassword = new String((char[]) token.getCredentials());

        String encryptionUserInputPassword = userService.encryptUserPassword(userInputPassword);

        if (!encryptionUserInputPassword.equals(user.getPassword())) {
            throw new IncorrectCredentialsException();
        }

        String userName = user.getUsername();

        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userId, userInputPassword, userName);

//        SubjectUtil.setSession("user", user);

        return authenticationInfo;
    }
}
