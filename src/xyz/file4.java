package xyz;

import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        Scanner takeaway;
        String[] Niggas;
        Integer num;
        takeaway = new Scanner(System.in);
        System.out.println("How many Niggas do you Have?");
        num = takeaway.nextInt();
        Niggas = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter name" + (i + 1));
            Niggas[i] = takeaway.next();
        }
        for (int i=0;i<num; i++){
            System.out.println((i+1)+"" +Niggas[i]);
        }
    }
}
