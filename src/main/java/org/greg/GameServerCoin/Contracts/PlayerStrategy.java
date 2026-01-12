package org.greg.GameServerCoin.Contracts;

import org.greg.GameServerCoin.Entities.Reward;

public interface PlayerStrategy {
    Reward calcReward(boolean isWeekend);
    String getName();
}
