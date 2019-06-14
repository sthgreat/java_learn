package java_learn;


public class Test{
	public static void main(String[] args) {
		Resource res = new Resource();
		producer pro = new producer(res);
		Consumer con = new Consumer(res);
		new Thread(pro).start();
		new Thread(con).start();
		
	}
}

class Computer{
	private static int num = 0;
	private double price;
	private String name;
	public Computer(String name,double price) {
		this.name = name;
		this.price = price;
		num++;
	}
	public String toString() {
		return "第" + this.num + "台电脑，牌子：" + name + "，价格：" + price;
	}
}

class Resource{
	private boolean flag = true;//falg == true,该生产；flag==false，该取走
	
	public synchronized void make() throws Exception {
		if(flag == false) {
			super.wait();
		}
		Thread.sleep(100);
		Computer c = new Computer("宏碁", 1000);
		System.out.println("生产" + c.toString());
		flag = false;
		super.notifyAll();
	}
	public synchronized void get() throws Exception {
		if(flag == true) {
			super.wait();
		}
		Thread.sleep(200);
		Computer c = new Computer("宏碁", 1000);
		System.out.println("消费" + c.toString());
		flag = true;
		super.notifyAll();
	}
}

class producer implements Runnable{
	private Resource res;
	public producer(Resource res) {
		super();
		this.res = res;
	}

	@Override
	public void run() {
		try {
			for(int i = 0;i<20;i++) {
				res.make();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable{
	private Resource res;
	public Consumer(Resource res) {
		super();
		this.res = res;
	}

	@Override
	public void run() {
		try {
			for(int i = 0;i<20;i++) {
				res.get();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
