package student;

public class Students {
	
	public void setInformation(Info i){
		String []names = {"�������", "����", "����", "����", "������", "�����", "������"};
		
		for (int j = 0; j < names.length; j++) {
			i.setName(names[j]);
		}
		String []surnames = {"�����", "������", "������", "�����", "�����", "�����", "���"};
		for (int j = 0; j < surnames.length; j++) {
			i.setSurname(surnames[j]);
		}
		}
	}

