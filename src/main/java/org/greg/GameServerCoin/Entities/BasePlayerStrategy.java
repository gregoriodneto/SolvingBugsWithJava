package org.greg.GameServerCoin.Entities;

import org.greg.GameServerCoin.Contracts.PlayerStrategy;

public abstract  class BasePlayerStrategy implements PlayerStrategy {
    protected final String name;
    protected final boolean banned;
    protected final Reward reward;

    public BasePlayerStrategy(String name, boolean banned) {
        this.name = name;
        this.banned = banned;
        this.reward = new Reward(100, 10);
    }

    protected void validate() {
        if (banned) {
            throw new IllegalStateException("Player is banned");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
