package com.darren.center.springboot.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 自定义密码比较器
 */
public class Md5PasswordEncoder implements PasswordEncoder{

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence);
    }
}
