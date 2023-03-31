package com.zhangwenke.design_pattern.chain_of_responsibility;

public class AuthHandler extends Handler{
    @Override
    public void doHandler(User user) {
        if(!"admin".equals(user.getRole())){
            System.out.println("无权限操作");
        }
        System.out.println("角色为管理员，可以进行下一步操作");
    }
}
