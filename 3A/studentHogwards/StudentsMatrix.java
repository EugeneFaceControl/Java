package studentHogwards;

import studentHogwards.Student;

public class StudentsMatrix {
	Student s = new Student();
	String v = s.getFaculty();

	private String[] Gryffindor = { "���� ����", "������� �����", "�������� ����", "������ ���", "�������� ���������",
			"��������� �������", "�� �������", "������ ���������", "������ �����", "����� �����", "���� ���",
			"������ ����������", "������ ���������", "������ ������", "����� ������", "������� �����", "����� ������",
			"������ ����", "�������� ������", "��� �����", "����� ������", "������ �������", "������ �����",
			"���� �����", "������ �����", "����� �����", "��� �����", "����� ��������", "����� ��������",
			"������� �����", "���������� ���" };
	private String[] RavenClaw = { "������ ������", "������ �����", "����� ����������", "����� ���", "������ ���������",
			"������ �����", "����� ������", "���� ��������", "�������� �������", "������� ������", "����� �����",
			"���� �����", "��������", "����� ������", "������ ������", "���� ����", "�������� ������",
			"������ ��������" };
	private String[] Hufflepuf = { "����� �����", "������ �����", "�������� ���������", "������� ������",
			"������ �������", "���� �������", "��������� ������", "����� �����", "���� ���������", "���� ����������",
			"������� ����", "������ �����", "��������� �����", "����� �����", "������� ����-�������", "���� ������" };
	private String[] Slytherin = { "���������� ����", "�������� ����", "������� ����", "������� ����", "������� �����",
			"�������� ������", "������ ������", "����� ������", "����� ���������", "������� ���������", "������ ����",
			"��������� ������", "��������� ���������", "����� ������", "��������� �����������", "������",
			"����� ���������", "����� �����", "������ �������", "������ �����", "��� �����", "������� ��������",
			"������� �����", "������ �����" };

	

	public String[] getGryffindor() {
		return Gryffindor;
	}

	public void setGryffindor(String[] gryffindor) {
		Gryffindor = gryffindor;
	}

	public String[] getRavenClaw() {
		return RavenClaw;
	}

	public void setRavenClaw(String[] ravenClaw) {
		RavenClaw = ravenClaw;
	}

	public String[] getHufflepuf() {
		return Hufflepuf;
	}

	public void setHufflepuf(String[] hufflepuf) {
		Hufflepuf = hufflepuf;
	}

	public String[] getSlytherin() {
		return Slytherin;
	}

	public void setSlytherin(String[] slytherin) {
		Slytherin = slytherin;
	}

	

	// public void setStudentList(String[] studentList) {
	// this.studentList = studentList;
	// }
}
