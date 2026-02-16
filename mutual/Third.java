package mutual;

import java.util.ArrayList;
import java.util.List;

public class Third {
	public static void main(String [] args) {
		
		
		D_Source li = new D_Source();
		
		Produce first = new Produce();
		
		Consumer second = new Consumer();
		
		first.Gr = li;
		second.Gr = li;
		
		first.start();
		second.start();
	}
}
class D_Source 
{
	List<Integer> list = new ArrayList<>();
	
	int count = 0;
	public synchronized void Add() throws InterruptedException
	{
		if(list.size()==10)
		{
			System.out.println("Waiting Elements....🎯");
			wait();
		}
		list.add(count);
		count++;
		System.out.println("Add : " + count);
		notify();
	}
	public synchronized void Remove() throws InterruptedException
	{
		if(list.size()==0)
		{
			System.out.println("Remover Elements....");
			wait();
		}
		int li = list.remove(0);
		System.out.println("Remove : "+li);
		notify();
	}
}

class Produce extends Thread
{
	D_Source Gr;
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				Gr.Add();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread
{
	D_Source Gr;
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(2000);
				Gr.Remove();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}