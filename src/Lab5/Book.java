package Lab5;

public class Book {
    private Integer ID;
    private String title;
    private Float price;

    public Book(Integer ID, String title, Float price) {
        this.ID = ID;
        this.title = title;
        this.price = price;
    }
    public Book() {
    }
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    
    public Object[] toRow(){
        return new Object[]{
            ID, title, price
        };
    }
    
}
