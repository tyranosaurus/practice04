package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int sum = 0;
		/* 여기에 구현 코드를 작성 합니다. */
		
		if (inputNumber % 2 == 1)
		{			
			for (int i = 1; i <= inputNumber; i += 2)
			{
				sum += i;
			}
		}
		else
		{
			for (int i = 2; i <= inputNumber; i += 2)
			{
					sum += i;
			}
		}
		System.out.println("결과값 : " + sum);
		scanner.close();
	}
	

}
