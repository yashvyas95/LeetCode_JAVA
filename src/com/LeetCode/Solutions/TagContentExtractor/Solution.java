package com.LeetCode.Solutions.TagContentExtractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void contentExtractor(String line) {
        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(line);

        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("None");
        }

    }
}
