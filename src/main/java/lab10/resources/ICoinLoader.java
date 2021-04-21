package lab10.resources;

import lab10.Coin;

import java.util.List;

public interface ICoinLoader {

    int add(Coin coin);

//    int getCoinsValue();

    List<Coin> returnCoins();
}
