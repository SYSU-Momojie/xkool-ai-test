package ai.xkool.sc.core.attribute;

import ai.xkool.sc.core.action.GameAction;

import java.util.List;
import java.util.Optional;

/**
 * Ability to store actions in next move
 */
public interface Taskable {

    /**
     * Get all actions in list
     * @return
     */
    List<GameAction> getActions();

    /**
     * Get next action that needs to do
     * @return
     */
    Optional<GameAction> getNextAction();

    /**
     * Clear all scheduled actions
     */
    void clearActions();

    /**
     * Add action
     */
    void addAction();
}
