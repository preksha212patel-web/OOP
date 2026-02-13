class P11
{
    int hours;
    int minutes;

    void setTime(int h, int m)
    {
        hours = h;
        minutes = m;
    }

    void displayTime()
    {
        System.out.println(hours + " Hours " + minutes + " Minutes ");
    }

    void addTime(P11 t1, P11 t2)
    {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60)
        {
            hours = hours + 1;
            minutes = minutes - 60;
        }
    }

    public static void main(String[] args)
    {
        P11 t1 = new P11();
        P11 t2 = new P11();
        P11 t3 = new P11();

        t1.setTime(2, 45);
        t2.setTime(1, 30);

        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Added Time: ");
        t3.displayTime();
    }
}