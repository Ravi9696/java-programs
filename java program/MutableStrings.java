public class MutableStrings 
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer();
		
		sb.append("Mr.");
		sb.append(" Ravi");
		sb.append(" Kumar");
                sb.append("Reddy");
		
		System.out.println("String Buffer:"+sb);
		
		StringBuilder sb1=new StringBuilder();
		
		sb1.append("Mr.");
		sb1.append(" Vinod");
		sb1.append(" Kumar");
		
		System.out.println("String Builder:"+sb1);
	}
	
}