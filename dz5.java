import java.util.*;
import javax.print.MultiDoc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class dz5 {
    public static void main(String[] args) {
     
     task();
     
    }
          
     static void task(){
        Telnomera telnomera = new Telnomera();
        telnomera.add("Ivan", 258963);
        telnomera.add("Jora", 789632);
        telnomera.add("Lera", 891245);
        telnomera.add("Sonia", 237845);
        telnomera.add("Efina", 339977);
        telnomera.add("Jora", 787744);

        System.out.println(telnomera.getAll());
        //System.out.println(telnomera.getbyNum(789632));
        System.out.println(telnomera.getbyName("Lera"));
        telnomera.delit("Lera");
        System.out.println(telnomera.getAll());
    }
}

