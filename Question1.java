package Question1;

public class Question1 {

	public static void main(String[] args) {
		int rows = 5;
		int stars = 1;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j>= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k<= stars; k++) {
				System.out.print("*");
			}

			stars = stars + 2;
			System.out.println();
		}
	}

}
