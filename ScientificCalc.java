public class ScientificCalc extends AdvCalc       // Multi-level inheritance, as ScientificCalc inherits AdvCalc and AdvCalc inherits Calc class
{
    public double power(int n, int m)
    {
        return Math.pow(n, m);
    }
}
