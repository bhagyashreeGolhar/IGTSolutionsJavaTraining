import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.*;

import javafx.scene.effect.Light.Spot;

public class ListCollection
{
    public static void main(String[] args) {
        
       /* List<String> listint= new List.of("Dog","Cat");  // immutable List
        System.out.println("Index thirs element in integer list:"+listint.get(3));*/
        
        //********ArrayList*********
        List<String> list1=new ArrayList<String>();  //mutable List
        list1.add("Cat");
        System.out.println("Index 0 element in List crrated using ArrayList:"+list1.get(0));
        //list1.addAll(0, listint);  //add all elemnts of listint to list1
        list1.set(0, "Bat");  // to update element of 0th index
        list1.remove(0);



        //********Linkedliist****************
        List<String> listLinkedList=new LinkedList<String>();
        listLinkedList.add("Cat");
        System.out.println("Index 0 element in List crrated using LinkedList:"+listLinkedList.get(0));



        //*******Vector******
        List<String> listVector=new Vector<>();
        listVector.add("bag");
        listVector.add("cat");
        System.out.println("Index 0 element in List crrated using Vector:"+listVector.get(0));
        
    }
}