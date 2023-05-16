package Otomobil;

public class Benzinli extends Otomobil {
	private int yakitDurumu;
	
	// CONSTRUCTORS
	public Benzinli(int yakitDurumu) {
		super(); // Otomobil sınıfındaki bilgileri çekiyor.
		this.yakitDurumu = yakitDurumu;
	}
	
	public Benzinli() {
		this(40);
	}
	
	// ENCAPSULATİON
	public void setYakitDurumu(int yakitDurumu) {
		this.yakitDurumu = yakitDurumu;
	}
	public int getYakitDurumu() {
		return this.yakitDurumu;
	}
}
