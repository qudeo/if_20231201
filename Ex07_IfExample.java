package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/**
		 *  성적 출력 예제 응용
		 *  입력값 : 학년(year), 점수(score)
		 *  처리
		 *  - 1~3학년은 60점 이상이면 합격
		 *  - 4학년은 70점 이상이어야 합격
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학년");
		/**
		 *  학년을 먼저 넣고 그 뒤에 점수를 넣은 이유는 아래의 식에서
		 *  학년이 먼저 들어가고 그 뒤 점수를 계산하기 때문
		 */
		
		int year = scanner.nextInt();
		/**
		 * 학년을 대입 후 스코어를 재 갱신해야 해서 아래에 들어감
		 */
		System.out.print("점수");
		
		int score = scanner.nextInt();
		
		if(year < 4) {
			if(score >= 60) {
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
			
		}else if(year == 4){
			if(score >= 70){
			System.out.println("합격");
			}else{
				System.out.println("불합격");
			}	
		}
	}

}
