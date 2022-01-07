

public class Game {
    private String name;
    private Die[] dice;
    private int score;
    private static int MAX_SCORE = 100;
    public Game(String name)
    {
        this.name = name;
        dice = new Die[6];
        for(int i = 0; i < dice.length; i++)
            dice[i] = new Die();
    }

    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
    public void roll()
    {
        for(int i = 0; i< dice.length; i++)
            dice[i].roll();
    }

    public String getArrangedSequence()
    {
        String str = "";

        for(int i = 0; i < face.length; i++)
        {
            for(int j = 0; j < dice.length; j++)
                if(dice[j].getFace() == face)
                {
                    str += dice[j].getFace();
                }
        }
        return str;

    }
    public int getPoints()
    {
        int points = 0;
        //check for 3 Hs i.e 3 1s, which will cancel out the points
        String seq = getArrangedSequence();
        if(!seq.contains("HHH"))
        {
            if(seq.equals("HEARTS"))
                points = 30;
            else if(seq.startsWith("HEART"))
                points = 25;
            else if(seq.startsWith("HEAR"))
                points = 20;
            else if(seq.startsWith("HEA"))
                points = 15;
            else if(seq.startsWith("HE"))
                points = 10;
            else if(seq.startsWith("H"))
                points = 5;
        }
        return points;
    }

    public void addToScore(int points)
    {
        score += points;
    }

    public boolean isWinner()
    {
        return score >= MAX_SCORE;
    }
}