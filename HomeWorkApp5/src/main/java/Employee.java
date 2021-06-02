public class Employee {
   private String name;
   private String position;
   private String email;
   private String phone_number;
   private int salary;
   private int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}

    public void print(){
        System.out.println(this);
    }
    public int getAge () {
    return age;
    }
}