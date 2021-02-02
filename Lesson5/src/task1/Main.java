package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Татьяна Викторовна");
        arrayList.add("Наталья Васильевна");
        arrayList.add("Светлана Николаевна");
        arrayList.add("Анна Валериевна");

        System.out.print("Индекс лучшего учителя: ");
        System.out.println(arrayList.indexOf("Татьяна Викторовна"));
        System.out.print("Индекс учителя неочень: ");
        System.out.println(arrayList.indexOf("Светлана Николаевна"));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
