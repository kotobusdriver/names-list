package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // Метод повертає список імен
    public List<String> getData() {
        String[] array = {"Alice", "Bob", "Lucy", "Denis", "Tom"};
        List<String> list = new ArrayList<>();
        for (String s : array) {
            list.add(s);
        }
        return list;
    }
}
