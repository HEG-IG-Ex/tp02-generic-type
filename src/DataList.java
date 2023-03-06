import java.util.*;

public class DataList<T extends Valuable<?>> extends ArrayList<T> {

    public double getTotal(){
        double total = 0;
        for (T t:this) {
            total += t.getValue().doubleValue();
        }
        return total;
    }

    public double getAverage(){
        if(this.isEmpty()){
            return 0;
        }
        return this.getTotal() / this.size();
    }

}

