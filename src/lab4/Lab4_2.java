//包装类
//尝试使用各种包装类，包括Integer、Boolean、Byte、Character、Double。
//要求创建这些包装类的实例，并分别测试至少3种方法的使用。

package lab4;

public class Lab4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = new Integer(777);
		Integer numString = new Integer("7");
		System.out.println(num.byteValue()); // -127~128 
		String numstr[] = {"11", "12", "13"};
		int sum = 0;
		for (int i = 0; i < numstr.length; i++)
		{
			int myint = Integer.parseInt(numstr[i]);
			sum += myint;
		}
		System.out.println(sum);
		int maxint = Integer.MAX_VALUE;
		int minint = Integer.MIN_VALUE;
		System.out.println(maxint + " " + minint);
		
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("nice");
		System.out.println(boolean1.equals(boolean2));
		Boolean boolean3 = Boolean.FALSE;
		String str = boolean3.toString();
		System.out.println(str.equals("false"));
		Boolean boolean4 = Boolean.parseBoolean(str);
		System.out.println(boolean4);
		
		byte mybyte = 21;
		Byte byte1 = new Byte(mybyte);
		Byte byte2 = new Byte("12");
		Byte byte3 = byte2.byteValue();
		int bytecmp = byte1.compareTo(byte3);
		System.out.println(bytecmp);//21-12=9
		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;
		System.out.println(bytemax + " " +bytemin);
		
		Character ch =  new Character('s');
		Character ch1 = new Character('b');
		int scpmb = ch.compareTo(ch1);
		System.out.println(scpmb);// 's' - 'b' = 17
		Boolean b1 = new Boolean(ch.isUpperCase(ch));
		Boolean b2 = ch1.isLowerCase(ch1);
		System.out.println(b1.equals(b2));
		String st1 = ch.toString();
		String st2 = (ch1).toString();
		System.out.println(st1.equalsIgnoreCase(st2));
		
		Double dbl = new Double(3.14159);
		Double dbl1 = new Double("3.14159");
		Double dbl2 = dbl1.doubleValue();
		System.out.println(dbl.equals(dbl2));
		double dblmax = Double.MAX_VALUE;
		double dblmin = Double.MIN_VALUE;
		double dblmaxe = Double.MAX_EXPONENT;
		double dblmine = Double.MIN_EXPONENT;
		double dblnegi = Double.NEGATIVE_INFINITY;
		double dblposi = Double.POSITIVE_INFINITY;
		System.out.println(dblmax + " " + dblmin + " " + dblmaxe +" " + dblmine + " " + dblnegi + " " + dblposi);
	}

}
