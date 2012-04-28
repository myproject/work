package com.pocketdigi.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class activity2 extends Activity {
	Button bt2;
	Button bt4;
	Button bt6;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        /*new Handler().postDelayed(new Runnable() {
            @Override 
            public void run() { 
                    Intent mainIntent = new Intent(activity2.this,main.class); 
                    activity2.this.startActivity(mainIntent); 
                    activity2.this.finish(); 
                    //overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                    //overridePendingTransition(R.anim.zoomin, R.anim.zoomout); 
            } 
        }, 3000);*/
        bt2=(Button)findViewById(R.id.bt2);
        bt4=(Button)findViewById(R.id.bt4);
        bt6=(Button)findViewById(R.id.bt6);
        bt2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(activity2.this,main.class);
				startActivity(intent);
				//overridePendingTransition(R.anim.a2,R.anim.a1);
				//overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
				overridePendingTransition(R.anim.define_left,R.anim.define_left_out);
				finish();
			}
        	
        });
        bt4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(activity2.this,main.class);
				startActivity(intent);
				//overridePendingTransition(R.anim.a2,R.anim.a1);
				//overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
				overridePendingTransition(R.anim.define_right, R.anim.define_right_out);
				finish();
			}
        	
        });
        bt6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(activity2.this,main.class);
				startActivity(intent);
				//overridePendingTransition(R.anim.a2,R.anim.a1);
				//overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
				overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
				finish();
			}
        	
        });
    }
}
