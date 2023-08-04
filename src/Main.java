
public class Main {
    public static void main(String[] args) {

        System.out.println("Print even numbers");
        for(int i =0;i<=100;i  = i + 2){
            System.out.println(i);
        }

        System.out.println("Print odd numbers");
        int j = 1;
        while (j <= 100){
            if(j%2!=0) {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("Print primary numbers");
        int p = 1;
        do {
            if(p != 1 && p % 2 !=0 && p % 3 != 0 && p % 5 !=0 && p % 7 !=0 || p == 2 || p == 3 || p == 5 || p == 7 ){
                System.out.println(p);
            }
           p++;
        }while (p <=100);

    }
}