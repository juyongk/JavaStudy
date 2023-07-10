package ex09package.study;

public class FruitSeller4 {
		int numOfApple;
		int myMoney;
		final int APPLE_PRICE;
		
		public FruitSeller4(int money, int appleNum, int price) {
			myMoney = money;
			numOfApple = appleNum;
			APPLE_PRICE = price;
		}
		
		//멤버 메서드
		public int saleApple(int money) {
			int num = money / APPLE_PRICE;
			numOfApple -= num;
			myMoney += money;
			return num;
		}
		//판매자의 현재상태를 출력한다.
		public void showSaleResult() {
			System.out.println("[판매자]남은사과갯수:"+ numOfApple);
			System.out.println("[판매자]판매수익:"+ myMoney);
		}
	}

