package studentHogwards;

import studentHogwards.StudentsMatrix;

public class SelectFaculty {
	String[] a = null;
	public String[] selection(StudentsMatrix b, Student s){
		String fac = s.getFaculty();
		
		if (fac == "Gryffindor")
			a = b.getGryffindor();
		if (fac == "RavenClaw")
			a = b.getRavenClaw();
		if (fac == "Hufflepuf")
			a = b.getHufflepuf();
		if (fac == "Slytherin")
			a = b.getSlytherin();
		return a;
	}
	public void printing(){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	

	
	
}
