import java.util.Scanner;

public class ShowPosition {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj X");
        a=input.nextInt();
        System.out.println("Podaj Y");
        b=input.nextInt();

        if (a>0&&b>0){
            System.out.println("Punkt ("+a+", "+b+") leży w I ćwiartce układu współrzędnych.");
        } else if(a<0&&b>0){
            System.out.println("Punkt ("+a+", "+b+") leży w II ćwiartce układu współrzędnych.");
        }else if(a<0&&b<0){
            System.out.println("Punkt ("+a+", "+b+") leży w III ćwiartce układu współrzędnych.");
        }else if(a>0&&b<0){
            System.out.println("Punkt ("+a+", "+b+") leży w IV ćwiartce układu współrzędnych.");
        }
    }
}