package com.hadeslee.androidex;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class SecondActivity extends Activity {

	TextView tv = null;
	Button btn = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		tv = (TextView) findViewById(R.id.tv_second);
		btn = (Button) findViewById(R.id.bt_go_main);
		btn.setOnClickListener(listener);
		
		Intent intent = getIntent();
		String u_id = intent.getStringExtra("u_id");
		int u_pw = intent.getIntExtra("u_pw", 0);
		
		tv.setText("u_id : " + u_id + ", u_pw : " + u_pw);
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.bt_go_main:
				
				finish();
				
				break;

			default:
				break;
			}
		}
	};
	
}
