package lab6;

public class Father extends Attribute{
	Father()
	{
		gender="male";
	}
	public String getGender()
	{
		return this.gender;
	}
	public void say()
	{
		System.out.println("chinese");
	}
	public void drive()
	{
		System.out.println("car");
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
