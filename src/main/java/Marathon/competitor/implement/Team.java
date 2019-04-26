package Marathon.competitor.implement;

import Marathon.competitor.interf.Competitor;

public class Team {
    private String name;
    private Competitor[] competitors;

    public Team(String name) {
        this.name = name;
        this.competitors = new Competitor[] {new Human("Мужик 1"), new Cat("Кузя"), new Dog("Пэс"), new Cat("Котэ")};
    }
    public void infoTeam(){
        System.out.printf("Участники команды \"%s\": \n", this.name);
        for (Competitor c : competitors) {
            System.out.println(" - " + c);
        }
    }

    public void infoWinners(){
        System.out.printf("Участники команды \"%s\": \n", this.name);
        for (Competitor c : competitors) {
            if (c.isOnDistance())
                System.out.println(" - " + c);
        }
        System.out.println("прошли дистанцию!");
    }

    public Competitor[] getCompetitors(){
        return (Competitor[]) competitors;
    }
}
