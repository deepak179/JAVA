class computer
{
    public void playmusic()
    {
        System.out.println("Playing music...");
    }

    public String getmepen(int cost)
    {
        if (cost >= 10)
            return ("Pen");

        return ("Nothing");
    }
}


public class Method {
    public static void main(String[] args) {
        computer obj = new computer();

        obj.playmusic();
        String str = obj.getmepen(5);
        System.out.println(str);
    }
}
