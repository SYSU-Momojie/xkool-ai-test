package ai.xkool.sc.core.attribute;

import ai.xkool.sc.core.map.Speed;

/**
 * Ability to fly
 */
public interface Flyable {

    Speed getSpeed();

    boolean canThrough();
}
