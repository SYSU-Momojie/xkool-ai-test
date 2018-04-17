package ai.xkool.sc;

import ai.xkool.sc.event.GameEvent;

public interface EventBus {

    void publishEvent(GameEvent e);

}
