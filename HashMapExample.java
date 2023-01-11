package Jan7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        hmap1.put(10, "Aman ");
        hmap1.put(18, "Abhipsha ");
        hmap1.put(16,"Suraj ");
        hmap1.put(5, "Anurag ");
        hmap1.put(26, "Pratik ");
        Set set1 = hmap1.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
        Map.Entry ment1 = (Map.Entry) iterator1.next();
        System.out.println("The value is: " + ment1.getValue() + " and key is: " +
        ment1.getKey());
        }
        String va = hmap1.get(2);
        System.out.println("Index 2 has value of " + va);
        hmap1.remove(16);
        Set set2 = hmap1.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
        Map.Entry ment2 = (Map.Entry) iterator2.next();
        System.out.println("Now value is " + ment2.getValue() + "and key is: " +
        ment2.getKey());
        }
        }
        }
    

