package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;


public class MonitorViewer {
	/*
	 * 1단계 xml 설정파일로 작업
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	*/
	
	//2단계 : Annotaion 기반 DI 작업(injection : 생성자, setter 주입)
	//추가적으로 memver field도 injection이 가능합니다.
	//@Autowired : IOC 컨테이너 안에 Recorder 타입을 가진 객체가 있다면
	//자동으로 그 객체의 주소를 받겠다
	//Recorder r = new Recorder();
	//recorder = r;
	//<property name="recorder">
	//  <ref bean="recorder"/>
	//</propery>
	//</bean>
	
	/*
	@Autowired
	private Recorder recorder;
	
	public Recorder getRecorder() {
		return recorder;
	}
	 */
	
	//setter 통한 자동 주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	@Autowired // 타입기반(IOC 컨테이너 안에 Record 타입을 가지는 객체가 있으면 자동으로 주입
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}

}
