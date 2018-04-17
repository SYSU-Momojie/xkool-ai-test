package ai.xkool.sc.core.attribute;

import ai.xkool.sc.core.type.BuildingType;

import java.util.List;

public interface Builder {

    List<BuildingType> getAllBuilding();

    List<BuildingType> getBuildingUnderTech();
}
