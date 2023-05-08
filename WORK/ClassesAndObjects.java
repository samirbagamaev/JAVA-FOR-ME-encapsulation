//SET И GET

package WORK;

public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Самир");
        person1.setAge(19);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());

        person1.speak();

    }
}

class Person {
    private String name; // string потому что СЛОВО
    private int age; // age потому что ЦИФРЫ , ЧИСЛО

    // set
    public void setName(String userName) {
        if (userName.isEmpty()) { // isEmpty возвращает true если строка пустая и false если не пустая
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    // get
    public String getName() {
        return name;
    }

    // set
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    // get
    public int getAge() {
        return age;
    }

    void speak() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");

        }
    }

    void sayHello() {
        System.out.println("Привет");
    }
}

/*

ОТВЕТ:
Выводим значение в main методе: Самир
Выводим значение в main методе: 19
Меня зовут Самир, мне 19 лет
Меня зовут Самир, мне 19 лет

*/