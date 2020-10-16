/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author abu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Intence of Class
        Login user1 = new Login();
        Login user2 = new Login("","");
        
        while (true) {            
            //Menu
            System.out.println("===========================");
            System.out.println("\tMENU LOGIN");
            System.out.println("===========================");
            System.out.println("1. Login admin");
            System.out.println("2. Ubah password admin");
            System.out.println("3. Buat user");
            System.out.println("4. Lihat data user");
            System.out.println("5. Keluar");
            System.out.println("===========================");
            
            //Input
            System.out.print("Masukan Pilihan = ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("");
            
            //Proses & Output
            switch(pilih){
                //1. Login admin
                case 1:
                    System.out.print("Masukan username : ");
                    String myUsername = br.readLine();
                    System.out.print("Masukan password : ");
                    String myPassword = br.readLine();
                    System.out.println("");
                    
                    if (myUsername.equals(user1.getUsername()) && myPassword.equals(user1.getPassword())) {
                        System.out.println("*** Login sukses! ***");
                    }else{
                        System.out.println("*** Login gagal! ***");
                    }
                    break;
                    
                //2. Ubah password admin
                case 2:
                    System.out.print("Masukan password lama : ");
                    String oldPassword = br.readLine();
                    System.out.print("Masukan password baru: ");
                    String newPassword = br.readLine();
                    System.out.println("");
                    
                    if(oldPassword.equals(user1.getPassword())){
                        user1.setPassword(newPassword);
                        System.out.println("*** Password berhasil diubah! ***");
                    }else{
                        System.out.println("** Anda salah memasukan password lama! ***");
                    }
                    break;
                    
                //3. Buat user
                case 3:
                    System.out.print("Masukan username : ");
                    String createUsername = br.readLine();
                    System.out.print("Masukan password : ");
                    String createPassword = br.readLine();
                    System.out.println("");
                    
                    user2 = new Login(createUsername, createPassword);
                    System.out.println("");
                    
                    System.out.println("** User berhasil ditambah! ***");
                    break;
                    
                //4. Lihat data user
                case 4:
                    System.out.println("===========================");
                    System.out.println("DATA USER");
                    System.out.println("User 1");
                    System.out.println("Username = "+ user1.getUsername());
                    System.out.println("Password = "+ user1.getPassword());
                    System.out.println("");
                    System.out.println("User 2");
                    System.out.println("Username = "+ user2.getUsername());
                    System.out.println("Password = "+ user2.getPassword());
                    System.out.println("===========================");
                    break;
                //5. keluar
                default:
                    System.exit(0);
            }
        }
    }
}
