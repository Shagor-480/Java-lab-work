public abstract class Animal {
    private String name;
    private int age;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species);
    }
}
public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
public class Cat extends Animal {
    private boolean isDomesticated;

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setIsDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public abstract class Employee {
    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public abstract void work();
}
public class Veterinarian extends Employee {
    @Override
    public void work() {
        System.out.println("Examining animals...");
    }
}
public class Caretaker extends Employee {
    @Override
    public void work() {
        System.out.println("Cleaning cages and feeding animals...");
    }
}
import java.util.ArrayList;

public class Shelter {
    private ArrayList<Animal> animals;
    private ArrayList<Employee> employees;

    public Shelter() {
        animals = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void displayAllAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName());
        }
    }

    public void simulateDay() {
        System.out.println("A Day at the Shelter:");
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Create animals
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(3);
        dog.setSpecies("Canine");
        dog.setBreed("Golden Retriever");

        Cat cat = new Cat();
        cat.setName("Whiskers");
        cat.setAge(2);
        cat.setSpecies("Feline");
        cat.setIsDomesticated(true);

        // Create employees
        Veterinarian vet = new Veterinarian();
        vet.setName("Dr. Smith");
        vet.setEmployeeId(101);

        Caretaker caretaker = new Caretaker();
        caretaker.setName("John Doe");
        caretaker.setEmployeeId(102);

        // Create shelter
        Shelter shelter = new Shelter();
        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.addEmployee(vet);
        shelter.addEmployee(caretaker);

        // Simulate a day at the shelter
        shelter.simulateDay();

        // Display all animals
        System.out.println("\nAll Animals:");
        shelter.displayAllAnimals();
    }
}

