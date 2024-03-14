import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.print("Size etkinlik önerebilmemiz için hava sıcaklığını giriniz: ");
        sicaklik= input.nextInt();

        if (sicaklik<=5) {
            System.out.println("Bu havada kayak yapmaya gidebilirsiniz! ");
        }
        if (sicaklik>5 && sicaklik<=25){
            if (sicaklik>5 && sicaklik<15){
                System.out.println("Bu havada sinemaya gidebilirsiniz! ");
            }
            else if (sicaklik>=15 && sicaklik<=25){
                System.out.println("Bu havada pikniğe gidebilirsiniz! ");
            }
        }
        else if (sicaklik>25){
            System.out.println("Bu havada yüzmeye gidebilirsiniz! ");
        }
    }
}