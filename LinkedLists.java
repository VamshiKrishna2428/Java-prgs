import java.util.*;
public class LinkedLists {
    public static void main(String [] args){
        LinkedList <String> list = new LinkedList <String>();
        list.add("is");
        list.addFirst("name");
        list.addFirst("my");
        list.addLast("bunty");
        System.out.println(list);
        list.add("and");
        list.add(5,"to");
        list.add("vk");
        System.out.println(list);
        list.remove(6);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.get(3));  
        System.out.println(list.size());
        
    }
}
