package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		double result = won / rate;
		return result;
		//return won/rate; 강사님
	}

	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		double result = dollar * rate;
		return result;
		//return dollar*rate; 강사님
	}

	public static void setRate(double rate1) {
		// 환율 설정(KRW/$1)
		CurrencyConverter.rate = rate1;
	}
}
