import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataList<Product> products = new DataList<>();

        Product p1 = new Product(1,"test", 10);
        Product p2 = new Product(2, "test2", 123);
        products.add(p1);
        products.add(p2);

        DataList<Account> accounts = new DataList<>();
        Account a1 = new Account(1,12345);
        Account a2 = new Account(2, 6789);
        accounts.add(a1);
        accounts.add(a2);

        System.out.println("Products");
        System.out.println("==============================================");
        System.out.println("Total : " + products.getTotal());
        System.out.println("Average : " + products.getAverage());

        System.out.println("Accounts");
        System.out.println("==============================================");
        System.out.println("Total : " + accounts.getTotal());
        System.out.println("Average : " + accounts.getAverage());


    }

}
