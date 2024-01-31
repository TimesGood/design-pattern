package com.zhangwenke.design_pattern.iterators;

/**
 * 社交网络接口
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
