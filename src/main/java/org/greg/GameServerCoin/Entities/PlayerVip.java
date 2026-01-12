package org.greg.GameServerCoin.Entities;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;

public class PlayerVip extends BasePlayerStrategy {

    public PlayerVip(String name, boolean banned) {
        super(name, banned);
    }

    @Override
    public Reward calcReward(boolean isWeekend) {
        if (banned) {
            throw new IllegalStateException("Player is banned");
        }

        reward.addCoinsPercent(50);
        reward.addXpPercent(20);

        if (isWeekend) {
            reward.addCoins(100);
        }

        return reward;
    }
}
