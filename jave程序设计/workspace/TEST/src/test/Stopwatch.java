package test;

import java.util.Date;

public class Stopwatch {
    Date startTime;
    Date endTime;
    
    public void start()
    {
    	startTime = new Date();
    }
    
    public void end()
    {
    	Date newtime = new Date();
    	endTime = newtime;
    }
	public static void main(String[] args) {
		
		double[] array = new double [10000];//创建一个数组来容纳他们……
		Stopwatch sw = new Stopwatch();
		sw.start();
		System.out.println(sw.startTime);		 
        for(int count = 0; count<10000; count++)//创建10000个随机数
        {
        	array[count] = Math.random();        }
        
		double tmp;
        for(int count = 0; count<10000; count++)//开始排序
        {
        	for(int count2 = count+1; count2<10000; count2++)
        	{
        		if(array[count2] > array[count])
        		{
        			tmp = array[count2];
        			array[count2] = array[count];
        			array[count] = tmp;
        		}
        	}
        }
        
		sw.end();
		System.out.println(sw.endTime);
	}

}