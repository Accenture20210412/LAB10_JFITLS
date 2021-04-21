package main.java.lab10;

import java.util.*;

public class View implements UserFacade {
    private List<Integer> coins = new ArrayList<>();
    private Ticket currentTicket;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("1. Wrzuć monetę");
            System.out.println("2. Wybierz bilet");
            System.out.println("3. Sprawdz ilosc monet");
            System.out.println("4. Wyjdz");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addCoins();
                    break;
                case 2:
                    chooseTicket();
                    buyTicket();
                    break;
                case 3:
                    sumCoins();
                    break;
                case 4:
                    exit();
            }
        }
    }

        public List<Integer> addCoins(){
            System.out.println("Wrzuc monety");
        if (scanner.nextInt() == 1) {
            coins.add(Coin.ONE.getValue());
            System.out.println("Moneta dodana");
        } else if (scanner.nextInt() == 5) {
            coins.add(Coin.FIVE.getValue());
            System.out.println("Moneta dodana");
        } else if (scanner.nextInt() == 10) {
            coins.add(Coin.TEN.getValue());
            System.out.println("Moneta dodana");
        } else if (scanner.nextInt() == 25) {
            coins.add(Coin.TWENTY_FIVE.getValue());
            System.out.println("Moneta dodana");
        }
        return coins;
    }

    @Override
    public void buyTicket() {
        if (coins.equals(currentTicket)){
            System.out.println("Bilet kupiony");
        }else System.out.println("Za malo srodkow");
    }

    public Ticket chooseTicket(){
            System.out.println("Wybierz bilet: \n1. 1 Godzina\n2. 4 godziny\n3. 24 godziny");
            if (scanner.next().equals("1")){
                currentTicket = Ticket.ONE_HOUR_TICKET;
                System.out.println("Wybrano bilet na 1 godzine. Cena : " + Ticket.ONE_HOUR_TICKET.getPrice());
            }else if (scanner.next().equals("2")){
                currentTicket = Ticket.FOUR_HOUR_TICKET;
                System.out.println("Wybrano bilet na 4 godziny. Cena : " + Ticket.FOUR_HOUR_TICKET.getPrice());
            }else if (scanner.next().equals("3")){
                currentTicket = Ticket.TWENTY_HOUR_TICKET;
                System.out.println("Wybrano bilet na 24 godziny. Cena : " + Ticket.TWENTY_HOUR_TICKET.getPrice());
            }else System.out.println("Wprowadz poprawna wartosc");
            return currentTicket;
        }

        @Override
        public void breakOperation () {

        }

        @Override
        public void exit () {
            System.out.println("Do zobaczenia");
            System.exit(0);
        }

        public int sumCoins(){
        Integer sum = coins.stream().reduce(0,Integer::sum);
        if (sum == null){
            System.out.println("Brak monet");
        }
            System.out.println("Ilosc monet: " + sum);
        return sum;
    }

}