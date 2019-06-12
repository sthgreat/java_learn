package java_learn;

import java.util.ArrayList;

public class Test{
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread("线程A"));
		Thread thread2 = new Thread(new MyThread("线程B"));
		Thread thread3 = new Thread(new MyThread("线程C"));
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread implements Runnable{
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	
	public void run() {
		for(int x = 0; x<10; x++) {
			System.out.println(title +","+ x);
		}
	}
}
