package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"Z","I","I");
        Object [] objectArray = collection.toArray();
        String [] stringArray = collection.toArray(new String[0]);
            System.out.println(collection);

    }
}
