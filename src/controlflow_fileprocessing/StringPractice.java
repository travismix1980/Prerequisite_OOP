package controlflow_fileprocessing;

public class StringPractice {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        String a = "hello";
        System.out.println(a.length());
        String str = "ABCDEFG";
        String extractedString = str.substring(3,6);
        System.out.println(extractedString);

        String c = "hello";
        String d = "there";

        if(c.equals(a)){
            System.out.println("They are the same");
        }
    }
}
