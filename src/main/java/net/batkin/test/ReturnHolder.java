package net.batkin.test;

import java.util.List;

public class ReturnHolder {

    private List<Parent> livingThings;

    public List<Parent> getLivingThings() {
        return livingThings;
    }

    public void setLivingThings(List<Parent> livingThings) {
        this.livingThings = livingThings;
    }

    @Override
    public String toString() {
        return "ReturnHolder{" +
                "livingThings=" + livingThings +
                '}';
    }
}
