/*
 ☆★Today Point☆★
 override : 상속관계에서 자식이 부모의 함수를 [재정의]
 [상속관계]에서 [자식클래스]가 [부모클래스]의 메서드를 재정의(내용을 바꿈)
 재정의 : 틀의 변화가 없고, (함수의 이름, 타입) 내용만 변환(중괄호 안의 실행코드 코드 수정)
 
 문법)
 1. 부모함수와 이름 동일
 2. 부모함수와 parameter 동일
 3. 부모함수의 return type 동일
 4. 결국 {실행블록} 코드만 변경 
 
 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2 {
	int z = 6;
	
	//z가 포함된 함수
	//getPosition() 함수 이미 부모클래스에 존재...
	
	//새로운 함수를 생성한 것이 아니라 .... 부모 함수를 그대로 사용
	//함수의 의미가 같기 때문에 -override(재정의)
	
	
	@Override //컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공
			 //부모의 함수를 재정의 했는지 확인하는 Annotation -> @Override
	String getPosition() {
		return this.x + "/" + this.y + "/" + this.z;
	}
	
	
// 내가 만든 함수가 정말 재정의 인지 아닌지 검증방법
//Annotation
/*
>>어노테이션은 사전적 의미로는 주석이라는 뜻이다. 
>>자바에서 사용될 때의 어노테이션은 코드 사이에 주석처럼 쓰여서 특별한 의미, 기능을 수행하도록 하는 기술이다.
>>즉, 프로그램에게 추가적인 정보를 제공해주는 메타데이터(meta data: 데이터를 위한 데이터)라고 볼 수 있다.

1.컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공

2.소프트웨어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보 제공

3.실행시(런타임시)특정 기능을 실행하도록 정보를 제공
 
*/
	//오버라이드 된 상태에서 부모를 참조하기 위해서는 super 사용한다
	
	// ☆★ 면접질문2번 ☆★
	//오버로딩은 하나의 이름으로 여러가지 기능을 사용하는것 오버라이딩은 상속관계에서 재정의
}

public class Ex04_Inherit_Override {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		String result = p.getPosition();
		System.out.println(result);
	}
}
