package problem2;

public class Teams {
    static int count_of_comand ;
    private static double rate_of_teams ;
    private static double all_sum_of_players ;
    private static double all_sum_of_budgets ;


    final String nameOfTeam ; //read-only field
    private double rate ;
    private double players ;
    private double budget ;

    public Direction direction = Direction.UNKNOWN ;
    {
        count_of_comand += 1 ;
    }
    public Teams(String nameOfTeam){this.nameOfTeam = nameOfTeam ;}
    public Teams(String nameOfTeam, double rate){
        this(nameOfTeam) ;                              // вызов другого конструктора
        this.rate = rate ;
        rate_of_teams += rate;
    }
    public Teams(String nameOfTeam, double rate, double players){
        this(nameOfTeam, rate) ;
        this.players = players ;
        all_sum_of_players += players ;
    }
    public Teams(String nameOfTeam , double rate , double players , double budget){
        this(nameOfTeam , rate , players) ;
        this.budget = budget ;
        all_sum_of_budgets += budget ;
    }
    public Teams(String nameOfTeam , double rate , double players , double budget , Direction direction){
        this(nameOfTeam , rate , players , budget) ;
        this.direction = direction ;
    }


    public void setRateOfTeams(double rate){
        this.rate = rate ;
        rate_of_teams += rate ;
    }
    public void setCntOfPlayers(double players){
        this.players = players ;
        all_sum_of_players += players ;
    }
    public void setBudget(double budget){
        this.budget = budget ;
        all_sum_of_budgets += budget ;
    }
    public void setDirection(Direction direction){
        this.direction = direction ;
    }


    public static double getAverageRate(){ return rate_of_teams / count_of_comand ; }
    public static double getAverageCntOfPlayers(){ return all_sum_of_players / count_of_comand ; }
    public static double getAverageBudget(){ return all_sum_of_budgets / count_of_comand ; }


    public String toString(){
        return "Name : " + nameOfTeam + "\nDirecion : " + direction;
    }
}
