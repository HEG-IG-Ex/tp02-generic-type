public class Product extends Data implements Additionable<Integer>{
    private String name;
    private int price;

    public Product(int no, String name, int price) {
        super(no);
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Integer getMemberToAddition() {
        return new Integer(price);
    }
}
