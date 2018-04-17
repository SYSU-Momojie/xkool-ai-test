package ai.xkool.sc.command;

import ai.xkool.sc.core.entity.GameEntity;

import java.util.List;

/**
 * Command that represents what player want to do,
 * it should come from combination of UserInput
 */
public abstract class GameCommand {

    /**
     * Get entities that will be applied with this command
     * @return
     */
    abstract List<GameEntity> getActionEntities();
}
