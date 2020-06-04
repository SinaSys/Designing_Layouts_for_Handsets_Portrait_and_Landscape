package com.sriyanksiddhartha.multiplescreendemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sriyanksiddhartha.multiplescreendemo.MyCommunicator;
import com.sriyanksiddhartha.multiplescreendemo.R;

/**
 * Author: Sriyank Siddhartha
 *
 * Module5: Designing Layouts Separately for both Smartphones and Tablets
 *
 * 		"BEFORE" project
 */
public class MainActivity extends AppCompatActivity implements MyCommunicator {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public void displayDetails(String title, String description) {

		Intent intent = new Intent(this, DetailActivity.class);
		intent.putExtra("title", title);
		intent.putExtra("description", description);
		startActivity(intent);
	}
}
