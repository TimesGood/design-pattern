package com.zhangwenke.design_pattern.iterators;

import java.util.ArrayList;
import java.util.List;

/**
 * facebook社交网络
 */
public class Facebook implements SocialNetwork {

    /**
     * 账号列表
     */
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        //模拟网络请请求获取数据
        simulateNetworkLatency();
        System.out.println("Facebook: 通过网络加载 '" + profileEmail + "' 的个人资料完成...");

        //返回加载到的数据
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        //模拟网络请请求获取数据
        simulateNetworkLatency();
        System.out.println("Facebook: 通过网络加载 '" +profileEmail + "的" + contactType + "' 列表完成...");

        //返回加载到的数据
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    /**
     * 模拟网络请求
     */
    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

}
