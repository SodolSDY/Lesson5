package tas2;

public class Teacher {
    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }


    private String name;
    private String last;

    public Teacher(String name, String last) {
        this.name = name;
        this.last = last;
    }
}
