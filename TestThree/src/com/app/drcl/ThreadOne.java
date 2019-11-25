package com.app.drcl;

public class ThreadOne extends Thread{
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			
			try {
				if(i==7) sleep(10000);
			}catch(Exception e){
				System.out.println(e);
				
			}
			
			System.out.println("Thread One Executed "+i);	
		}
		System.out.println("Execution completed");
	}
	

}
