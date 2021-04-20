package lab10.resources;

import lab10.Coin;
import lab10.Ticket;

import java.util.List;

public interface IAutomatResoureces {

 int add(Coin coin);

 List<Coin> returnCoins();

 void giveChangeBacK(List<Coin> coinList);




}
