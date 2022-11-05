import java.util.Random;

public class Footballer extends Player {
    private Club club;
    private int numOfPlayer = generateDefaultNum();



    public Footballer(String name, int age, String nationality, Club club, Sponsor sponsor) {
        super(name, age, nationality, sponsor);
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    public int getNumOfPlayer() {
        return numOfPlayer;
    }

    public int generateDefaultNum(){
        Random random = new Random();
        return random.nextInt(22)+1;
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nNumber of player: " + numOfPlayer +
                "\nClub: " + (club == null ? "" : club.getNameOfClub()) +
                "\nCountry of club: " + (club == null ? "" : club.getCountryOfClub());
    }
}
