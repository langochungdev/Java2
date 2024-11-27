package Lab8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<Entity>{
    protected List<Entity> ds = new ArrayList<>();
    
    public void add(Entity e){
        ds.add(e);
    }
    public void remove(Entity e){
        ds.remove(e);
    }
    
    abstract public void update(Entity e);
    abstract public Entity find(Serializable id);
    
    public List<Entity> getList(){
        return ds;
    }
    
    public void read(String path) throws ClassNotFoundException, IOException, FileNotFoundException{
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){ // auto ois.close();
            ds = (List<Entity>) ois.readObject();
        }
    }
    
    public void write(String path) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(ds);
        }
    }
}
