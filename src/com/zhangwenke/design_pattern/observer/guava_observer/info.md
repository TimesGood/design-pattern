| EventBus术语 | 解释                                             | 备注                                    |
|------------|------------------------------------------------|---------------------------------------|
| 事件（消息）     | 可以向事件总线（EventBus）发布的对象                         | 通常是一个类，不同的消息事件用不同的类来代替，消息内容就是类里面的属性   |
| 订阅         | 向事件总线注册监听者，以接受事件的行为                            | EventBus.register(Object)，参数就是监听者     |
| 监听者        | 提供一个处理方法，希望接受和处理事件的对象                          | 通常也是一个类，里面有消息的处理方法                    |
| 处理方法       | 监听者提供的公共方法，事件总线使用该方法向监听者发送事件；该方法应使用Subscribe注解 | 监听者里面添加一个Subscribe注解的方法，就可以认为是消息的处理方法 |
| 发布消息       | 通过事件总线向所有匹配的监听者提供事件                            | EventBus.post(Object)                 |
```java
public class WeixinUser{
    private String name;
    public WeixinUser(String name){
        this.name = name;
    }
    public void getMessage(Object arg){
        System.out.println(this.name+"接收到消息："+arg);
    }

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new WeixinUser("张三"));
        eventBus.register(new WeixinUser("李四"));
        eventBus.register(new WeixinUser("王五"));
        eventBus.post("薛之谦演唱会要来到广州了");
    }
}
```