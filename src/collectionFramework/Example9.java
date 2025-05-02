package collectionFramework;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Person {
    String name;
    Boolean isMale;
    int age;

    public Person(){}

     public Person(String name,Boolean isMale, int age){
        this.name = name;
        this.isMale = isMale;
        this.age = age;
     }


}
public class Example9 {
    public static void main(String[] args) {


        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.age < o2.age)
                {
                    return 1;
                }
                else if(o2.age < o1.age)
                {
                    return -1;
                }

                return 0;
            }
        };

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(comparator);

        Person person1 = new Person("John", true, 25);
        Person person2 = new Person("Alice", false, 30);
        Person person3 = new Person("Bob", true, 22);
        Person person4 = new Person("Eve", false, 28);
        Person person5 = new Person("Charlie", true, 35);
        Person person6 = new Person("Dana", false, 27);
        Person person7 = new Person("James", true, 40);
        Person person8 = new Person("Sophia", false, 23);
        Person person9 = new Person("Michael", true, 33);
        Person person10 = new Person("Olivia", false, 26);

        priorityQueue.add(person1);
        priorityQueue.add(person2);
        priorityQueue.add(person3);
        priorityQueue.add(person4);
        priorityQueue.add(person5);
        priorityQueue.add(person6);
        priorityQueue.add(person7);
        priorityQueue.add(person8);
        priorityQueue.add(person9);
        priorityQueue.add(person10);

        System.out.println(priorityQueue);


    }

}
