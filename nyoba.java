import java.util.Scanner;

public class nyoba {
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

    static int pesanan,jumlah;
    static double suhu,totalakhir,total=0,diskon;
    static String vaksin,jawaban,kode;

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
        //jenis();
        System.out.println("Blom dicoding");
    }

    static void jenis(){
    
            System.out.println(
                "Menu Kasir : \n1. Appetizer" + "\n2. Main Course \n3. Dessert" + "\n4. Minuman");
            System.out.print("Masukkan Pilihan : ");
            int pilih = dela8.nextInt();
            System.out.println("=============================");
            
            if (pilih == 1){
                
                for (int i = 0; i < 1; i++) {
                    System.out.println("");
                    System.out.println(jenis[i] + "\t");
                    System.out.println("===========");
                    for (int j = 0; j < 3; j++) {
                        System.out.println(menu[i][j] + "\t" + harga[i][j] + "");
                    }
                    System.out.println("");
                    pilihMenu();   
                }
            }else if (pilih == 2){    
                for (int i = 1; i < 2; i++) {
                    System.out.println("");
                    System.out.println(jenis[i] + "\t");
                    System.out.println("===========");
                    for (int j = 0; j < 3; j++) {
                        System.out.println(menu[i][j] + "\t" + harga[i][j] + "");
                    }
                    System.out.println("");
                    pilihMenu();
                }
            } else if (pilih == 3){    
                for (int i = 2; i < 3; i++) {
                    System.out.println("");
                    System.out.println(jenis[i] + "\t");
                    System.out.println("===========");
                    for (int j = 0; j < 3; j++) {
                        System.out.println(menu[i][j] + "\t" + harga[i][j] + "");
                    }
                    System.out.println("");
                    pilihMenu();
                }
            }else if (pilih == 4){    
                for (int i = 3; i < 4; i++) {
                    System.out.println("");
                    System.out.println(jenis[i] + "\t");
                    System.out.println("===========");
                    for (int j = 0; j < 3; j++) {
                        System.out.println(menu[i][j] + "\t" + harga[i][j] + "");
                    }
                    System.out.println("");
                    pilihMenu();
                }
            }else{
                System.out.println("Mohon maaf, menu tidak ada dalam pilihan");
            }
            System.out.println("=============================");
        
    }

    static void appetizer(){
        switch (pesanan) {
            case 1:
            System.out.println("Anda memesan "+menu[0][0]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][0]+",-");
            total=totalakhir+(harga[0][0]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
            System.out.println("Anda memesan "+menu[0][1]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][1]+",-");
            total=totalakhir+(harga[0][1]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 3:
            System.out.println("Anda memesan "+menu[0][2]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][2]+",-");
            total=totalakhir+(harga[0][2]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            default:
            System.out.println("Mohon maaf, hanya tersedia 3 menu");
        }
    }

    static void mainCourse(){
        switch (pesanan) {
            case 1:
            System.out.println("Anda memesan "+menu[0][0]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][0]+",-");
            total=totalakhir+(harga[0][0]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
            System.out.println("Anda memesan "+menu[0][1]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][1]+",-");
            total=totalakhir+(harga[0][1]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 3:
            System.out.println("Anda memesan "+menu[0][2]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][2]+",-");
            total=totalakhir+(harga[0][2]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            default:
            System.out.println("Mohon maaf, hanya tersedia 3 menu");
        }
    }
    
    static void dessert(){
        switch (pesanan) {
            case 1:
            System.out.println("Anda memesan "+menu[0][0]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][0]+",-");
            total=totalakhir+(harga[0][0]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
            System.out.println("Anda memesan "+menu[0][1]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][1]+",-");
            total=totalakhir+(harga[0][1]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 3:
            System.out.println("Anda memesan "+menu[0][2]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][2]+",-");
            total=totalakhir+(harga[0][2]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            default:
            System.out.println("Mohon maaf, hanya tersedia 3 menu");
        }
    }

    static void drink(){
        switch (pesanan) {
            case 1:
            System.out.println("Anda memesan "+menu[0][0]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][0]+",-");
            total=totalakhir+(harga[0][0]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
            System.out.println("Anda memesan "+menu[0][1]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][1]+",-");
            total=totalakhir+(harga[0][1]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 3:
            System.out.println("Anda memesan "+menu[0][2]+" sebanyak "+jumlah+" porsi");
            System.out.println("Harga per porsi = Rp. "+harga[0][2]+",-");
            total=totalakhir+(harga[0][2]*jumlah);
            System.out.println("Total = Rp. "+(int)total+",-");
                break;
            default:
            System.out.println("Mohon maaf, hanya tersedia 3 menu");
        }
    }

    static void pilihMenu(){
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
                    appetizer();
                    break;
                case 2:
                    mainCourse();
                    break;
                case 3:
                    dessert();
                    break;
                case 4:
                    drink();
                default:
                System.out.println("Mohon maaf, hanya tersedia 3 jenis menu");
            }                       
            System.out.println("\nApakah anda ingin memesan lagi? \"y\" atau \"n\"");
            jawaban=dela8.next();
        }while (jawaban.equalsIgnoreCase("y"));
            if (jawaban.equalsIgnoreCase("n")){
                //String jMenu = new menu[2][3];
                //int jHarga = jumlah;
                //System.out.println("Menu yang anda pesan : " + jMenu + "\n"+ jHarga);
                System.out.println("Masukkan code dengan huruf kapital untuk klaim diskon : ");
                kode=dela8.next();
                String check;
                    if (kode.contains("POLINEMA")){
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
            }else{
                System.out.println("Terima Kasih");
            }
    }

}
