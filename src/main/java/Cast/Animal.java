package Cast;

public abstract class Animal {
    String name;
    int age;
    int age2;
    int age3;
    String nameOfClass = getClass().getSimpleName();
    public void eat(){
        System.out.println(nameOfClass);
    }

}
