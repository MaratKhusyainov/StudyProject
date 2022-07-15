package Cast;

public abstract class Animal {
    String name2 = "Ivan";
    String name;
    int age;
    String nameOfClass = getClass().getSimpleName();
    public void eat(){
        System.out.println(nameOfClass);
    }

}
