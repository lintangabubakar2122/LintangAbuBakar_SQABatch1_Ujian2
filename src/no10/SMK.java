package no10;

public class SMK {
	
	private String nama;
    private String alamat;
    private String jenjang;
    
    public SMK(){
        System.out.println("Ini SMK");
    }
    
    public void nama(String x){
        nama = x;
    }
    
    public void alamat(String x){
        alamat = x;
    }
    
    public void jenjang(String x){
        jenjang = x;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getJenjang(){
        return jenjang;
    }

}
