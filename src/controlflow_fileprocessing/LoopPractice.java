package controlflow_fileprocessing;

public class LoopPractice {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count++;
        }

        System.out.println();
        System.out.println();

        count = 0;
        do{
            System.out.println(count);
        }while(count < 0 );

        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String a : cars){
            System.out.println(a);
        }

        String helloString = "hello";
        for(int i = helloString.length(); i >= 0; i--){
            System.out.println(helloString.substring(i));
        }

        int[][] arr = {{0,1,2},{3,4,5},{6,7,8}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
