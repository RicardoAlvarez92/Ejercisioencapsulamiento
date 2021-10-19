package com.generation;

class Main {
    public static void main(String[] args) {
        Person PERSONA = new Person();
        PERSONA.setName("Ricardo Alvarez");
        PERSONA.setAge(29);
        PERSONA.setId("abc-8918-31");

        System.out.println("Nombre: " + PERSONA.getName() + "\nEdad: " + PERSONA.getAge() + "\nID: " + PERSONA.getId());
    }
}
