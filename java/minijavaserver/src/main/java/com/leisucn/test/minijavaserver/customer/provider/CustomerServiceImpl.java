package com.leisucn.test.minijavaserver.customer.provider;

import com.leisucn.test.minijavaserver.customer.Customer;
import com.leisucn.test.minijavaserver.customer.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SL on 2017/10/20.
 */
public class CustomerServiceImpl implements CustomerService {

    private final Logger logge = LogManager.getFormatterLogger(getClass());

    public Customer getByName(String name) {

        logge.info("get customer by name: %s", name);

        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge((int)(Math.random()*100));
        return customer;
    }
}
