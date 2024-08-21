class Motor {
    private String merk;
    @SuppressWarnings("unused")
    private Long harga;

    public void setMerk(String merkMotor){
        this.merk = merkMotor;

    }
    public String getMerk(){
        return merk;
    }
     public Long harga(long hargaMotor){
        return harga = hargaMotor;
     }

        
    }
 
    public class  sepedaMotor{
    
    public static void main(String[] args) {
        Motor merk = new Motor();
        merk.setMerk("suzuki");



        System.out.println("merk motor ini adalah " +merk.getMerk());
        System.out.println("harga motor ini adalah " +merk.harga(900000));
    }


        


    }




    

