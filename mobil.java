package no 1;

public class mobil {	
	String warna;
	String Mobil;
	int tahunProduksi;
	
public mobil(String warna, String Mobil ,int tahunProduksi){
	this.warna=warna;
	this.Mobil=Mobil;
	this.tahunProduksi=tahunProduksi;
	}
public void info(){
	System.out.println("Warna:" +warna);
	System.out.println("Nama Mobil:" +Mobil);
	System.out.println("Tahun:" +tahunProduksi);
	}
public static void main(String[] args) {
	mobil mobilku = new mobil("putih","Avanza", 2018);
	mobilku.info();
}

}