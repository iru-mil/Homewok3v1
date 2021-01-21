package ru.geekbrains.Homework3v1;

public class MainApp {
    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0]  = new Worker("Иванов ИИ", "Директор",
                "ivanov@rbusy.ru", "9250751203", 150000, 52);
        workersArray[1] = new Worker("Петров ПП", "Шеф-повар",
                "petrov@rbusy.ru", "9253254555", 100000, 37);
        workersArray[2] = new Worker("Орлов СС", "Повар",
                "orlov@rbusy.ru", "9255442505", 50000, 26);
        workersArray[3] = new Worker("Воронова ЛЮ", "Бухгалтер",
                "voronova@rbusy.ru", "9253002000", 45000, 41);
        workersArray[4] = new Worker("Сорокина ИВ", "Продавец",
                "sorokina@rbusy.ru", "9259257154", 35000, 25);

        System.out.println("Сведения о сотрудниках старше 40 лет: ");
        for (int i = 0; i<5; i++)
            if (workersArray[i].getAge() > 40) workersArray[i].info();
    }






}
