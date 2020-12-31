package lab5;
//People类有访问权限是protected的double类型成员变量height和weight，
//
//以及public void speakHello()、public void averageHeight()和public void averageWeight()方法。
public class people {
	protected double height;
	protected double weight;
	public void speakHello()
	{
		System.out.println("Hello!");
	}
	public void averageHeight()
	{
		System.out.println("i dont know what this func avgHeight() does");
		System.out.println(this.height);
	}
	public void averageWeight()
	{
		System.out.println("i dont know what this func avgWeight() does");
		System.out.println(this.weight);
	}
}
