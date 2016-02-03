package student;

public class Students {
	
	public void setInformation(Info i){
		String []names = {"Евгений", "Вася", "Петя", "Катя", "Сергей", "Настя", "Наташа"};
		
		for (int j = 0; j < names.length; j++) {
			i.setName(names[j]);
		}
		String []surnames = {"Шейма", "Пупкин", "Пушкин", "Троян", "Сойко", "Хмель", "Кур"};
		for (int j = 0; j < surnames.length; j++) {
			i.setSurname(surnames[j]);
		}
		}
	}

