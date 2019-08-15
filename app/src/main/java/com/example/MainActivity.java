package com.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.component.lib.ServiceFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button tologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tologin = (Button) findViewById(R.id.tologin);

        tologin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tologin:
                ServiceFactory.getInstance().getLoginService().launch(this,"");
                break;
        }
    }
}
