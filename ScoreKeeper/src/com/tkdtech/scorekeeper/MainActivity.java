package com.tkdtech.scorekeeper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	int redScore=0;
	int blueScore=0;

	Vibrator v;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		v =(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	}
	

	public void showWinner(View view){
		
		TextView tvr = (TextView) findViewById(R.id.redtotal);
		TextView tvb = (TextView) findViewById(R.id.bluetotal);
		
		if(redScore>blueScore){
			startActivity(new Intent(this, RedWin.class));
			redScore=0;
			blueScore=0;
			tvr.setText("0");
			tvb.setText("0");
		}else if (blueScore>redScore){
			startActivity(new Intent(this, BlueWin.class));
			redScore=0;
			blueScore=0;
			tvr.setText("0");
			tvb.setText("0");
		}else{
			startActivity(new Intent(this, Draw.class));
			redScore=0;
			blueScore=0;
			tvr.setText("0");
			tvb.setText("0");
		}
			
		
		
	}
	
	public void increaseScore(View view){
		int id = view.getId();
		TextView tvr = (TextView) findViewById(R.id.redtotal);
		TextView tvb = (TextView) findViewById(R.id.bluetotal);
		v.vibrate(50);
		switch(id){
		case 2131230722:
			redScore+=1;
			tvr.setText(""+redScore);
			break;
		case 2131230723:
			blueScore+=1;
			tvb.setText(""+blueScore);
			break;
		}
	}
		
	public void decreaseScore(View view){
		int id = view.getId();
		TextView tvr = (TextView) findViewById(R.id.redtotal);
		TextView tvb = (TextView) findViewById(R.id.bluetotal);
		v.vibrate(200);
		switch(id){
		case 2131230724:
			redScore-=1;
			tvr.setText(""+redScore);
			break;
		case 2131230725:
			blueScore-=1;
			tvb.setText(""+blueScore);
			break;
			}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
