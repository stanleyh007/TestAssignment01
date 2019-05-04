public class whiteBox
{
    public String testCase(String[] args)
    {
        int mi, ma, obs;
        if (args.length == 0)
        {
            return "No numbers";
        }
        else {
            mi = ma = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++)
            {
                obs = Integer.parseInt(args[i]);
                if (obs > ma)
                {
                    ma = obs;
                }
                else if (obs < mi)
                {
                    mi = obs;
                }
            }
            return ("Minimum = " + mi + "; maximum = " + ma);
        }
    }
}
