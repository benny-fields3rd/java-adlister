import java.io.Serializable;

public class Product implements Serializable {
    private long id;
    private int price;
    private String name;
    private String description;

    public Product () {
    }

    public Product (long id, String name, String description, int price) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }
}
