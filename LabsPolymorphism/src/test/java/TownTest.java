import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TownTest {
    Town town;
    Building building;

    @BeforeEach
    void setUp(){
        town = new Town("Reading");
        building = new Building("Main st",2,20);
    }

    @Test
    void doesTownStartEmpty(){
        assertThat(town.numberOfBuildings()).isEqualTo(0);
    }

    @Test
    void canAddBuilding(){
        town.addBuildings(building);
        assertThat(town.numberOfBuildings()).isEqualTo(1);
    }
}

