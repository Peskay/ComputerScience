// StudentClass
// Thomas Huber - 12/4/17

public class StudentClass {

    boolean ibDiploma;
    String name;
    int studentNum;

    public void set(boolean dip, String nm, int num) {
        ibDiploma = dip;
        name = nm;
        studentNum = num;
    }

    public void get() {
        System.out.println(ibDiploma);
        System.out.println(name);
        System.out.println(studentNum);
    }
}

