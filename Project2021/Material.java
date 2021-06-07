public class Material extends Entity{
    private static double level1, level2, level3;
    public Material(String name, String description, int id){
        super(name, description, id);
    }

    public String getDetails(){return "This object is a Material.\n" + "Level1= " + level1 + " Level2= " + level2 + " Level3= " + level3 ;}
}
