package com.codemantra;

class Print{
	public static void sop(String s){
		System.out.println(s+"\n");
	}
}

class TestThread extends Thread{
	String name;
	SynchronizedEx demo;
	public TestThread(String name, SynchronizedEx demo){
		this.name = name;
		this.demo = demo;
		start();
	}
	
	public void run() {
		demo.test(name);
    }

}

public class SynchronizedEx {

	public synchronized void test(String name){
		for(int i = 0; i < 10; i++){
			Print.sop(name + "::" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				Print.sop(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args){
		SynchronizedEx demo = new SynchronizedEx();
		new TestThread("Thread 1", demo);
		new TestThread("Thread 2", demo);
		new TestThread("Thread 3", demo);
	}
	
}
