package org.example;


// Класс покупателя
class Customer {
    private String name;
    private Gender gender;

    // Конструктор
    public Customer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

