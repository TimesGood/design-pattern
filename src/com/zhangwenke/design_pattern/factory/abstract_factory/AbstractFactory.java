package com.zhangwenke.design_pattern.factory.abstract_factory;

import com.zhangwenke.design_pattern.factory.IPhone;

/**
 * 抽象工厂
 * 抽象工厂的主要角色：
 *  -抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
 *  -具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 *  -抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 *  -具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 */
public interface AbstractFactory {
    IPhone create();
}
