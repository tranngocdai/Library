public class Main {
    public static void main(String[] args) {
        Product pro1 = new Product(01, "007", 750);
        Product pro2 = new Product(02, "002", 250);
        Product pro3 = new Product(03, "003", 350);
        Product pro4 = new Product(04, "009", 550);
        ProductManager dai = new ProductManager();
        dai.add(pro1);
        dai.add(pro2);
        dai.add(pro3);
        dai.add(pro4);
        dai.sortUp();
        dai.displayList();
        dai.sortDown();
        dai.displayList();
    }
}
