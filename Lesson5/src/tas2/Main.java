package tas2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
    Teacher tv = new Teacher("Татьяна", "Викторовна");
    Teacher nv = new Teacher("Наталья","Васильевна");
    Teacher sn = new Teacher("Светлана","Николаевна");

    teachers.add(tv);
    teachers.add(nv);
    teachers.add(sn);

        System.out.print("Индекс лучшего учителя: ");
        System.out.println(teachers.indexOf(tv));
        System.out.print("Индекс учителя неочень: ");
        System.out.println(teachers.indexOf(nv));

        for (int i = 0; i < teachers.size(); i++) {
            System.out.print(teachers.get(i).getName() + " ");
            System.out.println(teachers.get(i).getLast());
        }

        }
}
