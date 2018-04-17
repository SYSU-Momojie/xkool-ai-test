package ai.xkool.sc.view;

import ai.xkool.sc.engine.info.GameInfo;

public interface ViewDrawer {

    /**
     * Draw the scene according to current game info
     * @param gameInfo
     */
    void nextFrame(GameInfo gameInfo);
}
