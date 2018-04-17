package ai.xkool.sc.util;

import ai.xkool.sc.core.entity.GameEntity;
import ai.xkool.sc.command.GameCommand;
import ai.xkool.sc.input.UserInput;

import java.util.List;

/**
 * Convert combination of UserInput to one GameCommand
 */
public interface UserInputCommandConvertor {

    /**
     * According what entities that current player select (focus),
     * generate proper GameCommand
     *
     * @param inputs
     * @param selectedEntities
     * @return
     */
    GameCommand convert(List<UserInput> inputs, List<GameEntity> selectedEntities);
}
