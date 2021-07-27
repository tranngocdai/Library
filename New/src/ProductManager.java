import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> listProducts = new ArrayList<>();

    public ProductManager(){
        listProducts = new ArrayList<>();
    }

    public void add(Product e){
        listProducts.add(e);
    }

    public void edit(int id, Product e){
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id){
                listProducts.set(i , e);
                break;
            }
        }
    }

    public void delete(int id){
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId()  == id){
                listProducts.remove(id);
                break;
            }
        }
    }

    public void displayList(){
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }

    public Product searchByName(String name){
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).equals(name))
                return listProducts.get(i);
        }
        return null;
    }

    public void sortUp(){
        Collections.sort(listProducts);
    }

    public void sortDown(){
        sortUp();
        Collections.reverse(listProducts);
    }
}
