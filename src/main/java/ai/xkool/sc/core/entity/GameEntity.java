package ai.xkool.sc.core.entity;

import ai.xkool.sc.core.player.Player;

public abstract class GameEntity {

    /**
     * Its position
     */
    int posX, posY;

    /**
     * How many MapNode it takes
     */
    int height, width;

    /**
     * Life count of entity
     */
    int life;

    /**
     * Belong to which player
     */
    Player belongTo;
}
