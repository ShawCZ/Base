package com.shaw.base.app;

import android.app.Application;

import com.shaw.core.app.Core;

/**
 * Author by xcz on 2018/12/28 23:30
 */
public class App extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Core.init(this)
				.withApiHost("https://www.baidu.com/")
				.configure();
	}
}
