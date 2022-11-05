import java.util.Arrays;

public final class Forward extends Footballer{
    private String[] achievements;
    private int goals;


    public Forward(String name, int age, String nationality, Club club, Sponsor sponsor, String[] achievements, int goals) {
        super(name, age, nationality, club, sponsor);
        this.achievements = achievements;
        this.goals = goals;
    }

    public String[] getAchievements() {
        return achievements;
    }

    public int getGoals() {
        return goals;
    }

    final public void celebrateGoal(){
        System.out.println("Gooooooool");
    }

    public void celebrateGoal(String celebrate){
        System.out.println(celebrate);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nAchievements: " + Arrays.toString(achievements) +
                "\nGoals: " + goals;
    }
}
