package com.component.lib;

import android.content.Context;

/**
 * Create by 心跳 on 2019/8/15 20:17
 * Blog : https://mp.csdn.net/
 * escription :
 */
public interface ILoginService {
    void launch(Context context,String targetClass);
    String getUserId();
}
