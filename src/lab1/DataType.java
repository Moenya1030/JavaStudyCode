package lab1;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int interge=0;
		float floatDecima=2;
		double doubleDecimal=2.0000000000001;
		long longInterge=999999999;
		char charstring='a';
		
		boolean bbb=(1>2);
		System.out.println(bbb);
		
		 if (interge>-1 || interge<=1)
		 {
			 System.out.println("���Ƿϻ�");
		 }
		 else
		 {
			 System.out.println("û��Ҫ");
		 }
		
		 while (floatDecima==doubleDecimal)
		 {
			System.out.println("����ɵ�����");
		 }
		 
		 for (int i=0;i<10;i++)
		 {
			 System.out.println(longInterge);
		 }
		 
		 switch(charstring)
		 {
		 	case 'c':
		 		System.out.println("charstring is c");
		 		break;
		 	case 'a':
		 		System.out.println("charstring is a");
		 		break;
		 }
		 
		 int b=100;
		 do {
			 System.out.println("ok");
			 b--;
		 }while(b==70);
		 
		 int arr[]= {1,2,3,4,5,6,7};
		 for (int x:arr)
		 {
			 System.out.println(x);
		 }
		 
		 for (int i=0;i<20;i++)
		 {
			 if (i%2==0)
			 {
				 continue;
			 }
			 System.out.print(i);
		 }
	}

}
