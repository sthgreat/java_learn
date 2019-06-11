package java_learn;

import java.util.ArrayList;

public class Test{
	public static void main(String[] args) {
		PetShop shop = new PetShop();
		shop.add(new Dog("大黄狗","黄色"));
		shop.add(new Cat("波斯猫","蓝黑色"));
		shop.add(new Dog("藏獒","灰色"));
		shop.add(new Cat("大头猫","黄褐色"));
		shop.add(new Dog("流浪狗","蓝色"));
		Object[] result = shop.search("蓝").toArray();
		for(Object obj : result) {
			System.out.println(obj);
		}
	}
}

interface Pet{  //宠物的标准
	public String getName();
	public String getColor();
}

class Cat implements Pet{
	private String name;
	private String color;

	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		
		return color;
	}
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Cat)) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		Cat cat = (Cat) obj;
		return this.name.equals(cat.getName()) && this.color.equals(cat.getColor());
	}
	public String toString() {
		return("[宠物狗]，" + "名字：" + this.name + "，颜色：" + this.color);
	}
}

class Dog implements Pet{
	private String name;
	private String color;

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		
		return color;
	}
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Cat)) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		Dog dog = (Dog) obj;
		return this.name.equals(dog.getName()) && this.color.equals(dog.getColor());
	}
	
	public String toString() {
		return("[宠物狗]，" + "名字：" + this.name + "，颜色：" + this.color);
	}
}

class PetShop{  //宠物商店，保存多个宠物信息
	private ArrayList<Pet> allPets = new ArrayList<Pet>();
	public void add(Pet pet) {
		this.allPets.add(pet);
	}
	public void delete(Pet pet) {
		this.allPets.remove(pet);
	}
	public ArrayList<Pet> search(String keyword) {
		ArrayList<Pet> Searchresult = new ArrayList<Pet>(); //保存查询结果
		Object[] result = this.allPets.toArray(); //获取全部数据
		if(result!=null) {
			for(Object obj : result) {
				Pet pet = (Pet) obj;
				if(pet.getName().contains(keyword) || pet.getColor().contains(keyword)) {
					Searchresult.add(pet);
				}
			}
		}
		return Searchresult;
	}
}
