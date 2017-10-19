package com.leisucn.test.minijavaserver.customer.consumer;

import com.leisucn.test.minijavaserver.customer.Customer;
import com.leisucn.test.minijavaserver.customer.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SL on 2017/10/20.
 */
public class CustomerConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:customer-consumer.xml"});
        context.start();

        CustomerService customerService = (CustomerService) context.getBean("customerService"); // 获取远程服务代理
        Customer customer = customerService.getByName("Anna"); // 执行远程方法

        System.out.println(customer); // 显示调用结果
    }

}
