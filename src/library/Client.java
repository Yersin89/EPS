package library;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

@Getter
@Builder
public class Client {
    private String name;
    private String surname;
    private String patronymic;
    private Integer age;
    private double balance;
    private String password;
    private String confirm;
    private static List<Client> clients = new ArrayList<>();

    public Client(String name, String surname, String patronymic, Integer age, Double balance, String password, String confirm) {
        this.name = name.toLowerCase();
        this.surname = surname.toLowerCase();
        this.patronymic = patronymic.toLowerCase();
        this.age = age;
        this.balance = balance;
        this.password = password;
        this.confirm = confirm;
    }

    public Client() {
        this.name = "Test";
        this.surname = "Test";
        this.patronymic = "Test";
        this.age = 5;
        this.balance = 0.0;
        this.password = "test";
    }

    public static Client Registration() throws InvalidNameException, InvalidAgeException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scan.next();
        if (!name.matches("[а-яА-Яa-zA-Z]+")) {
            throw new InvalidNameException("Имя должно содержать только буквы.");
        }

        System.out.print("Введите фамилию: ");
        String surname = scan.next();
        if (!surname.matches("[а-яА-Яa-zA-Z]+")) {
            throw new InvalidNameException("Фамилия должна содержать только буквы.");
        }

        System.out.print("Введите отчество: ");
        String patronymic = scan.next();
        if (!patronymic.matches("[а-яА-Яa-zA-Z]+")) {
            throw new InvalidNameException("Отчество должно содержать только буквы.");
        }

        System.out.print("Введите Ваш возраст: ");
        try {
            int age = scan.nextInt();
            if (age < 0 || age > 128) {
                throw new InvalidAgeException("Возраст должен быть в диапазоне от 0 до 128.");
            }

        } catch (InputMismatchException e) {
            scan.next();
            throw new InvalidAgeException("Возраст должен быть числом.");
        }
        System.out.print("Введите пароль: ");
        String password = scan.next();
        System.out.print("Введите пароль еще раз: ");
        String confirm = scan.next();
        if(password != confirm)
        {
            throw new InvalidNameException("Пароль не подходит");
        }
        Client client = new Client(name, surname, patronymic, builder().age, builder().balance, builder().password, builder().confirm);
        clients.add(client);
        return client;

    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public boolean withdrawMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void transferMoney(Client recipient, double amount) {
        if (this.withdrawMoney(amount)) {
            recipient.depositMoney(amount);
            System.out.println("Сумма " + amount + " была переведена клиенту " + recipient.getName() + " " + recipient.getPatronymic() + ".");
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    public static List<Client> getClients() {
        return clients;
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}