package com.serenitydojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhenCreatingObjectsTest {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assertions.assertEquals(fido.getName(), "Fido");
        Assertions.assertEquals(fido.getFavoriteToy(), "Bone");
        Assertions.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        String dogSound = fido.makeNoise();

        Assertions.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:
        fido.feed(true);

        Assertions.assertTrue(Dog.isFed());

    }
}
