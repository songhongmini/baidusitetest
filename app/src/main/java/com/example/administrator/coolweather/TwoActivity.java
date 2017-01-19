package com.example.administrator.coolweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/1/18.
 */

public class TwoActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Button two = (Button)findViewById(R.id.obtion);
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(TwoActivity.this,ThreeActivity.class);
                startActivity(intent);
                finish();
            }
        }

        );
    }


}
