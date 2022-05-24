package Models.Properties;

public class Property {

    private String name;
    private String owner;
    private int price;

    private int rent;

    private int totalInSet = 3;

    private PropertyType type ;

    public Property(String name, String owner, int price, int rent, int totalInSet, PropertyType type) {
        this.name = name;
        this.owner = owner;
        this.price = price;
        this.rent = rent;
        this.totalInSet = totalInSet;
        this.type = type;

        switch (type){
            case UTILITY:
                setTotalInSet(2);
                setPrice(150);
                break;
//            case AIRPORT:
//                setTotalInSet(4);
//                setPrice(200);

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getTotalInSet() {
        return totalInSet;
    }

    public void setTotalInSet(int totalInSet) {
        this.totalInSet = totalInSet;
    }
}
