public class Residential extends Building {

    private boolean multiFamily;
    private int residents;

    public Residential(String address, int stories, int age, boolean multiFamily, int residents){
        super(address,stories,age);
        this.multiFamily = multiFamily;
        this.residents = residents;
    }

    public void addResidents (int amount){
        this.residents+=amount;
    }

    public int getResidents(){
        return this.residents;
    }

    public String info(){
        return "Number of residents : " + this.residents;
    }

    public String info(String note){
        return "User added note - " + note;
    }
}
