package ex09package.study;

public class FruitBuyer4 {

	int myMoney;
	int numOfApple;
	
	//멤버변수의 초기값을 제거한후 초기화메서드를 추가한다.
	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(ex09package.study.FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}