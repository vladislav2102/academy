package by.academy.homework4.task2;

public class Body {

	private Heart heart;
	private Lungs lungs;

	public Body() {
		this.heart = new Heart();
		this.lungs = new Lungs();
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Lungs getLungs() {
		return lungs;
	}

	public void setLungs(Lungs lungs) {
		this.lungs = lungs;
	}

	public class Heart {

		public void live() {
			for (int i = 1; i <= Integer.MAX_VALUE; i++) {
				if (i % 100 == 0) {
					System.out.println("'Knock-knock-knocking' on heaven's door");
				}
			}
		}
	}

	public class Lungs {

		public void live() {
			for (int i = 1; i <= Integer.MAX_VALUE; i++) {
				if (i % 100 == 0) {
					System.out.println("breathe out");
				} else if (i % 50 == 0) {
					System.out.println("breathe in");
				}
			}
		}
	}

	public void live () {
		lungs.live();
		heart.live();
		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \n" +
				"And I believe that you are free, and life has only begun.");
	}
}
