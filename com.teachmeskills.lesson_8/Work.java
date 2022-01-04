package com.teachmeskills.lesson_8;

public class Work {
    public static void main(String[] args) {
        Vector vector = new Vector(12 , 22);
        Vector2 vector2 = new Vector2(12 , 22 , 33);
        System.out.println(vector.equals(vector2));
        System.out.println(vector.toString());
        System.out.println(vector2.toString());
    }
}
