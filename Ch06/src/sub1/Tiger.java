package sub1;

public class Tiger extends Animal{
	public void move() {
		System.out.println("Tiger run...");
	}

	@Override
	public void hunt() {
		System.out.println("Tiger hunt...");
	}
}
