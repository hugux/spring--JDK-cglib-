package com.bjsxt.invoke;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class InvokeCglib implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("您预约了吗？---cglib");
		Object in = arg3.invokeSuper(arg0, arg2);
		System.out.println("还要登记呢");
		return in;
	}
	
}
