package com.zhangwenke.design_pattern.chain_of_responsibility;

/**
 * 抽象处理者（Handler）角色
 * @param <T>
 */
public abstract class Handler<T> {
    protected Handler<T> next;

    /**
     * 下一个处理操作
     * 返回Handler方便链式调用
     * @param next
     * @return
     */
    public Handler<T> next(Handler<T> next){
        this.next = next;
        return next;
    }

    /**
     * 流程开始的地方
     * @param user
     */
    public abstract void doHandler(User user);

    /**
     * 配合建造者模式
     * @param <T>
     */
    static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;
        public Builder<T> addHandler(Handler<T> handler){
            if(this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;

        }
        public Handler<T> build(){
            return this.head;
        }
    }
}
