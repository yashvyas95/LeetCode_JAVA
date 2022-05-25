package com.LeetCode.Solutions.uniqueEmails;

import java.util.HashSet;

public class solution {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> processedEmails = new HashSet<String>();
        for(String s : emails)
        {
            String[] parts = s.split("@");
            parts[0] = parts[0].replaceAll("\\.","");
            if(parts[0].contains("+")){
                 parts[0] = parts[0].split("\\+")[0];
            }
            processedEmails.add(parts[0]+"@"+parts[1]);
        }
        return processedEmails.size();
    }

    public static void main(String[] args){
            String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
            numUniqueEmails(emails);
    }
}
