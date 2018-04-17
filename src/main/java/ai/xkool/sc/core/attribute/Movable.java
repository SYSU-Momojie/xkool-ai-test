package ai.xkool.sc.core.attribute;

import ai.xkool.sc.core.map.Speed;

/**
 * Ability to move in land
 */
public interface Movable {

    /**
     * Speed
     * @return
     */
    Speed getSpeed();

    /**
     * Can go through in land
     * @return
     */
    boolean canThrough();
}
