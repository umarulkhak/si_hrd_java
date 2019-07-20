
package HRD;
public class Manajemen {
            
        private final int id;
        private final int nik;
        private final String N_pndftr;
        private final String Tem_Lahir;
        private final String Tgl_lahir;
        private final String pen_ter;
        private final String jk;
        private final float price;
        private final byte[] picture;
    
      
   public Manajemen(int Aid,int Anik,String ANam,String Tem,String Tangg
                    ,String pendidikan,String Ajk, float gaji, byte[] Pimg){
        this.id=Aid;
        this.nik=Anik;
        this.N_pndftr=ANam;
        this.Tem_Lahir=Tem;
        this.Tgl_lahir=Tangg;
        this.jk=Ajk;
        this.pen_ter=pendidikan;
        this.price=gaji;
        this.picture=Pimg;
    }
    public int getId(){
        
        return id;
        
    }
    public int getInk(){
    
        return nik;
    }
    public String getName(){
        
        return N_pndftr;
        
    }
    public String getTempatLahir(){
    
        return Tem_Lahir;
    
    }
    public String getTAnggalLahir(){
    
       return Tgl_lahir;
   
    }
    public String getJenisKelamin(){
  
        return jk;
    }
    public String getPendidikanTerakhir(){
    
        return pen_ter;
    
    }
    
    public float getgaji(){ 
    
        return price;
    }
    
    public byte[] getImage(){
    
        return picture;
    }

}
