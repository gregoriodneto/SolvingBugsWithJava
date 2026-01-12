package org.greg.GameServerCoin;

public class Reward {
    private int coins;
    private int xp;

    public Reward(int coins, int xp) {
        this.coins = coins;
        this.xp = xp;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

    public int getCoins() {
        return coins;
    }

    public int getXp() {
        return xp;
    }
}
