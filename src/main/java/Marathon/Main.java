package Marathon;

import Marathon.competitor.implement.Team;
import Marathon.obstacle.*;

public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Дарвин");
        team1.infoTeam();

        System.out.println();

        Course course1 = new Course();
        course1.doIt(team1);

        System.out.println();

        team1.infoWinners();
    }
}