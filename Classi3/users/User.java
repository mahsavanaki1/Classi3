package users;

public class User {

    private String name;
    private String family;
    private int age;

    public User(String name, String family, int age) {
        setName(name);
        setFamily(family);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age Shoulde be More than 0 !");
        }
    }

    @Override
    public String toString() {
        return String.format("name: %s, family: %s, age: %d", getName(), getFamily(), getAge());
    }

}
