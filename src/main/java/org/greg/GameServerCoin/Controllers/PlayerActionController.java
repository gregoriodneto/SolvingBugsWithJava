package org.greg.GameServerCoin.Controllers;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;
import org.greg.GameServerCoin.Entities.Reward;
import org.greg.GameServerCoin.Services.RewardService;

public class PlayerActionController {
    public Reward onMobKilled(PlayerStrategy player, boolean isWeekend) {

        return RewardService.processMobKill(player, isWeekend);
    }
}
