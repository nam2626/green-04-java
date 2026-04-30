package e02_anonymous;

public class AnimalMain {
	public static void eat(Animal a) {
		a.eat();
	}
	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		eat(animal);
		eat(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		});
	}

}




