package GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public int countOfGreaterItems(T element){
       return (int)values.stream().filter(itemFromBox -> itemFromBox.compareTo(element) > 0).count();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : values) {
            sb.append(String.format("%s: %s", element.getClass().getName(), element))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
