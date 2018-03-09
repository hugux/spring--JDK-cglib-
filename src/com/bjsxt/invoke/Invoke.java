package com.bjsxt.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.bjsxt.boss.Boss;


public class Invoke implements InvocationHandler{
	Boss  b = new Boss();
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ÄúÓÐÔ¤Ô¼Âð£¿");
		Object obj = method.invoke(b, args);
		System.out.println("µÇ¼ÇÅ¶");
		return obj;
	}
	
}
