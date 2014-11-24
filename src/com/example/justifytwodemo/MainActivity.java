package com.example.justifytwodemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	private TextViewEx tvEnglish, tvChinese, tvJapan, tvKorea;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvEnglish = (TextViewEx) findViewById(R.id.txt_english);
		tvEnglish.setText(getString(R.string.english), true);
		
		tvChinese = (TextViewEx) findViewById(R.id.txt_chinese);
		tvChinese.setText(getString(R.string.chinese), true);
		
		tvJapan = (TextViewEx) findViewById(R.id.txt_japan);
		tvJapan.setText(getString(R.string.japan), true);
		
		tvKorea = (TextViewEx) findViewById(R.id.txt_korea);
		tvKorea.setText(getString(R.string.korean), true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
