package lab5;

public class Lab5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people peo = new people();
		ChinaPeople chinapeo = new ChinaPeople();
		peo.speakHello();
		peo.weight=1;
		peo.height=1;
		peo.averageWeight();
		peo.averageHeight();
		
		chinapeo.speakHello();
		chinapeo.weight=100;
		chinapeo.height=180;
		chinapeo.averageWeight();
		chinapeo.averageHeight();
		chinapeo.chinakongfu();
		
		System.out.println();
		//向下转型
		people testpeo = (ChinaPeople) chinapeo;
		testpeo.speakHello();
		testpeo.weight=120;
		testpeo.height=180;
		testpeo.averageWeight();
		testpeo.averageHeight();
//		testpeo.chinakongfu(); The method chinakongfu() is undefined for the type people
//		ChinaPeople teschinapeo = (people) peo;  cannot convert from people to ChinaPeople
		
	}

}
