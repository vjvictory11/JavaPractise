package collections;

import java.util.Comparator;

public class Data implements Comparator<Data>, Comparable<Data> {

    int value;

    public Data(int val) {
        this.value = val;
    }

    @Override
    public int compare(Data d1, Data d2) {
        return d1.value - d2.value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Data o) {
        return this.value - o.value;
    }
}
