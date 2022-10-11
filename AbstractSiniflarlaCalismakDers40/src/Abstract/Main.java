package Abstract;

public class Main {
	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
//Abstract classlar newlenemez
		GameCalculator gameCalculator =new KidsGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();

	}
}
