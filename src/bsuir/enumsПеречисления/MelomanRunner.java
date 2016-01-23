package bsuir.enumsПеречисления;

public class MelomanRunner {
	public static void main(String[] args) {
		MusicStyle ms = MusicStyle.ROCK;
		System.out.println(ms);
			
		switch (ms) {
		case JUZZ:
			System.out.println("is Jazz");
			break;
		case CLASSIC:
			System.out.println("is Classic");
			break;
		case ROCK:
			System.out.println("is Rock");
			break;
		case GETHYPER:
			System.out.println("Get Hyper!!!!");
			break;
		default:
			System.out.println("Unknown music style: " + ms);
		}
	}
}
