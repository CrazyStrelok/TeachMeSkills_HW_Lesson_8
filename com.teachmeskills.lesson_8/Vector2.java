package com.teachmeskills.lesson_8;

public class Vector2 {

    private  double x;
    private  double y;
    private  double z;

    public Vector2(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    private double scalarProduct(Vector2 vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    private Vector2 add(Vector2 vector) {
        return new Vector2(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    private Vector2 subtract(Vector2 vector) {
        return new Vector2(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector2[] generate(int n){
        Vector2[] vectors = new Vector2[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector2(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

