import java.util.Scanner;

public class nyobak {
    static Scanner dela8 = new Scanner(System.in);

    static String[] jenis = { "1. Appetizer", "2. Main Course", "3. Dessert", "4. Minuman" };

    static String[][] menu = {
            { "Salad", "Chicken Soup", "Apple Pie" },
            { "Nasi Goreng", "Spagetti", "Ayam Goreng" },
            { "Pudding", "Brownies", "Cheese Cake" },
            { "Americano", "Thai Tea", "Matcha" }
    };
    static int[][] harga = {
            { 20000, 30000, 45000 },
            { 30000, 50000, 25000 },
            { 20000, 25000, 35000 },
            { 20000, 25000, 30000 }
    };

    static int[] hAppetizer = { 20000, 30000, 45000 };
    static int[] hMainCourse = { 30000, 50000, 25000 };
    static int[] hDessert = { 20000, 25000, 35000 };
    static int[] hDrinks = { 20000, 25000, 30000 };

    static int pesanan,jumlah;
    static double suhu,totalakhir,total=0,diskon;
    static String vaksin,jawaban,namaplg;

    //static int pilihMenu[][] = new int[4][2];

    public static void main(String args[]){
        String akun[] = {"Dela", "09876"};
        String username, password;
        System.out.println("LOGIN");
        System.out.println("Masukkan Username : ");
        username = dela8.next();
        System.out.println("Masukkan Paswword : ");
        password = dela8.next();
        if (username.equals(akun[0])&&password.equals(akun[1])){
                System.out.println("Selamat Datang");
                home();
                
        }else{
                System.out.println("Username dan Password yang Anda masukkan salah");
        }
    

    System.out.println("\t     Selamat Datang di AyamAku!"
    + "\n======================================================="
    + "\n      DISKON UNTUK SETIAP TOTAL PEMBELIAN"
    + "\nUNTUK PEMBELI DENGAN NAMA YANG MENGANDUNG UNSUR OKTOBER"
    + "\n\t\t     DISKON 20%"
    +"\n=======================================================");
    System.out.println("Sebelum masuk ke dalam tempat makan, mohon jawab beberapa pertanyaan berikut :");
    System.out.println("Apakah anda sudah divaksin? \"sudah\" atau \"belum\"");
    vaksin=dela8.nextLine();
    System.out.println("Berapa suhu tubuh anda?");
    suhu=dela8.nextDouble();

    if (vaksin.equalsIgnoreCase("sudah")&&suhu<=37){
    System.out.println("\t\tSELAMAT DATANG!\n");
    pilihMenu();
    do{
        totalakhir=total;
        System.out.println("\nMasukkan nomer dari menu :");
        pesanan=dela8.nextInt();
            while (pesanan>4||pesanan<1){
                System.out.println("Mohon masukkan angka sesuai Menu Paket yang tersedia!");
                System.out.println("\nMasukkan nomer dari menu :");
                pesanan=dela8.nextInt();
            }
        System.out.println("Berapa jumlah yang ingin dipesan?");
        jumlah=dela8.nextInt();
        
        switch (pesanan) {
            case 1:
                System.out.println("Anda memesan "+menu[0][0]+" sebanyak "+jumlah+" porsi");
                System.out.println("Harga per porsi = Rp. "+harga[0]+",-");
                total=totalakhir+(harga[0][0]*jumlah);
                System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
                System.out.println("Anda memesan "+menu[1][]+" sebanyak "+jumlah+" porsi");
                System.out.println("Harga per porsi = Rp."+harga[1]+",-");
                total=totalakhir+(harga[1]*jumlah);
                System.out.println("Total = Rp."+(int)total+",-");
                break;
            case 3:
                System.out.println("Anda memesan "+nama[2]+" sebanyak "+jumlah+" porsi");
                System.out.println("Harga per porsi = Rp."+harga[2]+",-");
                total=totalakhir+(harga[2]*jumlah);
                System.out.println("Total = Rp."+(int)total+",-");
                break;
            case 4:
                System.out.println("Anda memesan "+nama[3]+" sebanyak "+jumlah+" porsi");
                System.out.println("Harga per porsi = Rp."+harga[3]+",-");
                total=totalakhir+(harga[3]*jumlah);
                System.out.println("Total = Rp."+(int)total+",-");
                break;
        }
        
        System.out.println("\nApakah anda ingin memesan lagi? \"y\" atau \"n\"");
        jawaban=dela8.next();
        }while (jawaban.equalsIgnoreCase("y"));
            if (jawaban.equalsIgnoreCase("n")){
                System.out.println("Masukkan nama anda untuk klaim diskon : *Mohon huruf pertama menggunakan huruf besar");
                namaplg=dela8.next();
                String check;
                    if (namaplg.contains("Okt")){
                        System.out.println("\n=======================================");
                        System.out.println("Selamat anda mendapat diskon 20%");
                        diskon=total*0.2;
                        total-=diskon;
                        System.out.println("Total pembayaran anda menjadi = Rp. "+(int)total+",-");
                        System.out.println("=======================================");
                    }else {
                        System.out.println("\n=======================================");
                        System.out.println("Total pembayaran anda menjadi = Rp. "+(int)total+",-");
                        System.out.println("=======================================");
                    }
            }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Terimakasih Sudah Memesan, Silahkan Menunggu, Pesanan Akan Segera Diantarkan");
        System.out.println("----------------------------------------------------------------------------");
      
    }else{
        System.out.println("Mohon maaf, anda tidak dapat masuk ke dalam tempat makan!");
        System.out.println("TERIMAKASIH!");
    }
    }



