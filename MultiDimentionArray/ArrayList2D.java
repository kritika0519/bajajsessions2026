package MultiDimentionArray;

import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c = new ArrayList<>();
        c.add(60);c.add(70);c.add(80);c.add(90);c.add(100);
        List<Integer> d= new ArrayList<>();
        d.add(110);d.add(120);

        List<List<Integer>> l =new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);
        // l.add(new ArrayList<>(a)); 
        // l.add(new ArrayList<>(b)); 
        // l.add(new ArrayList<>(c)); 
        // l.add(new ArrayList<>(d));

        for (int i = 0; i < l.size(); i++) {
            //size of each inner list
            List<Integer>  x = l.get(i);
            for(int j=0;j< x.size();j++){
                System.out.print( x.get(j)+"\t");
            }
            System.out.println(); 
        }
    }
    
}
