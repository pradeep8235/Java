package ThreadTraining;

public class MyThreadTest {

	public static void main(String[] args) {
		Workers w = new Workers();
		w.start();
		System.out.println(w.isAlive());
		
	}

}
