package Otomobil;

public class Elektrikli extends Otomobil {
	private int sarjDurumu;
	private String motorAkuTipi;
	
	// CONSTRUCTORS
	public Elektrikli(int sarjDurumu, String motorAkuTipi) {
		super(); // Otomobil sınıfındaki bilgileri çekiyor.
		this.sarjDurumu = sarjDurumu;
		this.motorAkuTipi = motorAkuTipi;
	}
	
	public Elektrikli() {
		this(35,"C-Type");
	}
	
	// ENCAPSULATİON
	public void setSarjDurumu(int sarjDurumu) {
		this.sarjDurumu = sarjDurumu;
	}
	public int getSarjDurumu() {
		return this.sarjDurumu;
	}
	
	public void setMotorAkuTipi(String motorAkuTipi) {
		this.motorAkuTipi = motorAkuTipi;
	}
	public String getMotorAkuTipi() {
		return this.motorAkuTipi;
	}
}
