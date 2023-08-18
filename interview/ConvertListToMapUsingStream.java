package org.coding.interview;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMapUsingStream {

    public static void main(String[] args){

        List<String> namesList = List.of("Arbaaz","Abhishek","Acchutam","Jinisha","Abhay","Acchutam","Arbaaz","Acchutam");


                 namesList.stream()
                .collect(Collectors.groupingBy(item -> item))
                         .forEach((arg1,arg2) -> {
                             System.out.println("Name: "+arg1+"    Occurance: "+arg2.size());
                         });



    }
}
