//�����˻���Ϣ
package lab2;
//Ҫ���ܹ�����û����˺š�������������˻����ȸ�����Ϣ����������ȡ���ѯ�����޸��˻�����Ȳ��������ô��ഴ�����󣬶�����˺�Ϊ100������ΪTom������Ϊ11111���˻����Ϊ10000��
public class Lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.setID(100);
		bank.setName("Tom");
		bank.setPwd(111111);
		bank.setAccBalance();
		bank.deposite(1.0);
		System.out.println(bank.getAccBalance());
		System.out.println(bank.getID());
		System.out.println(bank.getName());
	}

}
