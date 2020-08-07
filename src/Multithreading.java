
public class Multithreading extends Thread{

	public void ping()
	{
		while(true) {
		System.out.println("Ping");
		try {
			Thread.sleep(500);//delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}}
	public void pong()
	{
		while(true) {
		System.out.println("Pong");
		
		try 
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}}
	
	public void run()
	{
		Thread t= Thread.currentThread();
		String tn=t.getName();
		if(tn.equals("ping"))
			ping();
		if(tn.equals("pong"))
			pong();
	}
	public static void main(String[] args) {
		Multithreading th1= new Multithreading();
		Multithreading th2= new Multithreading();
		th1.setName("ping");
		th2.setName("pong");
		
		th1.start();//ping
		th2.start();//pong
	}
}
