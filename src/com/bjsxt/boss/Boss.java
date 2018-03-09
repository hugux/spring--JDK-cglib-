package com.bjsxt.boss;

import com.bjsxt.function.Function;
import com.bjsxt.function.Function2;

public class Boss implements Function,Function2{

	@Override
	public void eat() {
		System.out.println("预约吃饭！");
	}

	@Override
	public void meet() {
		System.out.println("下午有个重要的会议");
	}
}
