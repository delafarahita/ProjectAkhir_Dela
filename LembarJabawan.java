public class LembarJabawan {
    public String menu[][] = { 
            { "Salad \t", "Chicken Soup ", "Apple Pie " },
            { "Nasi Goreng ", "Spagetti ", "Ayam Goreng " },
            { "Pudding ", "Brownies ", "Cheese Cake " },
            { "Americano ", "Thai Tea ", "Matcha \t" },
            { "Geprek \t", "Teh Anget ", "Mie Ayam " },
    };

    public void cetakMenu() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(menu[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
