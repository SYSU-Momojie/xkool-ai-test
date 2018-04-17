package ai.xkool.sc.event;

import ai.xkool.sc.command.GameCommand;

/**
 * A game event that contains player command,
 * should be consumed by GameCommandExecutor
 */
public interface CommandEvent extends GameEvent {

    GameCommand getCommand();
}
