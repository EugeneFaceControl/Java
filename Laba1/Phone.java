import java.io.*;
import java.util.*;

public class Phone {
	public String phoneName(String phone) {
		String name = new String();
		String line;
		try {
			FileReader fr = new FileReader("C:/Users/Евгений/workspace/Java/Laba1/phones.txt");
			BufferedReader in = new BufferedReader(fr);
			while ((line = in.readLine()) != null) {
				String[] str = line.split(" ");
				if (str[0].equals(phone)) {
					name = str[1];
					break;
				} else
					name = "No such telephone";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}

	public String namePhone(String name) {
		String phone = new String();
		String line;
		try {
			FileReader fr = new FileReader("C:/Users/Евгений/workspace/Java/Laba1/phones.txt");
			BufferedReader in = new BufferedReader(fr);
			while ((line = in.readLine()) != null) {
				String[] str = line.split(" ");
				if (str[1].equals(name)) {
					name = str[0];
					break;
				} else
					name = "No such name";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return phone;
	}
}
