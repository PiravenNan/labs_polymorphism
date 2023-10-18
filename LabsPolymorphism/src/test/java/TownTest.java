import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TownTest {
    Town town;
    Residential building;

    @BeforeEach
    void setUp(){
        town = new Town("Reading");
        building = new Residential("Main st",2,20,true,2000);
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

