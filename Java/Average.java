import java.io.*;
import java.util.*;
class Average
{
	public static void main(String...args)
	{
		Console c=System.console();
		ArrayList<Integer> marks=new ArrayList<>();
		String res=c.readLine("Would u like to enter marks? y/n: ");
		while(res.equals("y"))
		{
			int m=Integer.parseInt(c.readLine("Enter marks: "));
			marks.add(m);
			res=c.readLine("Would u like to enter more? y/n:");
		}
		System.out.println(marks);
	
		int sum=0;
		for(Integer i:marks)
			sum+=i;
		
		int avg=sum/marks.size();
		System.out.println("Average marks: "+avg);
	}
}