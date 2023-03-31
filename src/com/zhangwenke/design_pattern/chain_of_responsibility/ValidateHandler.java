package com.zhangwenke.design_pattern.chain_of_responsibility;

/**
 * 教养用户名或密码是否为空
 */
public class ValidateHandler extends Handler{
    @Override
    public void doHandler(User user) {
        if(user.getUsername() == null || user.getPassword() == null){
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("校验通过");
        next.doHandler(user);
    }

}
