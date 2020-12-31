package lab6;

public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		Son son = new Son();
		father.setAge(40);
		System.out.println("father's age is " +father.getAge());
		System.out.println("father's gender is " + father.getGender());
		father.setName("father");
		System.out.println("father's name is " + father.getName());
		father.say();
		father.drive();
		son.setAge(18);
		System.out.println("son's age is " + son.getAge());
		System.out.println("son's gender is " + son.getGender());
		son.setName("son");
		System.out.println("son's name is " + son.getName());
		son.say();
		son.drive();
		//向下转型
		Attribute att = new Father();
		att.say();
		
		//Father fat = new Attribute(); 
		//抽象类不能实例化，所以不能向下转型
	}

}
