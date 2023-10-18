import Interface.Population;

import java.util.ArrayList;

public class Town {
    private String name;
    private ArrayList<Building> buildings;
    private ArrayList<Population> population;
    public Town (String name){
        this.name = name;
        this.population = new ArrayList<Population>();
        this.buildings = new ArrayList<Building>();
    }

    public int numberOfBuildings(){
        return this.buildings.size();
    }

    public void addBuildings(Building building){
        this.buildings.add(building);
    }

    public void addToCensus(Population population){
        this.population.add(population);
    }

    public int getTownPopulation(){
        int total = 0;

        for (Population pop : this.population){
            total += pop.population();
        }
        return total;
    }
}
