package Week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] ch1 = test.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if(i%2!=0) 
			{

				System.out.print(Character.toUpperCase(ch1[i]));
			}
			else
			{
				System.out.print(ch1[i]);
			}

		}

	}

}
