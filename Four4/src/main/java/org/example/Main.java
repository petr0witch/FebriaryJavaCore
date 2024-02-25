package org.example;

// Перечисление с гендерами
enum Gender {
    MALE,
    FEMALE,
    OTHER
}


// Перечисление с праздниками
enum Holiday {
    NONE,
    NEW_YEAR,
    WOMEN_DAY,
    MEN_DAY
}

// Основная программа
public class Main {
    // Метод поздравления с праздником
    public static void congratulateCustomers(Customer[] customers, Holiday holiday) {
        for (Customer customer : customers) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С новым годом, " + customer.getName() + "!");
                    break;
                case WOMEN_DAY:
                    if (customer.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 марта, " + customer.getName() + "!");
                    }
                    break;
                case MEN_DAY:
                    if (customer.getGender() == Gender.MALE) {
                        System.out.println("С 23 февраля, " + customer.getName() + "!");
                    }
                    break;
                default:
                    System.out.println("Поздравляем, " + customer.getName() + "!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Создание массива покупателей
        Customer[] customers = {
                new Customer("Иван", Gender.MALE),
                new Customer("Мария", Gender.FEMALE),
                new Customer("Алекс", Gender.MALE),
                // Добавьте своих покупателей по необходимости
        };


        Holiday todayHoliday = Holiday.MEN_DAY;

        congratulateCustomers(customers, todayHoliday);
    }
}
