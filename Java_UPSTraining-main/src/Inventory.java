import java.awt.*;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product>products;
    Inventory(){
        products=new ArrayList<>();
    }
    public void addproduct(Product pro){
        for(Product p : products){
            if(p.getName().equals(pro.getName())){
                p.setQuantity(p.getQuantity()+pro.getQuantity());
                p.setPrice(p.getPrice()+pro.getPrice());
                return;
            }
        }
        products.add(pro);
    }
    public void removeproduct(String proname){
        products.removeIf(p->p.getName().equals(proname));
    }
    public void displayproducts(){
        for(Product p:products){
            System.out.println("Product name :" + p.getName() + "Product price " + p.getPrice()+ "Product Quantity " + p.getQuantity());
        }
    }
    public double gettoTalinv(){
        double total=0.0;
        for(Product p : products ){
            total+=p.getPrice()*p.getQuantity();
        }
        return total;
    }
}
