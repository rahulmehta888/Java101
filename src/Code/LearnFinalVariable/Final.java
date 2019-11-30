package Code.LearnFinalVariable;

public class Final
{
    private int sum;
    private final int Number;

    public Final(int number)
    {
        Number = number;
    }

    public void addNumber()
    {
        sum+=Number;

    }
    public String toString()
    {
        return String.format("Final turns to %d",sum);
    }
}
