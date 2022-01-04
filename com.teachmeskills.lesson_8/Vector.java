package com.teachmeskills.lesson_8;

public class Vector {

    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double length() {
        return Math.sqrt(x * x + y * y);
    }

    private double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y;
    }

    private Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y
        );
    }

    private Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y
        );
        }
        static int[] generate(int n) {
            int [] vectors = new int[n];
            for(int i =0; i < n; i++){
                vectors[i] = i ;
            }
            return vectors;
        }
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    }
