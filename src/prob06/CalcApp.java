package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.println(">>");
			String expression = scanner.nextLine();
			
			if( expression.equals("quit") ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			switch( tokens[1] ) {
				case "+" :
					System.out.println(a + "+" + b + "=" + (a+b));
					break;
				case "*" :
					System.out.println(a + "*" + b + "=" + a*b);
					break;
				case "-":
					System.out.println(a + "-" + b + "=" + (a-b));
					break;
				case "/":
					System.out.println(a + "/" + b + "=" + a/b);
					break;
				
			    default:
			    	System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
		
		scanner.close();
	}
}
