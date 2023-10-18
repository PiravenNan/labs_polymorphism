
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GovernmentTest {

    Town town;
    Government government;

    @BeforeEach
    void setup() {
        town = new Town("Reading");
        government = new Government("Main st", 2, 30, "Hospital", 20_000);
        town.addBuildings(government);
    }

    @Test
    void canStoreGovernmentAsBuilding() {
        assertThat(town.numberOfBuildings()).isEqualTo(1);
    }

    @Test
    void canAddFunding(){
        government.changeFunding(-10_000);
        assertThat(government.getFunding()).isEqualTo(10_000);
    }

    @Test
    void canGetInfo(){
        assertThat(government.info()).isEqualTo("Government department : Hospital");
    }

    @Test
    void canGetInfo__WithString(){
        assertThat(government.info("Needs more funding!")).isEqualTo("User added note - Needs more funding!");
    }
}