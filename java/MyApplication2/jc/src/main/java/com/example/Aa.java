package com.example;
class People
{
    private int size;
    //size成员变量的set访问器方法
    public void setSize(int newSize)
    {
        if(newSize>0)
        {
            size = newSize;
        }
        else
        {
            System.out.println("error");
        }
    }
    //size成员变量的get访问器方法
    public int getSize()
    {
        return size;
    }
}
public class Aa {
    public static void main(String[] args)
    {
        People p=new People();
        p.setSize(175);
        System.out.println("Height is "+p.getSize()+"cm");
    }
}
