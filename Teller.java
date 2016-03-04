import java.io.*;
import java.util.Scanner;

/**
 * Kelas teller adalah kelas utama dari proyek JBank
 * 
 * @author Teuku Mohamad Anshar Lotan 
 * @version 25/02/2016
 */
public class Teller
{   
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        String nama_depan, nama_belakang, dob, no_telepon, buat_customer;
        int jenis_akun, saldo_awal = 0;
        
        System.out.println("Apakah anda ingin membuat customer (ketik 'ya' jika ingin / 'tidak' jika tidak berminat) ? ");
        buat_customer = input.nextLine();
        if (!buat_customer.equals("ya")){
            System.exit(0);;
        }
        
            
        do {
            System.out.println("==============Silakan masukkan data anda=============");
            System.out.print("Nama depan : ");
            nama_depan = input.nextLine();
            System.out.print("Nama belakang : ");
            nama_belakang = input.nextLine();
            System.out.print("Tanggal lahir : ");
            dob = input.nextLine();
            System.out.print("Nomor telepon : ");
            no_telepon = input.nextLine();
            
            Customer customer = new Customer(nama_depan, nama_belakang, dob);
            
            customer.phoneNumber = no_telepon;
            
            customer.custId = customer.getCustomerId();
            
            System.out.println("============Jenis Account=============");
            System.out.println("1. Savings");
            System.out.println("2. Overdraft");
            System.out.println("3. Investment");
            System.out.println("4. Credit checking");
            System.out.println("5. Tidak membuat");
            System.out.print("Silakan pilih salah satu jenis Account : ");
            
            jenis_akun = input.nextInt();
            System.out.print("Masukkan saldo awal anda : ");
            if (jenis_akun == 1) {
                
                saldo_awal = input.nextInt();
                while (saldo_awal < 10){
                    System.out.println("Saldo minimum adalah 10$");
                    System.out.print("Masukkan kembali saldo awal anda : ");
                    saldo_awal = input.nextInt();
                }
            }
            
            if (jenis_akun == 2) {
                saldo_awal = input.nextInt();
                }
            
            
            if (jenis_akun == 3) {
                saldo_awal = input.nextInt();
                while (saldo_awal < 100) {
                    System.out.println("Saldo minimum adalah 100 $");
                    System.out.print("Masukkan kembali saldo awal anda : ");
                    saldo_awal = input.nextInt();
                }
            }
            
            if (jenis_akun == 4) {
                saldo_awal = input.nextInt();
            }
            
            if (jenis_akun == 5) {
                System.exit(0);
            }
            
            System.out.println("Nama lengkap : "+ nama_depan + nama_belakang);
            System.out.println("Tanggal lahir : " + dob);
            System.out.println("Nomor telepon : " + no_telepon);
            System.out.println("Jenis Account : " + jenis_akun);
            System.out.println("Saldo awal : " + saldo_awal+"$\n");
            
        } while (!buat_customer.equals("tidak"));
    
    
    }
    
    public Teller()
    {}
}
