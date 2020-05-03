package no 4;

public class MethStatic {
    public static String nama = "RATU MILLENIA FEBRIYANTI";
    
    public static void cetakNama(){
	System.out.println("Nama saya "+nama);
    }
    public static void cetakUmur(int umur){
        System.out.println("Saya berumur "+umur+" tahun");
    }
    public static void main(String[] args){
        cetakNama();
        cetakUmur(20);         
    }
}
