package Lab8;
import java.io.Serializable;

public class ProductDAO extends DAO<Product>{

    @Override
    public void update(Product p) {
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).getName().equalsIgnoreCase(p.getName())){
                ds.set(i, p);
                break;
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for(Product p: ds){
            if(p.getName().equals(id)) return p;
        }
        return null;
    }
    
}
