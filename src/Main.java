public class Main {
    public static void main(String[] args) {
        String[] achievements = {"Champions League", "LaLiga", "Copa del Rey", "European Super Cup"};
        Club club = new Club("Manchester City", "England");

        Footballer objectA = new Footballer("Pogba", 28, "French", club, Sponsor.ADIDAS);
        System.out.println(objectA.getInfo());

        System.out.println("<<<<------------------------------>>>>");
        Forward objectB = new Forward("Neymar", 26, "Brazilian", club, Sponsor.NIKE, achievements, 165);
        System.out.println(objectB.getInfo());
        objectB.celebrateGoal();
        objectB.celebrateGoal("Гооооооооооооол!!!!!!1");

        System.out.println("<<<<------------------------------>>>>");
        Forward objectC = new Forward("Messi", 34, "Argentine", club, Sponsor.LAYS, achievements, 235);
        System.out.println(objectC.getInfo());
        objectC.celebrateGoal();
        objectC.celebrateGoal("Ураааааааааааааааа!!!!!!1");
    }
}