package Cast;

public abstract class Animal {
    String name = "Marat";
    String surname = "Khusyainov";
    int age = 33;
    String nameOfClass = getClass().getSimpleName();
    public void eat(){
        System.out.println(nameOfClass);
    }

}
