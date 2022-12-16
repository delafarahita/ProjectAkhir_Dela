import java.util.Scanner;

public class kasir {
    
    public static void main(String[] args) {
        Scanner dela8 = new Scanner(System.in);
        int menu;

        System.out.println("1. Appetizer \n 2. Main Course \n 3. Dessert \n 4.Minuman");
        System.out.println("Pilih Jenis Menu : ");
        menu = dela8.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Salad", "Chicken Soup", "Apple Pie");
                break;
            case 2:
                System.out.println("Nasi Goreng", "Spagetti", "Ayam Goreng");
                break;
            case 3:
                System.out.println("Pudding", "Brownies", "Cheese Cake");
                break;
            case 4:
                System.out.println("Americano", "Thai Tea", "Matcha");
                break;
            default:
                System.out.println("Mohon maaf, menu tidak ada dalam pilihan");
                break;
        }
    }
}
