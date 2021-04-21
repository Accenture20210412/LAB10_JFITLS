package lab10.resources;

import lab10.Coin;

import java.util.List;

public interface ICoinResources {

    void add(List<Coin> coinList);

    List<Coin> giveChangeBack(int change);

}