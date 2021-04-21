package lab10.resources;

import lab10.Coin;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class CoinLoader implements ICoinLoader {

    private List<Coin> coinBuffer;

    public CoinLoader() {
        coinBuffer = new LinkedList<>();
    }

    @Override
    public int add(Coin coin) {
        coinBuffer.add(coin);
        return getCoinsValue();
    }


    private int getCoinsValue() {
        int value = 0;
        for (Coin i : coinBuffer) {
            value += i.getValue();
        }
        return value;
    }

    @Override
    public List<Coin> returnCoins() {
        List<Coin> coinsToReturn = new LinkedList<>(coinBuffer);
        coinBuffer.clear();
        return coinsToReturn;
    }
}
