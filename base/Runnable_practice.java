package java_learn;

import java.util.ArrayList;

public class HappyCinema{
	public static void main(String[] args) {
		cinema c = new cinema(2, "解放电影院");
		new Thread(new customer(c,2,"jsb")).start();
		new Thread(new customer(c,1,"jkl")).start();
	}
}

class customer implements Runnable{
	private cinema c;
	private String name;
	private int ticket_num;
	
	public customer(cinema c, int ticket_num, String name) {
		this.c = c;
		this.ticket_num = ticket_num;
		this.name = name;
	}
	
	public void run() {
		synchronized(c) {
			if(c.booktickets(ticket_num)) {
				System.out.println(name + "购票成功");
				
			}else {
				System.out.println(name + "购票失败");
			}	
		}
	}
	
}

class cinema{
	int available;
	String name;
	public cinema(int available, String name) {
		this.available = available;
		this.name = name;
	}
	
	public boolean booktickets(int seats) {
		System.out.println("可用位置为：" + available);
		if(available>=seats) {
			available -= seats;
			return true;
		}else {
			return false;
		}
	}
}
