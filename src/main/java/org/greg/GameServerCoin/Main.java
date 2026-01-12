package org.greg.GameServerCoin;

public class Main {
    public static void main(String[] args) {
        PlayerActionController controller = new PlayerActionController();

        Player vipPlayer = new Player("Steve", PlayerType.VIP, false);

        controller.onMobKilled(vipPlayer, true);
    }
}
