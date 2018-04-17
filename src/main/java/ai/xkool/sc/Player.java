package ai.xkool.sc;

import java.util.List;

/**
 * Should store some information of player
 */
public abstract class Player {
    String name;
    PlayColor color;

    List<GameEntity> selectedEntities;
}
