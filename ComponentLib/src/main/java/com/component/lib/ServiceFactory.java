package com.component.lib;

/**
 * Create by 心跳 on 2019/8/15 20:26
 * Blog : https://mp.csdn.net/
 * escription :
 */
public class ServiceFactory {
    private static final ServiceFactory ourInstance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return ourInstance;
    }

    private ServiceFactory() {
    }
    private ILoginService loginService;

    public ILoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }
}
