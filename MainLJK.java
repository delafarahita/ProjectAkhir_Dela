import java.util.Scanner;

public class MainLJK {
    public static void main(String[] args) {
        Siswa s = new Siswa();
        LembarJabawan lj = new LembarJabawan();
        HargaMenu hm = new HargaMenu();
        MainLJK k = new MainLJK();
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(
                "Menu Kasir : \n1. Appetizer" + "\n2. Main Course \n3. Dessert" + "\n4. Minuman \n5. Delo");
            System.out.print("Masukkan Pilihan : ");
            int pil = input.nextInt();
            System.out.println("=============================");
            if (pil == 1) {
                for (int brs = 0; brs < 1; brs++) {
                    System.out.println("");
                    System.out.println(s.nama[brs] + "\t");
                    System.out.println("===========");
                    for (int klm = 0; klm < 3; klm++) {
                        System.out.println(lj.menu[brs][klm] + "\t" +hm.harga[brs][klm] + "");
                    }
                    System.out.println("");
                }
            } else if (pil == 2) {
                for (int brs = 1; brs < 2; brs++) {
                    System.out.println("");
                    System.out.println(s.nama[brs] + "\t");
                    System.out.println("===========");
                    for (int klm = 0; klm < 3; klm++) {
                        System.out.println(lj.menu[brs][klm] + "\t" +hm.harga[brs][klm] + "");
                    }
                    System.out.println("");
                }
            } else if (pil == 3) {
                for (int brs = 2; brs < 3; brs++) {
                    System.out.println("");
                    System.out.println(s.nama[brs] + "\t");
                    System.out.println("===========");
                    for (int klm = 0; klm < 3; klm++) {
                        System.out.println(lj.menu[brs][klm] + "\t" +hm.harga[brs][klm] + "");
                    }
                    System.out.println("");
                }
            } else if (pil == 4) {
                for (int brs = 3; brs < 4; brs++) {
                    System.out.println("");
                    System.out.println(s.nama[brs] + "\t");
                    System.out.println("===========");
                    for (int klm = 0; klm < 3; klm++) {
                        System.out.println(lj.menu[brs][klm] + "\t" +hm.harga[brs][klm] + "");
                    }
                    System.out.println("");
                }
            } else if (pil == 5) {
                for (int brs = 4; brs < 5; brs++) {
                    System.out.println("");
                    System.out.println(s.nama[brs] + "\t");
                    System.out.println("===========");
                    for (int klm = 0; klm < 3; klm++) {
                        System.out.println(lj.menu[brs][klm] + "\t" +hm.harga[brs][klm] + "");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("Pilihan Tidak Ada");
            }
            System.out.println("=============================");
        }
        
    }
}