    static void home(){
        int tempat;
        System.out.println("1. Makan di tempat \n2. Reservasi tempat");
        System.out.print("Pilih : ");
        tempat = dela8.nextInt();
        switch (tempat){
                case 1:
                        dinein();
                        break;
                case 2:
                        reservasi();
                        break; 
                default:
                System.out.println("Mohon maaf, hanya tersedia dua pilihan");  
                
        }
    }

    static void dinein(){
        jenis();

    }

    static void reservasi(){
        jenis();
    }
    
    static void jenis(){
        for (int i = 0; i <jenis.length; i++){
                System.out.println(jenis[i]);
                for (int j = 0; j <menu[0].length; j++){
                        System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
                }
                System.out.println("");
        }
    }

    static void pilihMenu(){
        // for (int i = 0; i < pilihMenu.length; i++){
        //         for (int j = 0; j < pilihMenu[i].length; j++){
        //                 System.out.println("Pilih Menu : ");
        //                 int tambah = dela8.nextInt();      
        //         }
        // }
        int totalAkhir, total, pesanan, jumlah;
        do{
                //totalAkhir=total;
                System.out.println("Pilih Menu : ");
                pesanan = dela8.nextInt();
        }while (pesanan <4 || pesanan <1);{
                        System.out.println("Pilihan menu salah! Masukkan pilihan sesuai menu yang tersedia");
                        System.out.println("Pilih Menu : ");
                        pesanan = dela8.nextInt();

                }
                System.out.println("Berapa jumlah yang ingin dipesan?");
                jumlah = dela8.nextInt();

                switch(pesanan){
                        case 1:
                        System.out.println("Anda memesan"+ menu[0][0]+ "sebanyak" + jumlah);
                        case 2:
                        System.out.println("Anda memesan"+ menu[0][1]+ "sebanyak" + jumlah);
                        case 3:
                        System.out.println("Anda memesan"+ menu[0][2]+ "sebanyak" + jumlah);
                        case 4:
                        System.out.println("Anda memesan"+ menu[0][3]+ "sebanyak" + jumlah);
                        default:
                        System.out.println("Maaf pesanan Anda salah");
                };
        }
    }    


    

//     public static void main(String args[]){
//         String nota = pilihMenu();
//         System.out.println("nota" + nota);
        
//     }


    