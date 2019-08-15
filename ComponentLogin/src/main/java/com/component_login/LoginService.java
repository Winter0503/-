package com.component_login;

import android.content.Context;
import android.content.Intent;

import com.component.lib.ILoginService;

/**
 * Create by 心跳 on 2019/8/15 20:21
 * Blog : https://mp.csdn.net/
 * escription :
 */
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent=new Intent(context,LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(LoginActivity.EXTRA_TARGET_CLASS,targetClass);
        context.startActivity(intent);
    }

    @Override
    public String getUserId() {
        return null;
    }
}
