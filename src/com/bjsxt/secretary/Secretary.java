package com.bjsxt.secretary;

import com.bjsxt.boss.Boss;

public class Secretary {
	Boss b = new Boss();
	public void eat() {
		System.out.println("您预约了吗？");
		b.eat();
		System.out.println("登记时间");
	}
}
