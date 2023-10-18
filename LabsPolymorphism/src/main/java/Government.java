public class Government extends Building{

    private String department;
    private int funding;
    public Government(String address, int stories, int age, String department, int funding){
        super(address,stories,age);
        this.department = department;
        this.funding = funding;
    }

    public int getFunding() {
        return this.funding;
    }

    public void changeFunding(int amount){
        this.funding+=amount;
    }
}
