package com.bjsxt.boss;

import com.bjsxt.function.Function;
import com.bjsxt.function.Function2;

public class Boss implements Function,Function2{

	@Override
	public void eat() {
		System.out.println("ԤԼ�Է���");
	}

	@Override
	public void meet() {
		System.out.println("�����и���Ҫ�Ļ���");
	}
}
