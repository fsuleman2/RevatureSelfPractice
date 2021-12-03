package lamda_demo.main;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {

	public static void main(String[] args) {
		// First Thread : Thread- JOHN
		Runnable thread1 = ()->{
			//this is body of the thread
			//task need to be wriiten
			for(int i=1;i<=10;i++) {
				System.out.println("hello "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		/*******************************************************/
		Runnable thread3 =()->{
			//as a thread 
			ArrayList<Integer> myIntList = new ArrayList<Integer>();
			myIntList.add(1);
			myIntList.add(2);
			myIntList.add(3);
			myIntList.add(4);
				myIntList.stream().forEach(i->{
					if(i%2!=0) {
						System.out.println(i);
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
		};
		//wait()
		//notify()
		//notifyAll()
		//join()
		//isAlive()
		/*******************************************************/
		
		Runnable thread2 = ()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Thread two "+i*2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
//		Thread t = new Thread(thread1);
//		t.setName("JOHN");
//		t.start();
//		
//		Thread t1 = new Thread(thread2);
//		t1.setName("Suleman");
//		t1.start();
		
		
		Thread t3 =  new Thread(thread3);
		t3.setName("susmita");
		t3.start();
		
	}

}
