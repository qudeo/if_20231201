package ch04_if;

import java.util.Scanner;

public class Ex_05IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		int num = scanner.nextInt();
		
		if (num >= 1 || num <=-1){
			if(num >= 1){
				System.out.println("정수");
			}else{
				System.out.println("음수");
			}
		}else{
			System.out.println("0");
		}
		
	}

}
