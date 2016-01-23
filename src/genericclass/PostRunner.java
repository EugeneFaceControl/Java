package genericclass;

public class PostRunner {
	public static void main(String[] args) {
		Post<String, Short> post1 = new Post<>();
		post1.setMessage("Hi, man");
		System.out.println(post1.getMessage());
		if (post1 instanceof Post)
			System.out.println("All cool");
		else
			System.out.println("Damn");
	}
}
