import java.util.Scanner;

public class nyoba1 {
    static Scanner dela8 = new Scanner(System.in);

    static String[] jenis = { "1. Appetizer", "2. Main Course", "3. Dessert", "4. Minuman" };

    static String[][] menu = {
            { "1. Salad", "2. Chicken Soup", "3. Apple Pie" },
            { "4. Nasi Goreng", "5. Spagetti", "6. Ayam Goreng" },
            { "7. Pudding", "8. Brownies", "9. Cheese Cake" },
            { "10. Americano", "11. Thai Tea", "12. Matcha" }
    };
    static int[][] harga = {
            { 20000, 30000, 45000 },
            { 30000, 50000, 25000 },
            { 20000, 25000, 35000 },
            { 20000, 25000, 30000 }
    };

    static int pesanan, jumlah, totalakhir, total = 0, diskon;
    static String jawaban, kode;

    public static void main(String args[]) {
        String akun[] = { "Dela", "09876" };
        String username, password;
        System.out.println("LOGIN");
        System.out.println("Masukkan Username : ");
        username = dela8.next();
        System.out.println("Masukkan Paswword : ");
        password = dela8.next();
        if (username.equals(akun[0]) && password.equals(akun[1])) {
            System.out.println("Selamat Datang");
            home();
        } else {
            System.out.println("Username dan Password yang Anda masukkan salah");
        }
    }

    static void home() {
        int tempat;
        System.out.println("1. Makan di tempat \n2. Reservasi tempat");
        System.out.print("Pilih : ");
        tempat = dela8.nextInt();
        switch (tempat) {
            case 1:
                pilihMenu();
                break;
            case 2:
                reservasi();
                break;
            default:
                System.out.println("Mohon maaf, hanya tersedia dua pilihan");

        }
    }

    static void reservasi() {
        // jenis();
        System.out.println("Blom dicoding");
    }

    static int hitungKembalian(int bayar) {
        int kembalian;

        kembalian = bayar - total;
        return kembalian;
    }

    static void pilihMenu() {

        for (int i = 0; i < jenis.length; i++) {
            System.out.println(jenis[i]);
            for (int j = 0; j < menu[0].length; j++) {
                System.out.println(menu[i][j] + "\t" + harga[i][j]);
            }
            System.out.println("");

        }

        do {
            totalakhir = total;
            System.out.println("\nMasukkan nomer dari menu :");
            pesanan = dela8.nextInt();

            while (pesanan > 12 || pesanan < 1) {
                System.out.println("Mohon masukkan angka sesuai Menu Paket yang tersedia!");
                System.out.println("\nMasukkan nomer dari menu :");
                pesanan = dela8.nextInt();

            }

            System.out.println("Berapa jumlah yang ingin dipesan?");
            jumlah = dela8.nextInt();

            switch (pesanan) {
                case 1:
                    System.out.println("Anda memesan " + menu[0][0] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[0][0] + ",-");
                    total = totalakhir + (harga[0][0] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 2:
                    System.out.println("Anda memesan " + menu[0][1] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[0][1] + ",-");
                    total = totalakhir + (harga[0][1] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 3:
                    System.out.println("Anda memesan " + menu[0][2] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[0][2] + ",-");
                    total = totalakhir + (harga[0][2] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                case 4:
                    System.out.println("Anda memesan " + menu[1][0] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][0] + ",-");
                    total = totalakhir + (harga[1][0] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 5:
                    System.out.println("Anda memesan " + menu[1][1] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][1] + ",-");
                    total = totalakhir + (harga[1][1] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 6:
                    System.out.println("Anda memesan " + menu[1][2] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][2] + ",-");
                    total = totalakhir + (harga[1][2] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 7:
                    System.out.println("Anda memesan " + menu[1][0] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][0] + ",-");
                    total = totalakhir + (harga[1][0] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 8:
                    System.out.println("Anda memesan " + menu[1][1] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][1] + ",-");
                    total = totalakhir + (harga[1][1] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 9:
                    System.out.println("Anda memesan " + menu[1][2] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[1][2] + ",-");
                    total = totalakhir + (harga[1][2] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 10:
                    System.out.println("Anda memesan " + menu[2][0] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[2][0] + ",-");
                    total = totalakhir + (harga[2][0] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 11:
                    System.out.println("Anda memesan " + menu[2][1] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[2][1] + ",-");
                    total = totalakhir + (harga[2][1] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                case 12:
                    System.out.println("Anda memesan " + menu[2][2] + " sebanyak " + jumlah + " porsi");
                    System.out.println("Harga per porsi = Rp. " + harga[2][2] + ",-");
                    total = totalakhir + (harga[2][2] * jumlah);
                    System.out.println("Total = Rp. " + (int) total + ",-");
                    break;
                default:
                    System.out.println("Mohon maaf, hanya tersedia 3 jenis menu");
            }
            
            System.out.println("\nApakah anda ingin memesan lagi? \"y\" atau \"n\"");
            jawaban = dela8.next();
        } while (jawaban.equalsIgnoreCase("y"));

        if (jawaban.equalsIgnoreCase("n")) {
            // String jMenu = new menu[2][3];
            // int jHarga = jumlah;
            // System.out.println("Menu yang anda pesan : " + jMenu + "\n"+ jHarga);
            // daftarPesanan();
            
            System.out.println("Masukkan code untuk klaim diskon : ");
            kode = dela8.next();
            String check;

            if (kode.equalsIgnoreCase("POLINEMA")) {
                System.out.println("\n=======================================");
                System.out.println("Selamat anda mendapat diskon 20%");
                diskon = total * 20 / 100;
                total -= diskon;
                System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
                System.out.println("=======================================");
                // return total;
            } else {
                System.out.println("\n=======================================");
                System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
                System.out.println("=======================================");
                // return total;
            }

            int pTransaksi, bayar, kembalian, tampil;

            System.out.println("1. Cash \n2. QRIS");
            System.out.print("Pilih transaksi : ");
            pTransaksi = dela8.nextInt();
            if (pTransaksi == 1) {
                System.out.println("Uang pembeli : ");
                bayar = dela8.nextInt();
                kembalian = hitungKembalian(bayar);
                System.out.println("Kembalian : " + kembalian);
            } else if (pTransaksi == 2) {
                tampil = diskon(total);
                System.out.println("Bayar : " + tampil);

            }

        } else {
            System.out.println("Terima Kasih");
        }
    }

    static int diskon(int total) {
        if (kode.contains("POLINEMA")) {
            System.out.println("\n=======================================");
            System.out.println("Selamat anda mendapat diskon 20%");
            diskon = total * 20 / 100;
            total -= diskon;
            System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
            System.out.println("=======================================");
            return total;
        } else {
            System.out.println("\n=======================================");
            System.out.println("Total pembayaran anda menjadi = Rp. " + (int) total + ",-");
            System.out.println("=======================================");
            return total;
        }

    }
}
