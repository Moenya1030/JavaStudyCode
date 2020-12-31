package lab3;
//测试使用String类的常用方法，包括构造、获取长度length、查找indexof、
//返回字符charAt、获取子串substring、
//去除空格trim、替换replace、相等equal、
//比较compareTo、分割split等。
public class Lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = {'h', 'e', 'l', 'l', 'o'};
		String s1 = new String(a);
		System.out.println(s1);
		
		char b[] = {'h', 'e', 'l', 'l', 'o'};
		String s2 = new String(b,1,3);
		System.out.println(s2);
		
		String str1, str2;
		str1 = "hello world";
		str2 = "hello world";
		System.out.println(str1);
		System.out.println(str2);
		
		int len1, len2;
		len1 = str1.length();
		len2 = str2.length();
		if (len1 == len2)
			System.out.println("the length of string is " + len1);
		
		int size;
		size = str1.indexOf("ll");
		System.out.println("the location of" + "ll is " + size);
		
		String strstr = "asdadaafswarafasdadqwrrffas";
		int locationFOfStrstr = strstr.lastIndexOf("f");
		System.out.println("the last location of" + "f is "+ locationFOfStrstr);
		char theChar;
		theChar = strstr.charAt(12);
		System.out.println("the char in index of 12 is " + theChar);
		String substr1, substr2;
		substr1 = strstr.substring(4);
		substr2 = strstr.substring(3, 22);
		System.out.println("substr1= " + substr1);
		System.out.println("substr2= " + substr2);
		
		String str_ = " ab cd ef ";
		System.out.println("the length of str_ = " + str_.length());
		System.out.println("the length of str_ = " + str_.trim().length());
		String newStr = str_.replace(' ', 'c');
		System.out.println(newStr);
		
		String numStr = "1122334455";
		boolean a1 = numStr.startsWith("11");
		boolean a2 = numStr.endsWith("45");
		System.out.println("Does the numStr start with 11? " + a1);
		System.out.println("Does the numStr end with 45? " + a2);
		
		String strr1 = new String("i love u");
		String strr2 = new String("i love u");
		boolean b1 = (strr1 == strr2);
		System.out.println("strr1 == strr2 " + b1);
		boolean b2 = strr1.equals(strr2);
		System.out.println("strr1 == strr2 " + b2);
		String strr3 = new String("I LOVE U");
		boolean b3 = strr1.equals(strr3);
		System.out.println("strr1 == strr3 " + b3);
		boolean b4 = strr1.equalsIgnoreCase(strr3);
		System.out.println("strr1 == strr3 " + b4);
		
		String comstr1 = "a";
		String comstr2 = "b";
		System.out.println(comstr1 + "compare to " + comstr2 + " " +comstr1.compareTo(comstr2));
	
		String lowerstr = "abcd";
		String upperstr = "ABCD";
		lowerstr.toUpperCase();
		boolean t1 = lowerstr.equals(upperstr);
		System.out.println("lowerstr is equal to upperstr " + t1);
		upperstr.toLowerCase();
		boolean t2 = upperstr.equals(lowerstr);
		System.out.println("lowerstr is equal to upperstr " + t2);
		// 为什么这两个变换大小写的函数没用，一定要有个对象吗
		
		String splitstr = "192.169.0.1";
		String firstArray[] = splitstr.split("\\.");
		String secondArray[] = splitstr.split("\\.", 2);
		System.out.println("splitstr == " + splitstr);
		for (String s : firstArray)
		{
			System.out.print("[" + s + "]");
		}
		System.out.println();
		for (String s : secondArray)
		{
			System.out.print("[" + s + "]");
		}
		System.out.println();
		
	}

}
