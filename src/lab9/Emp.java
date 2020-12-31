package lab9;

public class Emp {
		private String num;
		private String word;
		public Emp(String num, String word) 
		{
			this.num = num;
			this.word = word;
		}
		
		public void setNum(String num)
		{
			this.num = num;
		}
		
		public void setWord(String word)
		{
			this.word = word;
		}
		
		public String getNum()
		{
			return this.num;
		}
		
		public String getWord()
		{
			return this.word;
		}
}
