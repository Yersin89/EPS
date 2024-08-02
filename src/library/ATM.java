package library;

public class ATM {
    public static void main(String[] args) {
        // должна быть меню с выбором регистрации клиета, удаление клиента из базы, вывод ввод средств. изменение данных клиента

        // создать класс клиент, карточек которые будут связанны между собой и иметь поля
        //клиента , ФИО, Карточки, гражданство, страна
        //карточки , номер, спв, дата, сумма
        // в карточке должен быть функционал по типу проверка суммы, вывод и ввод средств, проверка пароля
        // клиент редактирование фио, добавление и удаление карточек, смена страны

//        Map<String,Client> test = new HashMap<>();
//        Client testClient = new Client();
//        Client testClient2 = new Client("qwe","qwe","qwe",12,1.0,"123");
//        test.put("first",testClient);
//        test.put("second",testClient2);
//        System.out.println(test.get("first"));
//        System.out.println(test.get("second"));
//        List<Client> clients = List.of(new Client(),new Client(),new Client());
//        boolean ageTest = clients.stream().allMatch(client -> client.getAge()>=18);
//        List<Client> age18 = clients.stream().filter(Client::isAdult).collect(Collectors.toList());


        Menu menu = new Menu();
        menu.start();
    }

}
