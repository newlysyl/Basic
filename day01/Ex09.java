package day01;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("-----5번-----");
		for (int i = 1; i <= 5; i++) {
			String starPrint = "";
			for (int j = 1; j <= 5 - i; j++) {
				starPrint += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				starPrint += "*";
			}
			System.out.println(starPrint);
		}

		System.out.println("-----6번-----");
		for (int i = 5; i >= 1; i--) {
			String starPrint = "";
			for (int j = 1; j <= 5 - i; j++) {
				starPrint += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				starPrint += "*";
			}
			System.out.println(starPrint);
		}

		System.out.println("-----7번-----");
		for (int i = 1; i <= 5; i++) {
			String starPrint = "";
			for (int j = 1; j <= i; j++) {
				starPrint += "*";
			}
			System.out.println(starPrint);
		}
		for (int i = 2; i <= 5; i++) {
			String starPrint = "";
			for (int j = i; j <= 5; j++) {
				starPrint += "*";
			}
			System.out.println(starPrint);
		}

		System.out.println("----8번----");
		for (int i = 1; i <= 2 * 5 - 1; i++) {
			String printStar = "";
			if (i < 5) {

				for (int j = i; j <= 5 - 1; j++) {
					printStar += " ";
				}
				for (int j = 1; j <= i; j++) {

					printStar += "*";
				}
			} else {
				int ii = i - 5 + 1;

				for (int j = 1; j <= ii - 1; j++) {
					printStar += " ";
				}

				for (int j = ii; j <= 5; j++) {
					printStar += "*";
				}
			}
			System.out.println(printStar);
		}

		System.out.println("----9번----");
		for (int i = 1; i <= 2 * 5 - 1; i++) {
			String printStar = "";
			if (i < 5) {
				
				for (int j = 1; j <= 5 - i; j++) {
					printStar += " ";
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					printStar += "*";
				}
			} else {
				
				int ii = i - 5 + 1;
				for (int j = 1; j <= ii - 1; j++) {
					printStar += " ";
				}
				for (int j = 1; j <= 2 * (5 - ii) + 1; j++) {
					printStar += "*";

				}
			}
			System.out.println(printStar);
		}

		System.out.println("----10번----");

		for (int i = 1; i <= 2 * 5 - 1; i++) {
			String printStar = "";
			if (i == 1 || i == 2 * 5 - 1) {
				for (int j = 1; j <= 2 * 5 - 1; j++) {
					printStar += "*";
				}
			} else if (i < 5) {
				int ii = i - 1;

				for (int j = 1; j <= 5 - ii; j++) {
					printStar += "*";
				}
				for (int j = 1; j <= ii * 2 - 1; j++) {
					printStar += " ";
				}
				for (int j = 1; j <= 5 - ii; j++) {
					printStar += "*";
				}
			} else {
				int ii = i - 5 + 1;
				for (int j = 1; j <= ii; j++) {
					printStar += "*";
				}
				int space = 2 * (5 - ii) - 1;
				for (int j = 1; j <= space; j++) {
					printStar += " ";
				}
				for (int j = 1; j <= ii; j++) {
					printStar += "*";
				}
			}
			System.out.println(printStar);

		}

	}

}