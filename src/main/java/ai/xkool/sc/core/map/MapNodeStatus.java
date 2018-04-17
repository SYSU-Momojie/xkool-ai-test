package ai.xkool.sc.core.map;

public enum MapNodeStatus {

    EMPTY, // Empty node, can make building or let entity move through it

    LAND_TAKEN, // Node is filled with building or entity on land, can only allow entity fly through it

    AIR_TAKEN, // Node is filled with flight entity, can only allow land entity move through it or make a building on it

    FULL; // Both land and air are taken by something
}
