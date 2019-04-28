package Marathon.obstacle;
import Marathon.competitor.implement.Team;
import Marathon.competitor.interf.Competitor;

public class Course {
    private Obstacle[] obstacles;

    public Course() {
        this.obstacles = new Obstacle[] {new Cross(80), new Wall(2), new Wall(1), new Cross(120), new Water(10)};
    }

    public void doIt(Team team){

        Competitor[] competitors = team.getCompetitors();

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
            System.out.println();
        }


    }
}
