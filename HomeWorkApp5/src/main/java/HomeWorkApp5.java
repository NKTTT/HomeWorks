public class HomeWorkApp5 {
    public static void main(String[] args)  {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иван Улиткин", "Генеральный директор", "who@is.com", "+79991231212", 210000, 43);
        persArray[1] = new Employee("Андрей Улиткин", "Ну тот который не сосвем главный но главный", "is@me.ru", "+79991232121", 130000, 40);
        persArray[2] = new Employee("Коза Дереза", "Рерайтер", "koz@dez.me", "+79999999999", 1900000, 69);
        persArray[3] = new Employee("Олеся Лисина", "Разносчик компота", "nesu@kompot.ru", "+79995425242", 120000, 45);
        persArray[4] = new Employee("Дарья Почкова", "Ответственный за воздух", "please@help.me", "+79998887766", 100000, 48);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].getAge() >= 40) persArray[i].print();
    }


}
