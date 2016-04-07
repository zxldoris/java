public class  Sample7_17
{
    static  int count = 0;
    int selfCount = 0;
    public Sample7_17()
    {
        count++;
        selfCount++;
    }
    public static  void main(String[] args)
    {
        Sample7_17 s1 = new Sample7_17();
        Sample7_17 s2 = new Sample7_17();
        Sample7_17 s3 = new Sample7_17();
        Sample7_17 s4 = new Sample7_17();
        System.out.println("s1.count = "+s1.count+",s2.count"+s2.count+",s3.count = "+s3.count+",s4.count = "+s4.count);
        System.out.println("s1.selfCount = "+s1.selfCount+",s2.selfCount = "+s2.selfCount+",s3.selfCount = "+s3.selfCount+",s4.selfCount = "+s3.selfCount+",s4.selfCount = "+s4.selfCount);
        
    }
}
