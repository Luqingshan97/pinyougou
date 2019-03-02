package com.itheima.service.Impl;

import com.itheima.service.IAccountService;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements IAccountService{
    public void saveAccount() {
        System.out.println("执行保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行修改");
    }

    public void deleteAccount() {
        System.out.println("执行删除");
    }
}
