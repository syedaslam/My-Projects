package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test{
	private int x=10;
	private void show() {
		System.out.println("this is private method......!");
	}
}

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		
		//creating an object by using class.forName().
		Class  cls=Class.forName("com.reflection.Test");
		Test   test =(Test)cls.newInstance();
		
		//getting the declared method 
		Method method=cls.getDeclaredMethod("show", null);
		
		method.setAccessible(true);
		//invoking the method using invoke() method
		method.invoke(test, null);
		
		//getting the declared field 
		Field field = cls.getDeclaredField("x");
		
		field.setAccessible(true);
		
		//accessing the x value 
		int x=(int)field.get(test);
		
		System.out.println("the value of x : "+x);
	}

}
