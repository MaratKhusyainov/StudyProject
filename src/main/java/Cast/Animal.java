package Cast;

public abstract class Animal {
    String name;
    int age;
    int agile;
    String nameOfClass = getClass().getSimpleName();
    public void eat(){
        System.out.println(nameOfClass);
    }

}
