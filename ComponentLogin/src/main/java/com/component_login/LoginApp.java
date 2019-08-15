package com.component_login;

import android.app.Application;

import com.component.lib.IAppComponet;
import com.component.lib.ServiceFactory;

/**
 * Create by 心跳 on 2019/8/15 20:38
 * Blog : https://mp.csdn.net/
 * escription :
 */
public class LoginApp extends Application implements IAppComponet {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
