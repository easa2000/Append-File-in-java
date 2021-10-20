//import java.io.*;
//
//public class AppendFileDemo {
//    public static void main(String[] args) {
//        try{
//            String content = "This is my content which would be appended"
//                    + " at the end of the specified file";
//            File file = new File("content.txt");
//            if(!file.exists()) {.
//                file.createNewFile();
//            }
//            FileWriter fileWriter = new FileWriter(file,true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(content);
//            bufferedWriter.close();
//            System.out.println("Data is successfully added at the end of the file");
//
//        }catch (IOException e){
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
//        }
//    }
//}


import java.io.*;

public class AppendFileDemo {
    public static void main(String[] args) {
        String content = "Hi My name is mahudoom naina" +
                " I am from Kayalpattinam, Thoothukudi" +
                " I Completed My higher class in Muhyiddeen Matriculation Higher Secondary School " +
                " Now i am studying st Joseph College of Engineering - B.Tech IT";
        try{
            File file = new File("Content.txt");
//            if(!(file.exists())) {
//                file.createNewFile();
//            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
//            System.out.println("Data is Successfully added");

        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
