package epic;

public class NumberPerm {
	public static void main(String[] args) {		
		print("", "0123456789", 4);
	}
	
	private static void print(String res, String digits, int n) {
		if (n == 0)
			System.out.println(res);
		
		for (int i = 0; i < digits.length(); ++i) {
			print(res + digits.charAt(i),
					digits.replace(String.valueOf(digits.charAt(i)), ""),
					n - 1);
		}
	}
}
