package org.greg.GameServerCoin;

public class RewardService {
    public static Reward processMobKill(Player player, boolean isWeekend) {
        if (player.isBanned()) {
            throw new IllegalStateException("Player is banned");
        }

        Reward reward = new Reward(100, 10);

        if (player.getType() == PlayerType.NORMAL) {
            // nothing extra
        } else if (player.getType() == PlayerType.VIP) {
            reward.addCoins(50); // +50%
            reward.addXp(2);     // +20%

            if (isWeekend) {
                reward.addCoins(100);
            }
        } else if (player.getType() == PlayerType.ADMIN) {

            reward = new Reward(0, reward.getXp() * 2);

            System.out.println(
                    "[ADMIN LOG] Player " + player.getName() + " killed a mob"
            );
        }

        return reward;
    }
}
