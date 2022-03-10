package teamplayeropg;

public class Player {
    private String name;
    private int age;
    private int score;

    //B
    public Player(String name, int age){
        this.name = name;
        this.age = age;
        this.score = 0;

    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getScore(){
        return this.score;
    }
    public void setScore(int score){
        this.score = score;
    }

    public void addScore(int score){
        this.score += score;
    }
    //Bruger Override til at få printet det ud til hvad man gerne vil have i det her tilfæde
    @Override
    public String toString(){
        return "Player: " + name + "\nAge: " + age + "\nScore:" + score;
    }
}
