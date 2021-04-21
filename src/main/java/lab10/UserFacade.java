package main.java.lab10;

import java.util.List;

public interface UserFacade {
    void breakOperation();
    void exit();
    int sumCoins();
    Ticket chooseTicket();
    List<Integer> addCoins();
    void buyTicket();
}