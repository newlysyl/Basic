package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Calendar
public class Ex05 {
	public static void main(String[] args) {
		//Java에서 날짜(시간)을 담당하는 클래스가 여럿있습니다.
		//java.util.DateTime, java.sql.DateTime, java.util.Calendar
		//근데 java.sql.DateTime 패키지이름만 봐도 알수 있듯이
		//sql의 DateTime 데이터타입으로 쓰입니다.
		//그럼 우리가 일상적으로 쓰는 시간은 DateTime과 Calendar가 있습니다.
		//하지만 자바가 더이상 java.util.DateTime을 지원하지 않기 때문에
		//우리는 Calendar를 써야합니다.
		//Calendar calendar = new Calendar(); -> 캘린더 객체는 new 로 초기화 하지 않는다.
		//캘린더 객체는 캘린더의 스태틱 메소드인 getInstance로 현재 시간으로 초기화한다. 
		Calendar calendar = Calendar.getInstance(); 
		System.out.println(calendar);
		//Calendar 객체의 필드들을 출력해봅시다.
		System.out.println(calendar.get(Calendar.DATE)); //해당 월의 일
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //해당 월의 일(Date 랑 같음)
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); //무슨 요일인지를 int로
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); //1년 중 몇일째인지
		System.out.println(calendar.get(Calendar.HOUR)); //오전/오후 몇시인지
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //24시 중 몇시인지
		System.out.println(calendar.get(Calendar.MILLISECOND)); //지금 시간 기준 몇 밀리초인지
		System.out.println(calendar.get(Calendar.MONTH)); //1년 중 몇월인지
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH)); //해당 월의 몇번째 주인지
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR)); //해당 년의 몇번째 주인지
		System.out.println(calendar.get(Calendar.YEAR)); //몇년인지
		System.out.println(calendar.get(Calendar.MINUTE));
		//그럼 지금 시간을
		//몇년 몇월 몇일 몇시 몇분 몇초인지 표시하세요
		String timeString =
				calendar.get(Calendar.YEAR)+"년 "+
				calendar.get(Calendar.MONTH)+"월"+
				calendar.get(Calendar.DATE)+"일"+
				calendar.get(Calendar.HOUR_OF_DAY)+"시";
		System.out.println(timeString);
		
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy년 MM월 dd일 hh시 mm분 ss초(z)");
		System.out.println(sdf.format(calendar.getTime()));
		sdf = new SimpleDateFormat("hh시 mm분 ss초");
			try {
				calendar.setTimeInMillis(sdf.parse("3시 5분 45초").getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(calendar.get(Calendar.HOUR));
	}
}