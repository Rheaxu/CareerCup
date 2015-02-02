package epic;

public class CowsBullsGame {

	
	public static void main(String[] args)
	{
		String a = "hello";
		int[] counts = new int[256];
		char[] chars = a.toCharArray();
		for(int i = 0;i<chars.length;i++)
		{
			counts[chars[i]]++;
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		for(int i=0;i<counts.length;i++)
		{
			System.out.print(counts[i]+" ");
		}
	}
}
