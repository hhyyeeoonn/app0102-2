import java.util.ArrayList;

public class Base {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		/*
		m.move();
		m.attack();
		t.attack();
		*/
		// 같이 묶어서 공격할 유닛이 100개면? 위의 코드뿐이라면 100번의 attack을 적어야 함
		// 메소드의 공통분모? 이름은 통일할 수 있는데 내용이 다르다면?
		// 메소드를 추상화
		// 메소드 기준에서 공통분모를 만들자
		ArrayList<Unit> team = new ArrayList<Unit>();
		team.add(m); // 다형성 -> 이름이 동일하지만 구체적인 내용은 다른 메소드의 추상화
		team.add(t);
		
		for(Unit u : team) {
			u.move();
			u.attack();
		}
	}
}

/*
 *  동일한 필드 -> 클래스 추상화 -> 다형성
 *  동일한 메소드 -> 클래스 추상화 -> 다형성
 *  기능은 같지만 내용이 다른 메소드 -> 추상클래스(추상메소드 -> 오버라이딩)
 *  기능은 같지만 내용이 다른 메소드 -> 이미 다른 클래스를 상속중
*/