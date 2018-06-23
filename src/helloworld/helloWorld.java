package helloworld;

import java.util.ArrayList;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");

        String hW = "Hello world";
        System.out.println(hW);

        String hWArray[] = {"Hello world"};
        for(String i: hWArray) {
            System.out.println(i);
        }

        ArrayList<String> hWList = new ArrayList<>();
        hWList.add("Hello world");
        for(String i: hWList){
            System.out.println(i);
        }
    }
}
