package com.zhangwenke.design_pattern.chain_of_responsibility;

/**
 * 登录业务
 */
public class LoginService {
    public void login(User user){
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(user);
    }
}
