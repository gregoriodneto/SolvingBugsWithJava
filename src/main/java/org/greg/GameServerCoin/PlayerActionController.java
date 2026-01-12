package org.greg.GameServerCoin;

public class PlayerActionController {
    private RewardService rewardService = new RewardService();

    public void onMobKilled(Player player, boolean isWeekend) {

        Reward reward = rewardService.processMobKill(player, isWeekend);

        System.out.println("Player rewards:");
        System.out.println("Coins: " + reward.getCoins());
        System.out.println("XP: " + reward.getXp());
    }
}
