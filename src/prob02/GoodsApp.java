package prob02;

import java.util.Scanner;

public class GoodsApp {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Goods goods = new Goods();
//		String[] name1 = new String[3];
//		int[] price1 = new int[3];
//		int[] countStock1 = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			String name = scanner.next();
//			int price = scanner.nextInt();
//			int countStock = scanner.nextInt();
//			name1[i]=name;
//			price1[i]=price;
//			countStock1[i]=countStock;
////			goods.setName(name);
////			goods.setPrice(price);
////			goods.setCountStock(countStock);
//		}
//		for( int i = 0; i < 3; i++ ) {
//			System.out.println(name1[i]+price1[i]+countStock1[i]);
////			goods.show();
//		}
//		scanner.close();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];
		
		for(int i = 0; i < 3; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			goods[ i ] = new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setCountStock(countStock);
		}
		System.out.println(goods[0].getName());
		for( Goods g : goods ) {
			System.out.println( 
				g.getName() +
				"(가격:" + g.getPrice() + ")이 " +
				g.getCountStock() + "개 입고 되었습니다." );
		}
			
		
		scanner.close();
	}
}
