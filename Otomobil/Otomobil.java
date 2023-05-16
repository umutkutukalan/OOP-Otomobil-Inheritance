package Otomobil;

public class Otomobil {
	private int yil;
	private String model;
	private String cant;
	private String renk;
	
	// CONSTRUCTORS
	public Otomobil(int yil, String model, String cant, String renk) {
		this.yil = yil;
		this.model = model;
		this.cant = cant;
		this.renk = renk;
	}
	
	public Otomobil() {
		this(2021,"Quattroporte","Çelik","Siyah");
	}
	
	// ENCAPSULATİON
	public void setYil(int yil) {
		this.yil = yil;
	}
	public int getYil() {
		return this.yil;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	
	public void setCant(String cant) {
		this.cant = cant;
	}
	public String getCant() {
		return this.cant;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getRenk() {
		return this.renk;
	}
}
