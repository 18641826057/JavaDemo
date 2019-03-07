package com.josh.demo.day0303;

public class Demo01 {
	
	public static void main(String[] args) {
		int a = 0;
		int time = 20;		//设置计时器的秒数
		while(true) {
			try {
				System.out.println("计时器："+a+"秒");
				Thread.sleep(1 * 1000);
				a++;
				if(a == time) {
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//计时器完毕后往下执行
		System.out.println("计时器结束！.....");
	}

}
