package no10;

public class SMA extends Sekolah {
	
	    private String nama;
	    private String alamat;
	    private String jenjang;
	    
	    public SMA(){
	        System.out.println("Ini SMA");
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
