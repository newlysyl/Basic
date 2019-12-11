package day04;

import java.util.Random;
import java.util.Scanner;

//가위바위보 게임
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] rsp = { "가위", "바위", "보" };
		System.out.println("1. 가위      2. 바위        3. 보");
		System.out.println("> ");
		int userChoice = scan.nextInt();
		if (userChoice < 0 || userChoice > 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			int computerChoice = rand.nextInt(3);
			System.out.println("사용자: " + rsp[userChoice]);
			System.out.println("컴퓨터: " + rsp[computerChoice]);
			if (userChoice == computerChoice) {
				System.out.println("비김");
			} else {
				switch (userChoice) {
				case 0:
					if (computerChoice == 1) {
						System.out.println("사용자 패배");
					} else {
						System.out.println("사용자 승리");
					}
					break;
				case 1:
					if (computerChoice == 2) {
						System.out.println("사용자 패배");
					} else {
						System.out.println("사용자 승리");
					}
					break;
				case 2:
					if (computerChoice == 0) {
						System.out.println("사용자 패배");
					} else {
						System.out.println("사용자 승리");
					}
					break;
				}
			}
		}
	}
}