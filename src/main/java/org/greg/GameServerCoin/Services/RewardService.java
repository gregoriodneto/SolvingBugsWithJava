package org.greg.GameServerCoin.Services;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;
import org.greg.GameServerCoin.Entities.Reward;

public class RewardService {
    public static Reward processMobKill(PlayerStrategy player, boolean isWeekend) {
        return player.calcReward(isWeekend);
    }
}
