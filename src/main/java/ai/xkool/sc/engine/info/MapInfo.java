package ai.xkool.sc.engine.info;

import ai.xkool.sc.core.map.MapNode;

public abstract class MapInfo {

    int height, width;

    MapNode[][] map;

    abstract boolean isAvailableForLandMove(int x,int y, int dx, int dy);

    abstract boolean isAvailableForAirMove(int x, int y, int dx, int dy);
}
