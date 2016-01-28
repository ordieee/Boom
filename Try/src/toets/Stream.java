package toets;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Stream extends Thread {
	private Lock lock;
	private char token;
	
	
	public Stream(char x, Lock l) {
		token = x;
		lock = l;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
				lock.lock();
				System.out.print(token);
				System.out.print(token);
		}
}
	
	public static void main(String[] args) {
		Lock l = new ReentrantLock();
		Stream str1 = new Stream('1', l);
		Stream str2 = new Stream('a', l);
		System.out.println("Working...");
		str2.start();
		str1.start();
	}
}