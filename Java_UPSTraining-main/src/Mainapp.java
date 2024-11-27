public class Mainapp {
    public static void main(String[]args){
        Inventory inv =new Inventory();
        inv.addproduct(new Product("Rava",32.08,1));
        inv.addproduct(new Product("Maggi",24.02,2));
        inv.addproduct(new Product("Cookies",56.8,3));
        inv.addproduct(new Product("Maggi",78.00,5));
        inv.displayproducts();
        System.out.print("Total inventory cost"+inv.gettoTalinv());
     inv.removeproduct("Rava");
     System.out.println("Updated inventory");
     inv.displayproducts();

    }
}
