package lab10.resources;

import lab10.Coin;

import java.util.List;

public interface ICoinBuffer {

    int add(Coin coin);

    int getBufforValue();

    List<Coin> returnCoins();
}
