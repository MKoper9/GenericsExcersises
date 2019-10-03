package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList<T> {


    public List<T> convert(T[] array) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(i, array[i]);
        }
        return list;
    }

}


