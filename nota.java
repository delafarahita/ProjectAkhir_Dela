import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int total = 0;

        System.out.print("Masukkan Banyak jenis Barang : ");
        String[] barang = new String[data.nextInt()];
        int[] jumlahBarang = new int[barang.length];
        int[] hargaBarang = new int[barang.length];
        int[] index = new int[barang.length];
        System.out.println("=============================");

        for (int i = 0; i < barang.length; i++) {
            System.out.print("Nama Barang ke-" + (i + 1) + " : ");
            barang[i] = data.next();
            System.out.print("“Masukkan Jumlah barang ke-“" + (i + 1) + "” : “");
            jumlahBarang[i] = data.nextInt();
            System.out.print("“Masukkan Harga Barang ke-“" + (i + 1) + "” : “");
            hargaBarang[i] = data.nextInt();
            System.out.println("“—————————–“");
            index[i] = i;
        }
        // sorting
        int SementaraJumlah;
        int SementaraHarga;
        String SementaraBarang;
        for (int i = 0; i < jumlahBarang.length; i++) {
            for (int j = 0; j < jumlahBarang.length - 1; j++) {
                if (jumlahBarang[j + 1] < jumlahBarang[j]) {

                    SementaraJumlah = jumlahBarang[j + 1];
                    SementaraHarga = hargaBarang[j + 1];
                    SementaraBarang = barang[j + 1];

                    jumlahBarang[j + 1] = jumlahBarang[j];
                    hargaBarang[j + 1] = hargaBarang[j];
                    barang[j + 1] = barang[j];

                    jumlahBarang[j] = SementaraJumlah;
                    hargaBarang[j] = SementaraHarga;
                    barang[j] = SementaraBarang;

                }
            }
        }
        System.out.println();
        System.out.println("“————————–NOTA————————–“");
        System.out.printf("%10s%25s%25s\n", "Nama Barang", "Jumlah Barang", "Harga Barang");
        for (int i = 0; i < barang.length; i++) {
            System.out.printf("%10s%25s%25s\n", barang[i], jumlahBarang[i], hargaBarang[i]);
            total += hargaBarang[i] * jumlahBarang[i];
        }
        System.out.println("“TOTAL PEMBELIAN : “" + total);

        System.out.print("“\nMasukkan Uang Anda : “");
        int uang = data.nextInt();
        if (uang < total) {
            System.out.println("“UANG TIDAK CUKUP”");
        } else {
            int kembalian = uang - total;
            System.out.println("“Kembalian : “" + kembalian);
        }

    }
}
