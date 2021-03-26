package com.LeetCode.Solutions.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Rainbow {

    String[][] colorVotes;  //stores the data read from the file
    String[] colors; //stores the list of unique colors voted for
    int[] voteCounts; //stored the count the vote for each color. The count of votes for the color in votedColors[i] will be stored in voteCounts[i]

    public static void main(String[] args) throws FileNotFoundException {
        Rainbow rainbow = new Rainbow();
        Scanner input = new Scanner(System.in);
        System.out.println("Colors.txt");
        String filename = input.nextLine();
        rainbow.readFile(filename);
        rainbow.calculateVoteCounts();
        rainbow.printVoteCounts();
        input.close();
    }

    //Color

    /**
     * readFile reads the file with filename,
     * and loads the data into colorVotes.
     */
    void readFile(String filename) throws FileNotFoundException {
//write your code here
        File file = new File("C:/Users/Itachi_yv/IdeaProjects/LeetCode_JAVA/src/com/LeetCode/Solutions/questions/Colors.txt");
        Scanner sc = new Scanner(file);

        colorVotes = new String[(int) file.length()][];
        int k = 0;
        try {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] rows = data.trim().split(",");
                colorVotes[k] = rows;
                k++;

                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

//Filename
    }

    /**
     * calculateVoteCounts() populates the colors array with unique colors
     * and then counts votes for each unique color in colorVotes array.
     * The count for colors[i] is stored in voteCounts[i]
     */
    void calculateVoteCounts() {
//write your code here
        StringBuilder builder = new StringBuilder();
        for (String[] dataFromText : colorVotes) {
            for (String colors : dataFromText) {
                //String[] colorsPerRow = builder.toString().split(",");
                if (builder.length() == 0) {
                    builder.append(colors + ",");
                } else {
                    String[] rowsFromBuilder = builder.toString().split(",");
                    for (int i = 0; i < rowsFromBuilder.length; i++) {
                        if (rowsFromBuilder[i].trim().equalsIgnoreCase(colors)) {

                            break;
                        } else {
                            if (i == rowsFromBuilder.length - 1) {
                                builder.append(colors + ",");
                                break;
                            }
                        }

                    }

                }


            }
            colors = builder.toString().split(",");
        }
    }


    /**
     * printVoteCounts[] prints the output as shown in the hand-out
     */
    void printVoteCounts() {
//write your code here
    }

}

