package com.wyf;
class People
{
     private int size;
     public void setSize(int newSize)
     {
         if(newSize > 0)
         {
             size = newSize;
         }
         else
         {
             System.out.println("error");
         }
     }
     public int getSize()
     {
            return (size);
     }
}
public class Sample7_12
{
     public static void main(String[] args)
     {
         People p = new People();
         p.setSize(-5);
         //System.out.println("Height is "+p.getSize()+"cm");
     }
}
