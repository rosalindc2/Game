public class Level 
{
    private boolean goalReached;
    private int points;
    public Boolean goalReached()
    {
        return goalReached;
    }
    public void reachGoal()
    {
        goalReached = true;
    }

    public int getPoints()
    {
        return points;
    }
    public void setPoints(int p)
    {
        points = p;
    }
}