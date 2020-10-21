package com.Concepts.File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileConcepts {
    /*
    public static void main(String[] args){
        File dir3 = new File("C:\\Users\\Yash\\IdeaProjects\\Git_LeetCode\\src\\com\\Concepts\\File\\dir3");
        dir3.mkdir();

        System.out.println("DIR3 is file? "+dir3.isFile()+"--------"+dir3.exists());
        File file3 = new File(dir3,"File3.txt");
        try {
            file3.createNewFile();
        }
        catch(IOException e){
            System.out.println("Interrupted");
        }
        System.out.println(" " + file3.isFile());

    }
}

    public static void main(String[] args){
        String s;
        try{
            FileReader fr = new FileReader("File3.txt");
            BufferedReader br = new BufferedReader(fr);
            while((s = br.readLine())!=null){
                System.out.println(s);
            }
            br.flush();
        }
        catch(Exception e){}
    }



    public class MyFileVisitor extends SimpleFileVisitor<Path>{
            public FileVisitResult visitFile()throws IOException{
                System.out.println("File"+file);
                if(file.getName().endsWith(0)){}
            }
    }*/
    public static void main(String[] args){
        Path one = Paths.get("C:\\Users\\Yash\\IdeaProjects\\Git_LeetCode\\src\\com\\Concepts");
        Path two = Paths.get("C:\\Users\\Yash\\IdeaProjects\\Git_LeetCode\\src\\com\\Concepts\\File\\dir3");
        /*
        try{Files.move(two);
            System.out.println("-----" + Files.exists(two));
        }catch(Exception e){System.out.println("-----" + Files.exists(two));}
        System.out.println(one.relativize(two));
    }
*/
    }
}