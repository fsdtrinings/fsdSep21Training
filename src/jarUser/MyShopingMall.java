package jarUser;

import java.time.LocalDate;

import p1.BarCodeScanner;

public class MyShopingMall {

	public static void main(String[] args) {
		BarCodeScanner barCodeScanner = new BarCodeScanner();
		int cost = barCodeScanner.getCost();
		LocalDate date = barCodeScanner.getDate();
		System.out.println(" Cost "+cost);
		System.out.println(" Date "+date);
	}
}
