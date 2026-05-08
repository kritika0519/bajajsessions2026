import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"kartikeya");
        map.put(2, "ritzy");
        map.put(3, "amar");

        System.out.println(map);

        String student=map.get(3);
        System.out.println(student);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("amar"));

        // Set<Integer> keys= map.keySet();
        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

       Set<Map.Entry<Integer, String>> entries = map.entrySet();

       for(Map.Entry<Integer, String> entry :entries){
        System.out.println(entry.getKey()+": "+ entry.getValue());
       }

    }
}
