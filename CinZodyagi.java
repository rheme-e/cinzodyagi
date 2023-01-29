package Giris;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int a;
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        a=inp.nextInt();

        if(a % 12 == 0){
            System.out.println("Çin Zodyağı Burcunuz Maymun");
        }
        if(a % 12 == 1){
            System.out.println("Çin Zodyağı Burcunuz Horoz");
        }
        if(a % 12 == 2){
            System.out.println("Çin Zodyağı Burcunuz Köpek");
        }
        if(a % 12 == 3){
            System.out.println("Çin Zodyağı Burcunuz Domuz");
        }
        if(a % 12 == 4){
            System.out.println("Çin Zodyağı Burcunuz Fare");
        }
        if(a % 12 == 5){
            System.out.println("Çin Zodyağı Burcunuz Öküz");
        }
        if(a % 12 == 6){
            System.out.println("Çin Zodyağı Burcunuz Kaplan");
        }
        if(a % 12 == 7){
            System.out.println("Çin Zodyağı Burcunuz Tavşan");
        }
        if(a % 12 == 8){
            System.out.println("Çin Zodyağı Burcunuz Ejderha");
        }
        if(a % 12 == 9){
            System.out.println("Çin Zodyağı Burcunuz Yılan");
        }
        if(a % 12 == 10){
            System.out.println("Çin Zodyağı Burcunuz At");
        }
        if(a % 12 == 11){
            System.out.println("Çin Zodyağı Burcunuz Koyun");
        }


    }
}
