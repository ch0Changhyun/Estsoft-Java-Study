package classThriteen;

import java.util.ArrayList;
import java.util.List;
public class mainthriteen {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        // element search
        String element1 = list.get(0);
        boolean isContains = list.contains("1");
        System.out.println(element1);
        System.out.println("isContains = " + isContains);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //element delete
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list.clear();
    }

}
