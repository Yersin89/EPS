package library;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Зарегистрироваться");
            System.out.println("2. Войти");
            System.out.println("3. Удалить клиента");
            System.out.println("4. Выйти из программы");

            int choice = 0;
            try {
                choice = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Ввод должен быть числом. Попробуйте снова.");
                scan.next();
                continue;
            }

            switch (choice) {
                case 1:
                    registerClient();
                    break;
                case 2:
                    loginClient();
                    break;
                case 3:
                    deleteClient();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private void registerClient() {
        while (true) {
            try {
                Client client = Client.Registration();
                System.out.println("Клиент зарегистрирован: " + client);
                displayClients();
                break;
            } catch (InvalidNameException | InvalidAgeException e) {
                System.out.println("Ошибка: " + e.getMessage() + " Попробуйте снова.");
            }
        }
    }

    private void loginClient() {
        while (true) {
            displayClients();
            System.out.print("Введите индекс клиента для входа: ");
            int index = 0;
            try {
                index = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Индекс должен быть числом. Попробуйте снова.");
                scan.next();
                continue;
            }

            List<Client> clients = Client.getClients();
            if (index >= 0 && index < clients.size()) {
                Client client = clients.get(index);
                System.out.println("Добро пожаловать, " + client.getName() + " " + client.getPatronymic() + "!");
                clientMenu(client);
                break;
            } else {
                System.out.println("Неверный индекс. Попробуйте снова.");
            }
        }
    }

    private void clientMenu(Client client) {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Выйти в главное меню");
            System.out.println("2. Внести деньги");
            System.out.println("3. Проверить баланс");
            System.out.println("4. Перевести деньги другому клиенту");

            int choice = 0;
            try {
                choice = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Ввод должен быть числом. Попробуйте снова.");
                scan.next();
                continue;
            }

            switch (choice) {
                case 1:
                    return;
                case 2:
                    depositMoney(client);
                    break;
                case 3:
                    checkBalance(client);
                    break;
                case 4:
                    transferMoney(client);
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private void depositMoney(Client client) {
        while (true) {
            System.out.print("Введите сумму для внесения: ");
            double amount = 0;
            try {
                amount = scan.nextDouble();
                scan.nextLine();
                if (amount > 0) {
                    client.depositMoney(amount);
                    System.out.println("Сумма " + amount + " была внесена на счет клиента " + client.getName() + " " + client.getPatronymic() + ".");
                    break;
                } else {
                    System.out.println("Сумма должна быть больше нуля. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Сумма должна быть числом. Попробуйте снова.");
                scan.next();
            }
        }
    }

    private void checkBalance(Client client) {
        System.out.println("Текущий баланс: " + client.getBalance());
    }

    private void transferMoney(Client sender) {
        while (true) {
            displayClients();
            System.out.print("Введите индекс клиента, которому хотите перевести деньги: ");
            int recipientIndex = 0;
            try {
                recipientIndex = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Индекс должен быть числом. Попробуйте снова.");
                scan.next();
                continue;
            }

            List<Client> clients = Client.getClients();
            if (recipientIndex >= 0 && recipientIndex < clients.size()) {
                Client recipient = clients.get(recipientIndex);
                if (recipient.equals(sender)) {
                    System.out.println("Нельзя перевести деньги самому себе. Попробуйте снова.");
                    continue;
                }
                System.out.print("Введите сумму для перевода: ");
                double amount = 0;
                try {
                    amount = scan.nextDouble();
                    scan.nextLine();
                    if (amount > 0) {
                        sender.transferMoney(recipient, amount);
                        System.out.println("Текущий баланс: " + sender.getBalance());
                        break;
                    } else {
                        System.out.println("Сумма должна быть больше нуля. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Сумма должна быть числом. Попробуйте снова.");
                    scan.next();
                }
            } else {
                System.out.println("Неверный индекс. Попробуйте снова.");
            }
        }
    }

    private void deleteClient() {
        while (true) {
            displayClients();
            System.out.print("Введите индекс клиента для удаления: ");
            int index = 0;
            try {
                index = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Индекс должен быть числом. Попробуйте снова.");
                scan.next();
                continue;
            }

            List<Client> clients = Client.getClients();
            if (index >= 0 && index < clients.size()) {
                Client clientToRemove = clients.remove(index);
                System.out.println("Клиент " + clientToRemove.getName() + " " + clientToRemove.getPatronymic() + " удален.");
                displayClients();
                break;
            } else {
                System.out.println("Неверный индекс. Попробуйте снова.");
            }
        }
    }

    private void displayClients() {
        List<Client> clients = Client.getClients();
        if (clients.isEmpty()) {
            System.out.println("Список клиентов пуст.");
        } else {
            System.out.println("Список клиентов:");
            for (int i = 0; i < clients.size(); i++) {
                System.out.println(i + ": " + clients.get(i));
            }
        }
    }
}
