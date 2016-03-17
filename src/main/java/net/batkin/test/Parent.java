package net.batkin.test;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = Pet.class, name="pet"), @JsonSubTypes.Type(value = Child.class, name="child")})
public abstract class Parent {

    protected Parent() {
    }

    protected Parent(String type, String name) {
        this.type = type;
        this.name = name;
    }

    protected String type;

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
