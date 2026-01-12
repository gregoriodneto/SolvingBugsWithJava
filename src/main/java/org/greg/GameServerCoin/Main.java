package org.greg.GameServerCoin;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;
import org.greg.GameServerCoin.Controllers.PlayerActionController;
import org.greg.GameServerCoin.Entities.PlayerAdmin;
import org.greg.GameServerCoin.Entities.PlayerNormal;
import org.greg.GameServerCoin.Entities.PlayerVip;
import org.greg.GameServerCoin.Entities.Reward;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerActionController controller = new PlayerActionController();

        System.out.println("Qual o tipo do Player? ");
        String type = scanner.nextLine();
        System.out.println("Qual o nome do Player? ");
        String name = scanner.nextLine();
        System.out.println("É final de semana? ");
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Player esta banido? ");
        boolean banned = scanner.nextBoolean();

        PlayerStrategy player = typePlayer(type, name, banned);

        Reward reward = controller.onMobKilled(player, isWeekend);

        System.out.println("Player rewards:");
        System.out.println("Coins: " + reward.getCoins());
        System.out.println("XP: " + reward.getXp());

        scanner.close();
    }

    static PlayerStrategy typePlayer(String type, String name, boolean isWeekend) {
        return switch (type) {
            case "vip" -> new PlayerVip(name, isWeekend);
            case "admin" -> new PlayerAdmin(name, isWeekend);
            default -> new PlayerNormal(name, isWeekend);
        };
    }
}
