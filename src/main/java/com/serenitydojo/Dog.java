package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private final String usualNoise;
    private static boolean haveEaten;

    public final static String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.usualNoise = getUsualNoise();
    }

    private static String getUsualNoise() {
        return Dog.DOG_NOISE;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public static boolean isFed() {
        return (haveEaten);
    }

    public String makeNoise() {
        return this.usualNoise;
    }

    public void feed(boolean bool) {
        fedTheDog(bool);
    }

    private void fedTheDog(boolean bool) {
        haveEaten = bool;
    }
}
