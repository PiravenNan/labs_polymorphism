import java.util.ArrayList;

public class Town {
    private String name;
    private int population;
   private ArrayList<Building> buildings;
    public Town (String name){
        this.name = name;
        this.population = 0;
        this.buildings = new ArrayList<Building>();
    }

    public int numberOfBuildings(){
        return this.buildings.size();
    }

    public void addBuildings(Building building){
        this.buildings.add(building);
    }
}
