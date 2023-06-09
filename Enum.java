enum Status
{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println(s.ordinal());     // It will give the number assigned to the status of s

        Status[] ss = Status.values();
        System.out.println(ss[0]);

        for(Status p : ss)
        {
            System.out.println(p + " : " + p.ordinal());
        }
    }
}
