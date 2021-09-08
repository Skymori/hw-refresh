package hw_3;

import java.util.Scanner;

public class PassportFormCreator {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.close();
        age = age * 10;
        System.out.println(firstname+" "+lastname+" "+age);
        System.out.println(firstname.toUpperCase()+"\n"+lastname.toUpperCase()+"\n"+age);
    }
}
