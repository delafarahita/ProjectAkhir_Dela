public class HargaMenu {
    public String harga[][] = { 
        { "20000 ", "30000 ", "45000" },
        { "30000 ", "50000 ", "25000" },
        { "20000 ", "25000 ", "35000" },
        { "20000 ", "25000 ", "30000" },
        { "30000 ", "40000 ", "10000" },
    };

    public void cetakHarga() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(harga[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
