package com.LeetCode.Solutions.dirtyPincodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class ZipCode2 {
    String zipcode;
    String city;
    String county;

    ZipCode2(String zipcode, String city, String county) {
        this.zipcode = zipcode;
        this.city = city;
        this.county = county;
    }

    @Override
    public String toString() {
        return new String(this.zipcode + "," + " " + this.city + "," + this.county);
    }
}

public class solution2 {


    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\dirtyPincodes\\DirtyZipCodes.txt");
        HashMap<String, ZipCode2> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String line = br.readLine();
            int dirty_row = 0;
            int duplicates = 0;
            while (line != null) {
                String[] temp = line.split(",");
                ZipCode2 row = new ZipCode2(temp[0], temp[1], temp[2]);
                if (map.containsKey(temp[0])) {
                    var row_temp = map.get(temp[0]);
                    if (row_temp.city.equals(temp[1]) && row_temp.county.equals(temp[2])) {
                        System.out.println("Duplicate found: " + row_temp.toString());
                        ++duplicates;
                    } else {
                        //row_temp.city=temp[1];
                        map.put(temp[0], row);
                        System.out.println("Overwritten: " + row_temp.toString() + " by " + row.toString());
                        ++dirty_row;
                    }
                } else {
                    map.put(temp[0], row);

                }
                line = br.readLine();
            }
            System.out.println(map.size() + "records loaded ," + duplicates + " duplicates ignored," + dirty_row + " dirty zipcodes overwritten");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Enter zipcode to search");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (map.containsKey(input)) {
            var temp = map.get(input);
            System.out.println("Found county: " + temp.county + ". city:" + temp.city);
        }

    }


}
