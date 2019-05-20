package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 70, 80);
		
		/*
		 XML 설정에서 작업....
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord();
		
		view.setRecord(record);

		*/
		
		//view.input();
		//view.print();
		
		 
		//Spring Frame work 이 제공하는 메모리를 사용하자
		//(IOC 컨테이너) 만들고 그 공간에 [객체생성조립>> xml 문서에게]
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		RecordView view = (RecordView)context.getBean("view");
		
		view.input();
		view.print();

		
	}
}
