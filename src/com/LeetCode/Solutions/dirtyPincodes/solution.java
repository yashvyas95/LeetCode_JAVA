package com.LeetCode.Solutions.dirtyPincodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

class ZipCode {
    String zipcode;
    String city;
    String county;

    ZipCode(String zipcode, String city, String county) {
        this.zipcode = zipcode;
        this.city = city;
        this.county = county;
    }
}

class ZipCode_County_Sorter implements Comparator<ZipCode> {
    public int compare(ZipCode z1, ZipCode z2) {
        return z1.county.compareTo(z2.county);
    }
}

class County_Sorter implements Comparator<County> {
    public int compare(County c1, County c2) {
        return c2.count_zipcode - c1.count_zipcode;
    }
}

class County {
    String name;
    int count_zipcode;

    County(String name, int count_zipcode) {
        this.name = name;
        this.count_zipcode = count_zipcode;
    }
}

public class solution {
    public static void main(String[] args) {
        System.out.println("Enter file name");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch (input) {

            case "ZipCodes.txt":
                methodZipCode();
                break;
            case "DirtyZipCodes.txt":
                break;
            default:
                break;
        }


    }

    public static void methodZipCode() {
        File f1 = new File("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\dirtyPincodes\\ZipCodes.txt");

        var zipcode = new ArrayList<ZipCode>();
        var county = new ArrayList<County>();
        ZipCode_County_Sorter sorter = new ZipCode_County_Sorter();
        County_Sorter sorter2 = new County_Sorter();
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String line = br.readLine();
            while (line != null) {
                String[] temp = line.split(",");
                ZipCode row = new ZipCode(temp[0], temp[1], temp[2]);
                if (!zipcode.contains(row)) {
                    zipcode.add(row);
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        zipcode.sort(sorter);

        for (ZipCode z_temp : zipcode) {
            var county_temp = new County(z_temp.county, 1);
            var c = county.stream().filter(c2 -> c2.name.equals(z_temp.county)).toArray();
            if (c.length == 0) {
                county.add(county_temp);
            } else {
                ++((County) c[0]).count_zipcode;
            }
        }
        county.sort(sorter2);
        System.out.println("#. County       Count of ZipCodes");
        System.out.println("*********************************");
        for (int i = 0; i < county.size(); i++) {
            System.out.println(i + " ." + county.get(i).name + "  :" + county.get(i).count_zipcode);
        }

    }

}
