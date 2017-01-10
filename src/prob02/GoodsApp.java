package prob02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods goods = new Goods();
		String[] name1 = new String[3];
		int[] price1 = new int[3];
		int[] countStock1 = new int[3];
		
		for(int i = 0; i < 3; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			name1[i]=name;
			price1[i]=price;
			countStock1[i]=countStock;
//			goods.setName(name);
//			goods.setPrice(price);
//			goods.setCountStock(countStock);
		}
		for( int i = 0; i < 3; i++ ) {
			System.out.println(name1[i]+price1[i]+countStock1[i]);
//			goods.show();
		}
		scanner.close();
	}
}
