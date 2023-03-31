package com.zhangwenke.design_pattern.rototype;

import java.io.IOException;

/**
 * 原型模式是指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。调用者不需要知道任何创建细节，不调用构造函数。
 * 原型模式包含如下角色：
 *  -抽象原型类：规定了具体原型对象必须实现的的 clone() 方法。
 *  -具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 *  -访问类：使用具体原型类中的 clone() 方法来复制新的对象
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Clazz clazz = new Clazz();
        Student student = new Student("张三","男",20);
        clazz.setName("克隆");
        clazz.setStudent(student);
        Clazz clone = (Clazz) clazz.clone();
        clazz.getStudent().setName("王五");
        System.out.println("浅克隆：可以看到我们修改了clazz中的Student对象，clone中的Student也跟着修改了");
        System.out.println(clazz.getStudent());
        System.out.println(clone.getStudent());

        //需要注意的是，深克隆中所依赖的对象需要实现Serializable接口，否则NotSerializableException异常

        Clazz clazz1 = new Clazz();
        Student student1 = new Student("张三","男",20);
        clazz1.setName("克隆1");
        clazz1.setStudent(student1);
        Clazz clone1 = (Clazz) clazz1.deepClone();
        clazz1.getStudent().setName("王五");
        System.out.println("深克隆：可以看到我们修改了clazz1中的Student对象，clone1中的Student没有修改了");
        System.out.println(clazz1.getStudent());
        System.out.println(clone1.getStudent());

    }
}
