package lab10.resources;


import lab10.Coin;

import java.util.List;


public class AutomatResources implements IAutomatResoureces {


    private ICoinResources coins = new CoinResources();
    private ICoinLoader coinLoader = new CoinLoader();


    @Override
    public int load(Coin coin) {
        return coinLoader.add(coin);
    }

    @Override
    public List<Coin> returnCoins() {
        return coinLoader.returnCoins();
    }
//TODO:: przeredagować ten kod
    @Override
    public List<Coin> giveChangeBacK(int change) {
        List<Coin> coinsToReturn;
        coinsToReturn = coins.giveChangeBack(change);
        if(coinsToReturn.isEmpty()) {
            return coinLoader.returnCoins();
        }
        coins.add(coinLoader.returnCoins());
        return coinsToReturn;
    }
}
