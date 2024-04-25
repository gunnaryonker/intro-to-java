import java.util.Arrays;

public class test {
	public static void main(String args[])
	{
		int score[] = {80, 80, 80, 80, 80, 80};
		System.out.println(Arrays.toString(score));
		//change sixth num to 75
		score[5] = 75;
		//change first num to 92
		score[0] = 92;
		//change third num to 84
		score[2] = 84;
		//print out each in own line
		for(int scoreprint : score)
		{
			System.out.println(scoreprint);
		}
		}
	}
