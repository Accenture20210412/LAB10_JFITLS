package main.java.lab10;


import java.util.Scanner;

public class View implements UserFacade{
    Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true){
            System.out.println("Wrzuć monetę");
            System.out.println("Wybierz bilet");
            System.out.println("Anuluj");
            System.out.println("Wyjdz");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addCoin();
                    break;
                case 2:
                    chooseTicket();
                    break;
                case 3:
                    breakOperation();
                case 4:
                    exit();
            }
        }
    }

    @Override
    public void addCoin() {

    }

    @Override
    public void chooseTicket() {

    }

    @Override
    public void breakOperation() {

    }

    @Override
    public void exit() {

    }


}