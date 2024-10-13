package problem2;

public class Test {
    public static void main(String[] args){
        Teams team1 = new Teams("Real Madrid"  , 100 , 25 , 20000000 , Direction.FOOTBALL) ;
        Teams team2 = new Teams("Barcelona" , 0 , 11 , 100 , Direction.FOOTBALL) ;
        Teams team3 = new Teams("VC Taldysai");

        team3.setRateOfTeams(12);
        team3.setBudget(10000);
        team3.setDirection(Direction.VOLLEYBALL);

        System.out.println(team1.toString());

        System.out.println("Average Rate: " + Teams.getAverageRate());
        System.out.println("Average Players: " + Teams.getAverageCntOfPlayers());
        System.out.println("Average Budget: " + Teams.getAverageBudget());

        System.out.println("cnt_of_comand: " + Teams.count_of_comand);
    }
}