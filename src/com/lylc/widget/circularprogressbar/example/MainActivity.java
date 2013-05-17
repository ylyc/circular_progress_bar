/*
 * Copyright 2013 Leon Cheng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lylc.widget.circularprogressbar.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.lylc.widget.circularprogressbar.example.CircularProgressBar.ProgressAnimationListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CircularProgressBar c1 = (CircularProgressBar) findViewById(R.id.circularprogressbar1);
		c1.setProgress(45);
		
		final CircularProgressBar c2 = (CircularProgressBar) findViewById(R.id.circularprogressbar2);
		c2.animateProgressTo(0, 77, new ProgressAnimationListener() {
			
			@Override
			public void onAnimationStart() {				
			}
			
			@Override
			public void onAnimationProgress(int progress) {
				c2.setTitle(progress + "%");
			}
			
			@Override
			public void onAnimationFinish() {
				c2.setSubTitle("done");
			}
		});
		
		CircularProgressBar c3 = (CircularProgressBar) findViewById(R.id.circularprogressbar3);
		c3.setTitle("June");
		c3.setSubTitle("2013");
		c3.setProgress(42);
		
		CircularProgressBar c4 = (CircularProgressBar) findViewById(R.id.circularprogressbar4);		
		c4.setProgress(99);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
