package com.example;

import android.app.Application;

import com.component.lib.AppConfig;
import com.component.lib.IAppComponet;

/**
 * Create by 心跳 on 2019/8/15 20:30
 * Blog : https://mp.csdn.net/
 * escription :
 */
public class App extends Application implements IAppComponet {
    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        for (String component: AppConfig.COMPONENTS) {
            try {
                Class<?> clazz=Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponet){
                   ((IAppComponet) object).initialize(app);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
