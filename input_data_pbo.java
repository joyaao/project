import java.util.Scanner;

class User {
    private String nama;
    

    public User (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void show(){
        System.out.println("Selamat pagi " +nama);
    }    

}
 
public class input_data_pbo {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Masukkan nama anda : ");
        String nama = masukkan.nextLine();


        User user = new User(nama);

            user.show();
    }
}
