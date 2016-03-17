package net.batkin.test;

public class Child extends Parent {

    protected Child() {
    }

    public Child(String name, int age) {
        super("child", name);
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name=" + name + ", " +
                "type=" + type + ", " +
                "age=" + age +
                '}';
    }
}
