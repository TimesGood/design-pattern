package com.zhangwenke.design_pattern.proxy.dynamic_proxy.cglib;//package com.student.design_pattern.proxy.dynamic_proxy.cglib;
//
//import com.student.design_pattern.proxy.TrainStation;
//
///**
// * Cglib动态代理
// * 特点是不需要要代理的对象实现接口
// * 依赖：
// *  <dependency>
// *      <groupId>cglib</groupId>
// *      <artifactId>cglib</artifactId>
// *      <version>???</version>
// *  </dependency>
// */
//public class CglibDynamicProxyPoint implements MethodInterceptor {
//    public TrainStation getProxyObject(Class<? extends TrainStation> trainStation){
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(trainStation);
//        enhancer.setCallback(this);
//        return (TrainStation) enhancer.create();
//    }
//
//    @Override
//    public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy){
//        System.out.println("代售火车票收取5%手续费");
//        return methodProxy.invokeSuper(o,objects);
//    }
//}
