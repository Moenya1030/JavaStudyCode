package lab5;
//People���з���Ȩ����protected��double���ͳ�Ա����height��weight��
//
//�Լ�public void speakHello()��public void averageHeight()��public void averageWeight()������
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
