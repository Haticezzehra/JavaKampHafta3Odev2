package Abstract;

public abstract class GameCalculator {
	public abstract void hesapla();// implemente edilmesi zorunlu sınıf

	public final void gameOver() { // final anahtar kelimesiyle o sınıfın ezilmesini önleyebiliyoruz.
		System.out.println("Oyun bitti.");
	}
}
