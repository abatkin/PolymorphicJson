package net.batkin.test;

public class Pet extends Parent {

    protected Pet() {
    }

    public Pet(String name, int legs) {
        super("pet", name);
        this.legs = legs;
    }

    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name=" + name + ", " +
                "type=" + type + ", " +
                "legs=" + legs +
                '}';
    }
}
