
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResidentialTest {

    Town town;
    Residential residential;

    @BeforeEach
    void setup(){
        town = new Town("Reading");
        residential = new Residential("Main st", 20,30,true,40);
    }

    @Test

    void canStoreResidentialAsBuilding(){
     town.addBuildings(residential);
     assertThat(town.numberOfBuildings()).isEqualTo(1);
    }

    @Test
    void canAddResidents(){
        residential.addResidents(20);
        assertThat(residential.getResidents()).isEqualTo(60);
    }

    @Test
    void canGetInfo(){
        assertThat(residential.info()).isEqualTo("Number of residents : 40");
    }

    @Test
    void canGetInfo__WithString(){
        assertThat(residential.info("No pets allowed")).isEqualTo("User added note - No pets allowed");
    }
}
