package com.LeetCode.Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculator {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Co-ordionates X1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float x1 = Float.parseFloat(reader.readLine());

        System.out.println("Enter Co-ordionates Y1");
        float y1 = Float.parseFloat(reader.readLine());

        System.out.println("Enter Co-ordionates X2");
        float x2 = Float.parseFloat(reader.readLine());

        System.out.println("Enter Co-ordionates Y2");
        float y2 = Float.parseFloat(reader.readLine());

        System.out.println("Enter Co-ordionates X3");
        float x3 = Float.parseFloat(reader.readLine());

        System.out.println("Enter Co-ordionates Y3");
        float y3 = Float.parseFloat(reader.readLine());

        float side1 = (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y2 - y1), 2));
        float side2 = (float) Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        float side3 = (float) Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        float s = (side1 + side2 + side3) / 2;
        // double s = Double.parseDouble(x1+x2+x3);
        float area = s * (s - side1) * (s - side2) * (s - side3);
        System.out.println("AREA SQ" + area);
        double finalAnswer = Math.sqrt(area);

        System.out.println("AREA = " + finalAnswer);
    }
}
