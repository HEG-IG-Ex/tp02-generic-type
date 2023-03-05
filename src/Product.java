public class Product implements Additionable<Integer>{
    private int no;
    private String name;
    private int price;

    @Override
    public Integer getMemberToAddition() {
        return new Integer(price);
    }
}
