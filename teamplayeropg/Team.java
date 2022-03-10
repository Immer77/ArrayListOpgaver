package teamplayeropg;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name){
        this.name = name;

        players = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    public void printPlayer(){
        for (Player element : players){
            System.out.println(element);
        }
    }

    public double calcAverageAge(){
        double average = 0.0;
        int numberOfPlayers = 0;
        for (Player element : players){
            average = average + element.getAge();
            numberOfPlayers++;
        }
        return average / numberOfPlayers;
    }
    public int calcTotalScore(){
        int score = 0;
        for (Player element : players){
            score = score + element.getScore();
        }
        return score;
    }
    public int calcOldPlayerScore(int ageLimit){
        int score = 0;
        for (Player element : players){
            if(element.getAge() > ageLimit){
                score = score + element.getScore();
            }
        }
        return score;
    }
    public int maxScore(){
        int score = 0;
        for (Player element : players){
            if(element.getScore() > score){
                score = element.getScore();
            }
        }
        return score;
    }
    public String bestPlayer(){
        int score = 0;
        String bestPlayer = "Null";
        for (Player element : players){
            if(element.getScore() > score){
                bestPlayer = element.getName();
                score = element.getScore();
            }
        }
        return bestPlayer;
    }
}
