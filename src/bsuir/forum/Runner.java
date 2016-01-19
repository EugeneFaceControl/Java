package bsuir.forum;

import bsuir.forum.Post;

public class Runner {
	public static void main(String[] args) {
		Post<String, Short> p1 = new Post<>();
		Post<StringBuilder, Long> p2 =  new Post<>();
		System.out.println(p1.getMessage());
		System.out.println(p2.getMessage());
	}
}
