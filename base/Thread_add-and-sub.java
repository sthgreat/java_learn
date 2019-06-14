,package java_learn;


public class Test{
	public static void main(String[] args) {
		Resource res = new Resource();
		AddThread add = new AddThread(res);
		SubThread sub = new SubThread(res);
		new Thread(add, "加法线程 - A").start();
		new Thread(add, "加法线程 - B").start();
		new Thread(sub, "减法线程 - X").start();
		new Thread(sub, "减法线程 - Y").start();
	}
}

class Resource{
	private int num = 0;
	private boolean flag = true;  //flag == true，可执行加法操作；flag == flase， 可执行减法操作
	public synchronized void add() throws Exception {
		if(this.flag==false) {
			super.wait();
		}
			Thread.sleep(100);
			this.num++;
			System.out.println("【加法操作 - " + Thread.currentThread().getName() + " - " + this.num);
			this.flag = false;
			super.notifyAll();
	}
	public synchronized void sub() throws Exception {
		if(this.flag==true) {
			super.wait();
		}
			Thread.sleep(200);
			this.num--;
			System.out.println("【减法操作 - " + Thread.currentThread().getName() + " - " + this.num);
			this.flag = true;
			super.notifyAll();
	}
}

class AddThread implements Runnable{
	Resource resource;
	AddThread(Resource resource){
		this.resource = resource;
	}

	public void run() {
		for(int x = 0; x<50; x++) {
			try {
				this.resource.add();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SubThread implements Runnable{
	Resource resource;
	SubThread(Resource resource){
		this.resource = resource;
	}

	public void run() {
		for(int x = 0;x<50;x++) {
			try {
				this.resource.sub();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
