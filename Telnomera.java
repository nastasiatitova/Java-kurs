import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Telnomera {
    Map<String, List<Integer>> map = new HashMap<>();
    
        void add(String name, Integer num){

            List<Integer> current = map.get(name);
        if (current == null) {
            current = new ArrayList<Integer>();
            map.put(name,current);
        } 
        current.add(num);
    }


    String getbyName(String name){ 
       
        return name + " : " + map.get(name);
    }

    String getbyNum(Integer num){
        
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry:
                map.entrySet()) {
            if(entry.getValue().equals(num)){
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(num);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }


    String delit(String name){
        if (name!=null){
        map.remove(name); 
    }
    return map.toString();
}
    String getAll(){
       
        return map.toString();
    }
}