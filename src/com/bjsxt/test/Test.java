package com.bjsxt.test;

import java.lang.reflect.Proxy;

import com.bjsxt.boss.Boss;
import com.bjsxt.function.Function;
import com.bjsxt.function.Function2;
import com.bjsxt.invoke.Invoke;
import com.bjsxt.invoke.InvokeCglib;
import com.bjsxt.secretary.Secretary;

import net.sf.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) {
		Boss b = new Boss();
		b.eat();
		System.out.println("=========静态代理===========");
		Secretary s = new Secretary();
		s.eat();
		System.out.println("=========JDK动态代理===========");
		Function2 f = (Function2) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Function.class,Function2.class}, new Invoke());
		f.meet();
		System.out.println("==========cglib动态代理==============");
		Enhancer en=new Enhancer();
		en.setSuperclass(Boss.class);
		en.setCallback(new InvokeCglib());
		Boss b2= (Boss) en.create();
		b2.eat();
	}
}