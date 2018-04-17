package ai.xkool.sc.core.type;

import java.util.List;

/**
 * Enum of all building type, which should contains info of building:
 * requirement of race and tech level
 *
 */
public enum BuildingType {

   HUMAN_HOME;

   Racetype race;
   RaceTech tech;

    /**
     * Get all available building of a race
     *
     * @param race
     * @return
     */
   List<BuildingType> getByRace(Racetype race) {
       return null;
   }

    /**
     * Get available building of race under tech level
     *
     * @param race
     * @param tech
     * @return
     */
   List<BuildingType> getByRaceAndTect(Racetype race, RaceTech tech) {
     return null;
   }
}
