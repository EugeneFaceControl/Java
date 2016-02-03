package studentHogwards;

import studentHogwards.Student;

public class StudentsMatrix {
	Student s = new Student();
	String v = s.getFaculty();

	private String[] Gryffindor = { "Кэти Белл", "Лаванда Браун", "Ромильда Вейн", "Оливер Вуд", "Гермиона Грейнджер",
			"Анджелина Джонсон", "Ли Джордан", "Невилл Долгопупс", "Деннис Криви", "Колин Криви", "Ричи Кут",
			"Натали МакДональд", "Кормак Маклагген", "Элоиза Миджен", "Ангус Мэтлок", "Парвати Патил", "Гарри Поттер",
			"Джимми Пикс", "Демельза Робинс", "Дин Томас", "Эмили Тэйлор", "Алисия Спиннет", "Джинни Уизли",
			"Фред Уизли", "Джордж Уизли", "Перси Уизли", "Рон Уизли", "Симус Финниган", "Викки Фробишер",
			"Джеффри Хупер", "Аберкромби Юан" };
	private String[] RavenClaw = { "Стюарт Акерли", "Маркус Белби", "Мэнди Броклхерст", "Терри Бут", "Энтони Голдстейн",
			"Роджер Дэвис", "Майкл Корнер", "Эдди Кармайкл", "Пенелопа Кристал", "Полумна Лавгуд", "Падма Патил",
			"Орла Свирк", "Стеббинс", "Лайза Турпин", "Сандра Фосетт", "Чжоу Чанг", "Мариэтта Эджком",
			"Роберт Хиллиард" };
	private String[] Hufflepuf = { "Ханна Аббот", "Сьюзен Боунс", "Элеонора Брэнстоун", "Бриджит Венлок",
			"Седрик Диггори", "Оуэн Колдуэл", "Артемизия Лафкин", "Тедди Люпин", "Эрни Макмиллан", "Ньют Саламандер",
			"Захария Смит", "Гроган Стамп", "Нимфадора Тонкс", "Кевин Уитби", "Джастин Финч-Флетчли", "Роза Целлер" };
	private String[] Slytherin = { "Беллатриса Блэк", "Нарцисса Блэк", "Регулус Блэк", "Грегори Гойл", "Винсент Крэбб",
			"Абраксас Малфой", "Люциус Малфой", "Драко Малфой", "Дафна Гринграсс", "Астория Гринграсс", "Теодор Нотт",
			"Малькольм Бэддок", "Милисента Булстроуд", "Блейз Забини", "Рудольфус Лейстрейндж", "Мерлин",
			"Пэнси Паркинсон", "Эйлин Принц", "Грэхэм Причард", "Эдриан Пьюси", "Том Реддл", "Гораций Слизнорт",
			"Северус Снегг", "Маркус Флинт" };

	

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
