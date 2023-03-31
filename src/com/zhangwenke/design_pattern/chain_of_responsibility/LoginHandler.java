package com.zhangwenke.design_pattern.chain_of_responsibility;

/**
 * 校验用户名是否匹配密码
 */
public class LoginHandler extends Handler{
    @Override
    public void doHandler(User user) {
        if(!"test".equals(user.getUsername()) || !"123456".equals(user.getPassword())){
            System.out.println("用户或密码不正确");
            return;
        }
        user.setRole("admin");
        System.out.println("登录成功，角色为管理员");
        next.doHandler(user);
    }

}
