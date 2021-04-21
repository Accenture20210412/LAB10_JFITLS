package lab10.resources;

import lab10.Coin;

import java.util.*;
import java.util.stream.Collectors;

public class CoinResources implements ICoinResources {
    Map<Coin,Integer> coins;

    public CoinResources() {
        coins = new LinkedHashMap<>();
    }

    //// TODO:: Przenieść Metode fill do klasy która tworzy automat
    private void fillMachine() {
        for (Coin value : Coin.values()) {
            coins.put(value,5);
        }
    }

    @Override
    public void add(List<Coin> coinList) {
        for (Coin i : coinList) {
            addOne(i);
        }
    }

    // TODO:: Algorytm sprawdzający czy jestem wstanie wydać
    @Override
    public List<Coin> giveChangeBack(int change) {
//        List<Integer> coinsValues;
//         coinsValues = Arrays.stream(Coin.values())
//                .map(Coin::getValue)
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        for (Integer i : coinsValues) {
//            if( i > change) {
//                continue;
//            }
//
        List<Coin> coinsToReturn = new LinkedList<>();
        while (change > 0) {

        }
        return null;
    }

    private void addOne(Coin coin) {
        coins.merge(coin, 1, Integer::sum);
    }

    private void removeOne(Coin coin) {
        coins.merge(coin, -1, Integer::sum);
    }

//    public int totalCoinsValue() {
//        int sum = 0;
//        for (Coin i : Coin.values()) {
//            sum += coins.get(i) * i.getValue();
//        }
//        return sum;
//    }
}
