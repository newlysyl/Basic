package day04;

import java.util.Scanner;

//Chapter 4. 조건문과 반복문
//1. if 문
//2. if-else 문
//3. if-else if-else 문
//4. 중첩 if 문
//5. switch 문
//6. for 문
//7. while 문
//8. do-while 문
//9. break 문
//10. continue 문
public class 조건문과반복문 {
	public static void main(String[] args) {

		// 1. if 문
		// 조건식이 true면 실행, false면 실행하지 않는다.
		int score = 93;
		if (score >= 90) { // 조건식
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다."); // { } : 실행문
			// { } 중괄호는 여러 개의 실행문을 하나로 묶을 때 사용.
			// 만약 조건식이 true가 될 때 실행할 문장이 하나뿐이면 생략 가능하지만,
			// 가독성이나 버그 등의 요소를 고려하여 쓰는 것이 좋다.

			// 2. if-else 문
			// 조건식이 true면 if 문이 실행되고,
			// 조건식이 false면 else 문이 실행된다.
			int score2 = 85;
			if (score2 >= 90) { // 조건식
				System.out.println("점수가 90보다 큽니다.");
				System.out.println("등급이 A입니다."); // { } : 실행문 1 (조건식이 true일때 실행)
			} else {
				System.out.println("점수가 90보다 작습니다.");
				System.out.println("등급이 B입니다."); // { } : 실행문 2 (조건식이 false일때 실행)

				// 3. if-else if-else 문
				// 처음 if 문의 조건식이 false 일 경우 다른 조건식의 결과에 따라 실행할 부분 선택
				// else if의 마지막에는 else 가 온다.
				// 모든 조건식이 false 인 경우 else를 실행하고, 전체 if문을 벗어난다.
				int score3 = 75;
				if (score3 >= 90) {
					System.out.println("점수가 100~90 입니다.");
					System.out.println("등급이 A입니다.");
				} else if (score3 >= 80) {
					System.out.println("점수가 80~89 입니다.");
					System.out.println("등급이 B입니다.");
				} else if (score3 >= 70) {
					System.out.println("점수가 70~79 입니다.");
					System.out.println("등급이 C입니다.");
				} else {
					System.out.println("점수가 70 미만입니다.");
					System.out.println("등급은 D입니다.");

					// 4. 중첩 if 문
					// if 문 뿐만 아니라 switch, for, while, do-while 문은 서로 중첩이 가능하다.
					int score4 = 87;
					System.out.println("점수" + score4);

					String grade;

					if (score4 >= 90) {
						if (score4 >= 95) {
							grade = "A+";
						} else {
							grade = "A";
						}
					} else {
						if (score4 >= 85) {
							grade = "B+";
						} else {
							grade = "B";
						}
					}
					
					System.out.println("학점 : " + grade);
				}
					// 5. switch 문
					// 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
					
					int score5 = 3;
					
					switch(score5) {
					case 1:
						System.out.println("1번이 나왔습니다.");
						break;
					case 2:
						System.out.println("2번이 나왔습니다.");
						break;
					case 3:
						System.out.println("3번이 나왔습니다.");
						break;
					case 4:
						System.out.println("4번이 나왔습니다.");
						break;
					default:
						System.out.println("그 외의 숫자입니다.");
						break;
					}
					
					// 6. for 문
					// ① for문이 처음 실행될때 초기화식이 제일 먼저 실행
					// ② 조건식을 검사하여 true면 실행문 실행
					// 		②-① 조건식을 검사하여 false면 종료
					// ③ 실행문이 모두 실행되면 증감식을 실행시킴
					// ④ 다시 조건식 평가
					// ④-① 평가결과가 true면 실행문 → 증감식 → 조건식 순으로 진행
					// ④-② 평가결과가 false면 종료
					for(int i = 1; i<=10; i++) {
						System.out.println(i);
					// 초기화식의 역할은 조건식과 실행문, 증감식에서 사용할 변수를 초기화
					// 초기화식이 필요없으면 초기화 생략가능
						
						
					// 7. while 문
					// for문은 정해진 횟수만큼 반복, while은 조건식이 true인 경우 계속 반복
					// 조건식이 false가 되면 반복을 멈추고 종료
					// 조건식을 평가한 후 결과가 true이면 실행문을 실행한다.
				    // 실행문이 모두 실행되면 조건식으로 되돌아가 조건식 다시 평가
					// 조건식이 true면 실행문 -> 조건식 순으로 다시 진행하고
					// 조건식이 false면 while문 종료
					
					int j = 1;
					while(j<=10) {
						System.out.println(j);
						j++;
						
					// 8. do-while 문
					// 작성 시 주의할 점으로는 while() 뒤에 반드시 ; 를 붙여야 한다.
					// do-while 문이 처음 실행될 때 우선 실행문을 먼저 실행
					// 실행문이 모두 실행되면 조건식을 평가
					// 평가결과 true가 나오면 실행문 → 조건식 순으로 반복 실행하고,
					// 평가결과 false가 나오면 종료
						
					System.out.println("메시지를 입력하세요");
					System.out.println("프로그램을 종료하려면 q를 입력하세요");
					
					scanner scan = new Scanner(System.in);
					String inputString;
					
					do {
						System.out.print("> ");
						inputString = scan.nextLine();
						System.out.println(inputString);
					}while ! inputString.equals("q") );
						
					System.out.println();
					System.out.println("프로그램 종료");
					
					// 9. break 문
					// 반복문인 for, while, do-while문을 실행 중지할 때 사용
					
					
					// 10. continue 문
					// for, while, do-while문에서만 사용됨
					// continue문이 실행되면 for문의 증감식 , while문, do-while문의 조건식으로 이동
					// continue문은 조건식을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어가게 함
					
					for(int k = 1; k<=10; k++) {
						if(k%2 != 0) {
							continue;
						}
						System.out.println(k);
						
						
						
						
						
					}
					
				}	
			}
		}
	}
}
	
}