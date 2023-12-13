package myobj;

public class Extendzz {

	public static void main(String[] args) {

		Weapon w1 = new Weapon();
		Bomb b1 = new Bomb();

		Weapon w2 = new Weapon("k2", 200);
		w2.weight = 20;
		b1.name = "dynamite";
		b1.info();

	}
}

class Weapon {

	String name;
	int range;
	int damage;
	int weight = 10;

	public Weapon() {

	}

	public Weapon(String name, int damage) { 

		this.name = name;
		this.damage = damage;

	}

}

class Bomb extends Weapon {
	public Bomb() {
		super("Atomic", 2000); // 이 super는 public Bomb()이거랑 상관없음
	} // public Weapon(String name, int damage) 여기에 해당

	String name;
	int weight;
	int splashDamage;

	void info() {

		System.out.println("Bomb 클래스의 super.weight " + super.weight);
		System.out.println("Bomb 클래스의 this.weight " + this.weight);
		System.out.println("Bomb 클래스의 super.name " + super.name);
		System.out.println("Bomb 클래스의 this.name " + this.name);

	}
}