package net.batkin.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();

        List<Parent> beings = new ArrayList<Parent>();

        Child child = new Child("Bobby Tables", 7);

        Pet pet = new Pet("Fluffy", 4);

        beings.add(child);
        beings.add(pet);

        ReturnHolder holder = new ReturnHolder();
        holder.setLivingThings(beings);

        System.out.println(holder);

        String json = om.writeValueAsString(holder);
        System.out.println(json);

        ReturnHolder newHolder = om.readValue(json, ReturnHolder.class);

        System.out.println(newHolder);
    }

}
