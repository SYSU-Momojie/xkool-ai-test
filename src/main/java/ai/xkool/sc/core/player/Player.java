package ai.xkool.sc.core.player;

import ai.xkool.sc.core.entity.GameEntity;

import java.util.List;

/**
 * Should store some information of player
 */
public abstract class Player {
    String name;
    PlayColor color;

    List<GameEntity> selectedEntities;
}
