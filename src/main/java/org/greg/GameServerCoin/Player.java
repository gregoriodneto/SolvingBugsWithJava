package org.greg.GameServerCoin;

public class Player {
    private String name;
    private PlayerType type;
    private boolean banned;

    public Player(String name, PlayerType type, boolean banned) {
        this.name = name;
        this.type = type;
        this.banned = banned;
    }

    public String getName() {
        return name;
    }

    public PlayerType getType() {
        return type;
    }

    public boolean isBanned() {
        return banned;
    }
}
