public class Findavg
{
public int Findavg(int numA, int numB, int numC)
{
    return (numA + numB + numC)/3;
}
public static void main(String args[])
{
    Findavg obj = new Findavg();
    int avg = obj.Findavg(10, 20, 30);

    System.out.println("Average of 10, 20 and 30 is :" + avg);
}
}