package com.leisucn.test.minijavaserver.customer.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SL on 2017/10/20.
 */
public class CustomerProviderMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:customer-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
