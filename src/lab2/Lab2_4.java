//银行账户信息
package lab2;
//要求能够存放用户的账号、姓名、密码和账户余额等个人信息，并包含存款、取款、查询余额和修改账户密码等操作，并用此类创建对象，对象的账号为100，姓名为Tom，密码为11111，账户余额为10000。
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
