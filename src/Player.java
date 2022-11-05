public class Player {
    private String name;
    private int age;
    private String nationality;

    private Sponsor sponsor;

    public Player(){
    }

    public Player(String name, int age, String nationality, Sponsor sponsor) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.sponsor = sponsor;
    }

    public Player(String name, Sponsor sponsor) {
        this.name = name;
        this.sponsor = sponsor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getInfo(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nNationality: " + nationality +
                "\nSponsor: " + sponsor;

    }
}
