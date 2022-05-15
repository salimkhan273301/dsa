import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDateDeno {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		System.out.println("diffrent type show dateTime:-");
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println((ft.format(date)));

	}

}
