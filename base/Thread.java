package java_learn;

import java.util.ArrayList;

public class Test{
	public static void main(String[] args) {
		new MyThread("进程A").start();
		new MyThread("进程C").start();
		new MyThread("进程B").start();
	}
}

class MyThread extends Thread{
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
