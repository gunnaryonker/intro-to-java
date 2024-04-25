
public class SummationCalc {
	public static void main(String args[]) {
		
		int sum =0;
		int num =0;
		final int START = 1;
		final int END = 100;
		for (num = START; num <= END; num++) {
			sum = sum + num;
			System.out.println(sum);
		}
		
	}
}
