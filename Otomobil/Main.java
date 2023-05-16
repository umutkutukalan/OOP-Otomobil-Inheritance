package Otomobil;

public class Main {

	public static void main(String[] args) {

		Otomobil otomobil = new Otomobil(2020, "Venue", "Alüminyum", "Gri");
		System.out.println(otomobil.getYil() +" | "+ otomobil.getModel() +" | "+ otomobil.getCant() +" | "+ otomobil.getRenk());
		Otomobil otomobil1 = new Otomobil();
		System.out.println(otomobil1.getYil() +" | "+ otomobil1.getModel() +" | "+ otomobil1.getCant() +" | "+ otomobil1.getRenk());
		
		
		System.out.println();
		System.out.println("--------Benzinli--------");
		Benzinli otomobil2 = new Benzinli();
		otomobil2.setYil(2022);
		otomobil2.setModel("Tiguan");
		otomobil2.setRenk("Kırmızı");
		System.out.println(otomobil2.getYil() +" | "+ otomobil2.getModel() +" | "+ otomobil2.getCant()
							+" | "+ otomobil2.getRenk() +" | "+ otomobil2.getYakitDurumu());
		Benzinli otomobil3 = new Benzinli(30);
		otomobil3.setYil(2022);
		otomobil3.setModel("Tiguan");
		otomobil3.setRenk("Beyaz");
		System.out.println(otomobil3.getYil() +" | "+ otomobil3.getModel() +" | "+ otomobil3.getCant()
							+" | "+ otomobil3.getRenk() +" | "+ otomobil3.getYakitDurumu());
		
		System.out.println();
		System.out.println("--------Elektrikli--------");
		Elektrikli otomobil4 = new Elektrikli();
		otomobil4.setYil(2023);
		otomobil4.setModel("TOGG");
		System.out.println(otomobil4.getYil() +" | "+ otomobil4.getModel() +" | "+ otomobil4.getCant()
							+" | "+ otomobil4.getRenk() +" | "+ otomobil4.getSarjDurumu() +" | "+ otomobil4.getMotorAkuTipi());
		Elektrikli otomobil5 = new Elektrikli(70,"A-Type");
		otomobil5.setModel("TOGG");
		otomobil5.setRenk("Kırmızı");
		System.out.println(otomobil5.getYil() +" | "+ otomobil5.getModel() +" | "+ otomobil5.getCant()
							+" | "+ otomobil5.getRenk() +" | "+ otomobil5.getSarjDurumu() +" | "+ otomobil5.getMotorAkuTipi());
	}

}
