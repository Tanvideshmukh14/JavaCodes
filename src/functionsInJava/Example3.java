package functionsInJava;

import java.util.Scanner;

public class Example3 {

    public static float volumeOfCuboid(float l, float b, float h)
    {
        // calculating the volume of cuboid
        float volume = l * b * h;
        return volume;


    }

    public static void sayHello(String name)
    {
        System.out.println("Hello : " + name);
    }

    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        float len;
        float bre;
        float hei;
        float volume;

        System.out.println("Enter the l, b and h  : ");
        len = Input.nextFloat();
        bre = Input.nextFloat();
        hei = Input.nextFloat();

        volume = volumeOfCuboid(len,bre,hei);
        System.out.println("Volume : " + volume);

        sayHello(" Tanvi");

    }
}
