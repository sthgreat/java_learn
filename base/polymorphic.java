package java_learn;

public class test {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.work();
		}else {
			Dog d = (Dog)a;
			d.work();
		}
	}
}

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{

	public void eat() {
		System.out.println("eat fish");
	}
	
	public void work() {
		System.out.println("catch mice");
	}
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("eat 骨头");
	}
	
	public void work() {
		System.out.println("watch the door");
	}
}
