package com.ithiema;

import com.itheima.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService acimpl = ac.getBean(IAccountService.class, "AccountServiceImpl");
        acimpl.deleteAccount();
        acimpl.saveAccount();
        acimpl.updateAccount(1);
    }

}
