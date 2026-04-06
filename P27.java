interface Classify
{
    String getDivision(double average);
}

class Result implements Classify
{
    public String getDivision(double average)
    {
        if(average >= 60)
        {
            return "First Division";
        }
        else
        {
            return "No First Division";
        }
    }
}

public class P27
{
    public static void main(String[] args)
    {
        Result r = new Result();

        double avg = 65.5;
        
        System.out.println("Preksha Patel");
        System.out.println("240390107031");
        System.out.println("Average = " + avg);
        System.out.println(r.getDivision(avg));
    }
}