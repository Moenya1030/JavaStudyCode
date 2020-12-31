//骰子
//a、骰子类名为Dice，其数值是随机的在1到6之间，具有适当的功能。
//b、每次扔3颗骰子，如果3个骰子的总和大于等于10，则为“大”，总和小于10则为“小”
//c、初始给出10000元的总游戏币，每次投注1000游戏币买“大”或“小”，如果投注成功，则获得投注数的0.8倍收益，失败则投注游戏币被扣除。
//d、测试经过10次投注以后，剩下多少游戏币
package lab3;

import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice0 = new Dice();
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int point;//总点数
		int money = 10000;//本金
		int currency = 1000;//一注1000
		int gambing;//注数*1000
		int total = 0;
		while (money > 1000 && total < 10)
		{
			total += 1;
			System.out.println("请输入你要投的注数：");
			Scanner sc= new Scanner(System.in);
			int num = sc.nextInt();
			gambing = num * currency;
			if (gambing > money)
			{
				System.out.println("没钱就滚！");
				break;
			}
			System.out.println("请输入'大'或'小'：");
			String guess = sc.next();//输入大或小
			point = dice0.roll() + dice1.roll() + dice2.roll();
			if (point >= 10)
			{
				if (guess.equals("大"))
				{
					money += gambing * 0.8;
					System.out.println("您现在有" + money + "啦！！！");
				}
				else if(guess.equals("小"))
				{
					money -= gambing;
					System.out.println("您现在居然还剩" + money + "？");
				}
				else
				{
					System.out.println("您不想玩了是吧？");
					break;
				}
			}
			else 
			{
				if (guess.equals("小"))
				{
					money += gambing * 0.8;
					System.out.println("您现在还有" + money + "块啦");
				}
				else if(guess.equals("大"))
				{
					money -= gambing;
					System.out.println("您现在居然还有" + money + "！！！");
				}
				else
				{
					System.out.println("您不想玩了是吧？");
					break;
				}
			}
		}
		System.out.println("游戏结束，您还剩" + money);
	}

}
