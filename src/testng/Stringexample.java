package testng;

public class Stringexample {
	public void Stringex()
	{
		String s1="Maktum";
		String s2="Kadadi";
		for(int i=0;i<10000;i++)
		{
			s2=s1+s2;
		}
		
		
	}
	public void StringBufferex()
	{
		StringBuffer s2=new StringBuffer("maktum");
		String s1="MKadadi";
		for(int i=0;i<10000;i++)
		{
			s2.append(s1);
		}
		
		
	}

}
