import java.util.AbstractList;

public class DataList <T> extends AbstractList {

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public Number getTotal(){
        for (Object el : this) {
            el
        };
    }

    public Double getAverage(){
        return this.getTotal() / (Number) this.size();
    }


}
