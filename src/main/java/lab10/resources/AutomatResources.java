package lab10.resources;


import lab10.Coin;

import java.util.List;


public class AutomatResources implements IAutomatResoureces {


    private ICoinResources coins = new CoinResources();
    private ICoinBuffer coinBuffer = new CoinBuffer();


    @Override
    public int add(Coin coin) {
        return coinBuffer.add(coin);
    }

    @Override
    public List<Coin> returnCoins() {
        return coinBuffer.returnCoins();
    }

    @Override
    public void giveChangeBacK(List<Coin> coinList) {
        coins.add(coinBuffer.returnCoins());
        coins.giveChangeBack(coinList);
    }

}
