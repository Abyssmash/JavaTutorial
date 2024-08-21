package Project;

public @interface Scheduled {

	int fixedDelay();
	import java.util.Date;
	import java.util.TimerTask;

	import jdk.internal.org.jline.utils.Log;

	public class Timer {

		public static void main(String[] args) {
			@Scheduled(fixedDelay = 100000)
			public void run() {
				Log.info("타이머 시작");
			}
			
			TimerTask task= new TimerTask() {
				public void run() {
					System.out.println("Timeover");
				}
			};
			Date startTime = new Date();
		}
	}
}
