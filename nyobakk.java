import java.util.Scanner;

public class nyobakk {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

    int pesanan,jumlah;
    double suhu,totalakhir,total=0,diskon;
    String vaksin,jawaban,namaplg;

    System.out.println("\t     Selamat Datang di AyamAku!"
            + "\n======================================================="
            + "\n      DISKON GEDEN UNTUK SETIAP TOTAL PEMBELIAN"
            + "\nUNTUK PEMBELI DENGAN NAMA YANG MENGANDUNG UNSUR OKTOBER"
            + "\n\t\t     DISKON 20%"
            +"\n=======================================================");
    System.out.println("Sebelum masuk ke dalam tempat makan, mohon jawab beberapa pertanyaan berikut :");
    System.out.println("Apakah anda sudah divaksin? \"sudah\" atau \"belum\"");
    vaksin=input.nextLine();
    System.out.println("Berapa suhu tubuh anda?");
    suhu=input.nextDouble();
    
    if (vaksin.equalsIgnoreCase("sudah")&&suhu<=37){
        System.out.println("\t\tSELAMAT DATANG!\n"
                + "-------------------------------------------------"
                + "\nSilahkan pilih paket menu yang ada di bawah ini :"
                + "\n1. Nasi+Ayam geprek\t\tRp. 10.000"
                + "\n2. Nasi+Ayam crispy\t\tRp. 9.000"
                + "\n3. Nasi+Ayam geprek+Minum\tRp. 15.000"
                + "\n4. Nasi+Ayam crispy+Minum\tRp. 14.000"
                + "\n-------------------------------------------------");
        
        do{
        totalakhir=total;
        System.out.println("\nMasukkan nomer dari menu :");
        pesanan=input.nextInt();
            while (pesanan>4||pesanan<1){
                System.out.println("Mohon masukkan angka sesuai Menu Paket yang tersedia!");
                System.out.println("\nMasukkan nomer dari menu :");
                pesanan=input.nextInt();
            }
        System.out.println("Berapa jumlah yang ingin dipesan?");
        jumlah=input.nextInt();
        
        String[] nama={"Nasi+Ayam geprek","Nasi+Ayam crispy","Nasi+Ayam geprek+Minum","Nasi+Ayam crispy+Minum"};
        int[] harga={10000,9000,15000,14000};
        
        switch (pesanan) {
            case 1:
                System.out.println("Anda memesan "+nama[0]+" sebanyak "+jumlah+" porsi");
                System.out.println("Harga per porsi = Rp. "+harga[0]+",-");
                total=totalakhir+(harga[0]*jumlah);
                System.out.println("Total = Rp. "+(int)total+",-");
                break;
            case 2:
                System.out.println("Anda memesan "+nama[1]+" sebanyak "+jumlah+" porsi");
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
        jawaban=input.next();
        }while (jawaban.equalsIgnoreCase("y"));
            if (jawaban.equalsIgnoreCase("n")){
                System.out.println("Masukkan nama anda untuk klaim diskon : *Mohon huruf pertama menggunakan huruf besar");
                namaplg=input.next();
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
}
