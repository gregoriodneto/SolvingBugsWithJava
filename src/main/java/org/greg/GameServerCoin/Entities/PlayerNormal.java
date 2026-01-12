package org.greg.GameServerCoin.Entities;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;

public class PlayerNormal extends BasePlayerStrategy {
    public PlayerNormal(String name, boolean banned) {
        super(name, banned);
    }

    @Override
    public Reward calcReward(boolean isWeekend) {
        if (banned) {
            throw new IllegalStateException("Player is banned");
        }

        return reward;
    }
}
