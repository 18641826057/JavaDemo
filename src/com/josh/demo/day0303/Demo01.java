package com.josh.demo.day0303;

public class Demo01 {
	
	public static void main(String[] args) {
		int a = 0;
		while(true) {
			try {
				System.out.println("¼ÆÊ±Æ÷£º"+a+"Ãë");
				Thread.sleep(1 * 1000);
				a++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
