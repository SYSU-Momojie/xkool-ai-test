package ai.xkool.sc;

import ai.xkool.sc.command.GameCommand;
import ai.xkool.sc.event.GameEvent;

import java.util.List;
import java.util.Queue;

public abstract class EventBus {

    Queue<GameCommand> commandQueue;

    /**
     *
     * @param e
     */
    abstract void publishEvent(GameEvent e);

    /**
     * Return new-coming commands and clear the command queue
     * @return
     */
    abstract List<GameCommand> getCommands();
}
