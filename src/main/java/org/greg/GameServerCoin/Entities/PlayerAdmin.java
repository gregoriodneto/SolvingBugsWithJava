package org.greg.GameServerCoin.Entities;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;

public class PlayerAdmin extends BasePlayerStrategy {

    public PlayerAdmin(String name, boolean banned) {
        super(name, banned);
    }

    @Override
    public Reward calcReward(boolean isWeekend) {
        if (banned) {
            throw new IllegalStateException("Player is banned");
        }

        reward.resetCoins();
        reward.addXpPercent(200);

        System.out.println("[ADMIN LOG] Player " + name + " killed a mob");

        return reward;
    }
}
