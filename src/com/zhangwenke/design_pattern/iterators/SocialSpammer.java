package com.zhangwenke.design_pattern.iterators;

/**
 * 消息发送应用
 */
public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    /**
     * 发送信息给朋友
     * @param profileEmail 邮箱地址
     * @param message 消息体
     */
    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\n在列表中迭代查找朋友...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    /**
     * 发送信息给同事
     * @param profileEmail 邮箱地址
     * @param message 消息体
     */
    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\n在列表中迭代查找同事...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
