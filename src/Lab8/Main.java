package Lab8;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("p1", 1000.0);
        Product p2 = new Product("p2", 2000.0);
        
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        
        try {
//            dao.write("D:\\Java2_data\\Lab8.dat");
             dao.read("D:\\Java2_data\\Lab8.dat");
             
             Product p = dao.find("p1");
             System.out.println(p.getName()+" "+p.getPrice());
        }catch(Exception e){}
    }
}
