
public abstract class Unit {
	public int hp;
	public abstract void attack(); // 추상메소드 (추상메소드를 가지면 추상클래스가 된다)
	public void move() {
		System.out.println("움직인다");
	}
}
