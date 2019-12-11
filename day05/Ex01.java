package day05;

import java.util.Random;

//로또 번호 제작기 - 배열 버전
public class Ex01 {
	public static void main(String[] args) {
		// 로또번호 조건 : 1~45, 6개의 숫자, 중복x, 오름차순 정렬
		Random random = new Random();
		int[] lottoNumbers = new int[6];
		for (int i = 0; i < lottoNumbers.length; i++) {
			lottoNumbers[i] = random.nextInt(45) + 1;
		}
		System.out.println("==========중복제거전==========");
		for (int i : lottoNumbers) {
			System.out.println(i);
		}
		for (int i = 0; i < lottoNumbers.length; i++) {
			for (int j = 0; j < lottoNumbers.length; j++) {
				if (lottoNumbers[i] == lottoNumbers[j] && i != j) { // i = j 이므로 중복이다.
					lottoNumbers[i] = random.nextInt(45) + 1; // i를 randomNumber
					j = -1;
					System.out.println(i + "번: " + lottoNumbers[i]);
				}
			}
		}
		System.out.println("==========중복제거후==========");
		for (int i : lottoNumbers) {
			System.out.println(i);
		}

		System.out.println("==========정렬시작============");
		for (int i = 0; i < lottoNumbers.length - 1; i++) {
			if (lottoNumbers[i] > lottoNumbers[i + 1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i + 1];
				lottoNumbers[i + 1] = temp;
				i = -1;
			}
		}
		System.out.println("==========정렬후==========");
		for (int i : lottoNumbers) {
			System.out.println(i);
		}
	}
}