package com.zhangwenke.design_pattern.iterators;

public interface ProfileIterator {
    /**是否存在下一个*/
    boolean hasNext();

    /**获取下一个数据**/
    Profile getNext();

    /**重置**/
    void reset();
}
