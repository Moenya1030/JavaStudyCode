//����
//a����������ΪDice������ֵ���������1��6֮�䣬�����ʵ��Ĺ��ܡ�
//b��ÿ����3�����ӣ����3�����ӵ��ܺʹ��ڵ���10����Ϊ���󡱣��ܺ�С��10��Ϊ��С��
//c����ʼ����10000Ԫ������Ϸ�ң�ÿ��Ͷע1000��Ϸ���򡰴󡱻�С�������Ͷע�ɹ�������Ͷע����0.8�����棬ʧ����Ͷע��Ϸ�ұ��۳���
//d�����Ծ���10��Ͷע�Ժ�ʣ�¶�����Ϸ��
package lab3;

import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice0 = new Dice();
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int point;//�ܵ���
		int money = 10000;//����
		int currency = 1000;//һע1000
		int gambing;//ע��*1000
		int total = 0;
		while (money > 1000 && total < 10)
		{
			total += 1;
			System.out.println("��������ҪͶ��ע����");
			Scanner sc= new Scanner(System.in);
			int num = sc.nextInt();
			gambing = num * currency;
			if (gambing > money)
			{
				System.out.println("ûǮ�͹���");
				break;
			}
			System.out.println("������'��'��'С'��");
			String guess = sc.next();//������С
			point = dice0.roll() + dice1.roll() + dice2.roll();
			if (point >= 10)
			{
				if (guess.equals("��"))
				{
					money += gambing * 0.8;
					System.out.println("��������" + money + "��������");
				}
				else if(guess.equals("С"))
				{
					money -= gambing;
					System.out.println("�����ھ�Ȼ��ʣ" + money + "��");
				}
				else
				{
					System.out.println("�����������ǰɣ�");
					break;
				}
			}
			else 
			{
				if (guess.equals("С"))
				{
					money += gambing * 0.8;
					System.out.println("�����ڻ���" + money + "����");
				}
				else if(guess.equals("��"))
				{
					money -= gambing;
					System.out.println("�����ھ�Ȼ����" + money + "������");
				}
				else
				{
					System.out.println("�����������ǰɣ�");
					break;
				}
			}
		}
		System.out.println("��Ϸ����������ʣ" + money);
	}

}
