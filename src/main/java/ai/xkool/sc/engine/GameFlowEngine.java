package ai.xkool.sc.engine;

import ai.xkool.sc.core.action.GameAction;
import ai.xkool.sc.core.entity.GameEntity;
import ai.xkool.sc.engine.info.GameInfo;

import java.util.List;

/**
 * Center to manipulate game info
 */
public abstract class GameFlowEngine {

    GameInfo gameInfo;

    /**
     * Add actions to entity, if suitable
     * @param action
     * @param entities
     */
    abstract void addAction(GameAction action, List<GameEntity> entities);

    /**
     * If there is action in entity, execute it.
     */
    abstract void executeActionForEachEntity();

}
