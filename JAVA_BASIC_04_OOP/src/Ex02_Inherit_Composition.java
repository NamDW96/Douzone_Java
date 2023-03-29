/*
 현업 개발
 한개의 클래스로 설계 경우 (X)
 
 설계도 1장 모든 업무를 구현 .. 현실적으로 불가능
 설계도를 여러개로 나눈다 >>문제 발생 (어떤 기준과 논리로 설계도를 나눌것인가?)
 
 쇼핑몰
 결제관리 ,배송관리, 재고관리, 회원관리, 상품관리, 판매처 관리, 카드관리.... >> 각각의 업무별로 설계도
 
 ******** 기준 **********
 여러개의 설계도가 있을 때 관계를 만들어주는 기준
 
 1. 상속 : is  ~ a : 은(는) ~이다  		>> 상속의 관계(부모를 뒤에)
 2. 포함 : has ~ a : 은(는) ~가지고 있다		>> 
 
 원은 도형이다 (부모를 뒤에)
 경찰은 권총이다 (x)
 경찰은 권총을 가지고 있다.
 
 원은 도형이다
 원 extends 도형
 삼각형은 도형이다
 삼각형 extends 도형
 
 
 원 , 점 관계
 원은 점이다 (X)
 
 원은 점을 가지고 있다(O)
 has ~ a (부품정보)
 >> class 원 { 점이라는 부품이 member field 구현 //점 원의점; }
 >> class 점 { x,y }
 
 경찰 권총
 경찰은 권총이다 (x)
 경찰은 권총을 가지고 있다(ㅇ)
 
 class 권총 {}
 class 경찰 { 권총 member field } //NoteBook Mouse 예제 - 의존관계 dependency 
                                항상 가지고 있지 않다면 함수의 parameter로 준다.
                                
 원은 도형이다
 삼각형은 도형이다 
 사각형은 도형이다
 
 도형 분모 (공통적) 자원을 : 추상화, 일반화 >> 그리다 , 색상 (?) -공통점이라고 적은건데 
 원은 : 구체화, 특수화(자신만이 가지는 특징) >> 반지름 , 각이없다
 
 점 : 좌표값 (x,y)
 원은 점을 가지고 있다
 삼각형은 점을 가지고 있다
 사각형은 점을 가지고 있다
 
 -------------------------------------
 class Shape{ 그리다, 색상 }  >> 상속관계 부모 >> 원, 삼각형, 사각형
 class Point{ 좌표값 } >> 포함관계 >> (부품)
 
 구체화, 특수화 : Circle, Triangle
 
 */
class Shape{
	String color="gold"; //default null
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

//문제)
/*
 원을 만드세여 ( 원의 정의 : 원은 한 점과 반지름을 가지고 있다.)
 1. 원은 도형이다. (is ~ a) : Shape
 2. 원은 점을 가지고 있다 (has ~a) : Point
 3. 원의 특수화되고 구체화된 내용은 : 반지름
 
 원의 반지름은 초기값 10을 가진다
 점의 좌표는 초기값 (10, 15) 가진다
 초기값을 설정하지 않으면 반지름과 점의 값을 입력 받을 수 있다.
 */
class Circle extends Shape{
	
	 int radius; //구체화, 특수성
	
	Point point; // 포함 부품
	
	Circle(){
		//this.radius = 10;
		//this.point = new Point(10, 15);
		this(10,new Point(10,15)); //parameter 없이 원을 생성하면 해당값을 가진 원이 생성된다.
	}
	
	Circle(int r, Point point){ // point는 Point 객체의 주소값을 받는다
		this.radius =r;			// 원하는 값을 넣어서 원을 만들고싶다면 해당 오버로딩 메소드를 사용해라.
		this.point = point;
	}
	
}

/*
 문제2)
 삼각형 클래스 만들기
 삼각형은 3개의 점과 색상 그리고 그리다 기능을 가지고있다
 hint) Shape , Point 를 제공받아 작성
 hint) (x,y), (x,y), (x,y) 
 */
class Triangle extends Shape{
	//100점짜리
	// Point[] pointarray;
	Point point, point2, point3;
	String color;
	
	public Triangle() {
		this("red",new Point(1,1),new Point(2,0),new Point(4,3));
		//this(new Point[] {new Point(1,1),new Point(2,0),new Point(4,3)});
	}
	
	public Triangle(Point point,Point point2,Point point3) {
		this.point = point;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	
	public Triangle(String color,Point point,Point point2,Point point3) {
		this.color=color;
	}
	
}

//100점
class Triangle2 extends Shape {
	Point[] pointarray;
	
	
	public Triangle2() {
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
	}
	
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	
	
	//구체화 ,특수화
	//추가적인 기능
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
}



public class Ex02_Inherit_Composition {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.radius);
		System.out.println(circle.color);
		System.out.println(circle.point.x); //주소값.주소값.주소값.field
		System.out.println(circle.point.y);
		circle.draw(); // 상속받은 부모의 함수
		
		//반지름, 점의 갑을 자유롭게 
		/*case 1
		Point point = new Point(10,20);
		Circle circle2 = new Circle(100, point);
		*/
		
		//case 2
		Circle circle2 = new Circle(100,new Point(10,20)); //이런식의 코드가 더많음
		// case 1,2 중에 어떤 코드가 더 좋음??
		// case 1의 코드의 생성자가 다른 곳에서 쓰인다면 case1, 아니면 case2
		Triangle tri = new Triangle();
		tri.draw();
		//Triangle tri2 = new Triangle2();
		System.out.println("색 : "+tri.color);
		//tri2.draw();
	}
}
