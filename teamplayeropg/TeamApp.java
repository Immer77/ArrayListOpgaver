package teamplayeropg;

public class TeamApp {
    public static void main(String[] args) {
        Player p1 = new Player("Peter",24);
        Player p2 = new Player("Rikke",22);
        Player p3 = new Player("Magnus",21);
        p1.setScore(4);
        p2.setScore(3);
        p3.setScore(2);
        Team team = new Team("Datamatiker");
        team.addPlayer(p1);
        team.addPlayer(p2);
        team.addPlayer(p3);

        team.printPlayer();
        System.out.printf("%.2f\n",team.calcAverageAge());
        System.out.println(team.calcTotalScore()); //Tjek op
        System.out.println(team.calcOldPlayerScore(23));
        System.out.println(team.maxScore());
        System.out.println(team.bestPlayer());

    }
}
