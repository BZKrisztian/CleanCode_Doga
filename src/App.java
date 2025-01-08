/*Refaktoralo: Batki Zoltan Krisztian*/
/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Jelszavak\nVerzió: 0.0.1");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String userName = scanner.nextLine();

        System.out.print("Jelszó: ");
        String passWord = scanner.nextLine();

        System.out.print("Hely: ");
        String location = scanner.nextLine();

        scanner.close();

        try {
            Store passList = new Store(userName, passWord, location);
            
            PrintWriter pWriter = new PrintWriter(new FileWriter("pass.txt"));
            pWriter.print(passList.get_user());
            pWriter.print(passList.get_pass());
            pWriter.print(passList.get_place());
            pWriter.close();    
            System.out.println("Sikeres fájlba irás!");
        }
        catch (IOException e) {
            System.out.println("Hiba a fájlba irásban!");
        }

    }

}
