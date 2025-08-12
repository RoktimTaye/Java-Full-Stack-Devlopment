package LIST;

import java.util.LinkedList;
import java.util.List;

public class LinkdList2 {
    public static void main(String[] args) {
        List<String> MyLinkdList = new LinkedList<>();
        MyLinkdList.add("Aman");
        MyLinkdList.add("Amish");
        MyLinkdList.add("Arnav");
        MyLinkdList.add("Avish");
        System.out.println("Name List : "+MyLinkdList);

        MyLinkdList.removeFirst();

        System.out.println("List : "+MyLinkdList);

        MyLinkdList.removeLast();

        System.out.println("List : "+MyLinkdList);
    }
}
