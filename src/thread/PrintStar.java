package thread;

public class PrintStar {
	
	public static void main(String[] args) {
		//하나의 프로세스내에서 독립적으로 실행될수있는 세부실행단위를 가리켜
		//쓰레드라 부른다.
		MyThread mt1=new MyThread();//별도의 실행부생성
		mt1.start();//run()를 간접호출
		
		MyThread2 mt2=new MyThread2();//별도의 실행부생성
		mt2.start();
		
		System.out.println("메인메서드에 의한 코드");
		
	}
}
