package lab10.resources;

import lab10.Coin;
import lab10.Ticket;

import java.util.List;

public interface IAutomatResoureces {

 int load(Coin coin);

 List<Coin> returnCoins();

 List<Coin> giveChangeBacK(int change);




}
