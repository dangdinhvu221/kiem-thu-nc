package fpoly;

public class Person {
    private final String name;
    private  final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if(age <= 0 || age >= 68){
            throw new IllegalArgumentException("Invalid : " + age);
        }
    }

}
