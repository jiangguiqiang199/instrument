package com.creditease.math;


public class TestAdd {

	public int add (int a,int b) throws InterruptedException{
		Thread.sleep(10000);
		System.out.println("Test.add("+a+","+b+")="+(a+b));
		return a+b;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("进入了目标方法类==============");
		System.out.println("输入的字符串是："+args[0]+"|"+args[1]);
		TestAdd testAdd = new TestAdd();
		testAdd.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}

}
