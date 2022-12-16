import java.util.Scanner;

public class ProjectKasir_Dela {

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

    public static void main(String[] args) {

        System.out.println("1. Appetizer \n 2. Main Course \n 3. Dessert \n 4.Minuman");
        System.out.println("Pilih Jenis Menu : ");
        int inputJenis = dela8.nextInt();
        //tampilMenu();
        switch (inputJenis) {
            case 1:
                tampilMenu();
                break;
            case 2:
                mainCourse();
                break;
            case 3:
                dessert();
                break;
            case 4:
                drink();
                break;
            default:
                System.out.println("Mohon maaf, menu tidak ada dalam pilihan");
        }
    }

    // static void tampilMenu() {
    //     for (int i = 0; i < jenis.length; i++) {
    //         System.out.println(jenis[i]);
    //         for (int j = 0; j < menu[0].length; j++) {
    //             System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
    //         }
    //         System.out.println("");
    //     }
    // }

    /*memilih 1 jenis 
    static void appetizer(){ 
        for (int i = 0; i < 1; i++) {
            System.out.println("Appetizer : ");
            for (int j = 0; j < 1; j++) {
                System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
            }
        }
    }*/

    static int pesanLagi(){
        do{
            System.out.println("Apakah Anda ingin memesan lagi ?(y/t) ");
            konfirmasi = dela8.nextLine();
            if (konfirmasi.equals("y") || konfirmasi.equals("Y")){
                cuti--;
                System.out.printf("Sisa %d hari\n", cuti);
                if (cuti == 2){
                    System.out.println("STOP! Jatah cuti tinggal 2 hari");
                    break;
                }
            }else if (konfirmasi.equalsIgnoreCase("Tidak")){
                break;
            }
        }while (cuti > 0);
    }

    static int total(){
        int hitung = 
    }

    static void appetizer(){ 
       
        for (int i = 0; i < menu[0].length; i++) {
            System.out.println("Appetizer : ");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.println((j+1) + ". " + menu[0][i] + "\t" + harga[0][j]);
            }
        }
    }
      
    static void mainCourse(){
        for (int i = 0; i < menu[0].length; i++) {
            System.out.println("Main Course : ");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
            }
        }
    }
      
    static void dessert(){
        for (int i = 0; i < menu[0].length; i++) {
            System.out.println("Dessert : ");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
            }
        }
    }
     
    static void drink(){
        for (int i = 0; i < menu[0].length; i++) {
            System.out.println("Drink : ");
            for (int j = 0; j < harga[0].length; j++) {
                System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
            }
        }
    }

    /*static void pilihMenu(){
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Pilih Jenis Menu : ");
            int inputMenu = dela8.nextInt();
            tampil
            for (int j = 0; j < menu[0].length; j++) {
                System.out.println((j+1) + ". " + menu[i][j] + "\t" + harga[i][j]);
            }
            System.out.println("");
        }
    }*/

    
    
    /*
     * static void transaksi(){
     * String pTransaksi;
     * 
     * System.out.println("Cash\n QRIS");
     * System.out.println("Pilih transaksi : ");
     * pTransaksi = dela8.nextLine();
     * 
     * if (pTransaksi.equals("Cash") || pTransaksi.equals("cash")){
     * 
     * }else if (konfirmasi.equalsIgnoreCase("Tidak")){
     * break;
     * }
     * 
     * }
     */
}

// String konfirmasi;

/*
 * System.out.println("=====LOGIN=====");
 * System.out.println("Masukkan Username : ");
 * dela8.nextLine();
 * System.out.println("Masukkan Password : ");
 * dela8.nextInt();
 */
