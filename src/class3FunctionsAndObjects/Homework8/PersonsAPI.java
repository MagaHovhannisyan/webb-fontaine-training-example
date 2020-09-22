package class3FunctionsAndObjects.Homework8;

public class PersonsAPI {
    //Printout the person name working in provided company
    static void getPersonsByWorkplace(Persons[] person, String company) {
        for (Persons persons : person) {
            if (persons.company.equals(company)) {
                System.out.println("The person working in " + company + " is " + persons.name);
            }
        }
    }

    //Return the youngest person from array
    static int getYoungestPerson(Persons[] person) {
        int min = person[0].age;
        for (int i = 1; i < person.length; ++i) {
            if (person[i].age < min) {
                min = person[i].age;
            }
        }
        return min;
    }

    //Return the oldest person from array
    static int getOldestPerson(Persons[] person) {
        int max = person[0].age;
        for (int i = 1; i < person.length; ++i) {
            if (person[i].age > max) {
                max = person[i].age;
            }
        }
        return max;
    }

    //Return the youngest person from array
    static int getMostFrequentAge(Persons[] person) {
        int count = 1, tempCount;
        int popular = person[0].age;
        int temp = 0;
        for (int i = 0; i < (person.length - 1); i++) {
            temp = person[i].age;
            tempCount = 0;
            for (int j = 1; j < person.length; j++) {
                if (temp == person[j].age)
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

    //Sort the ages
    static void sortAgeByAsc(Persons[] person) {
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].age > person[j].age) {
                    int temp = person[i].age;
                    person[i].age = person[j].age;
                    person[j].age = temp;
                }
            }
        }
        System.out.println("The ages of workers sorted in ascending order: ");
        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i].age + " ");
        }
        System.out.println();
    }

    //Sort the names
    static void sortByName(Persons[] person) {
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].name.compareTo(person[j].name) > 0) {
                    String temp = person[i].name;
                    person[i].name = person[j].name;
                    person[j].name = temp;
                }
            }
        }
        System.out.println("The name of workers sorted in ascending order: ");
        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i].name + " ");
        }
        System.out.println();
    }

    //Sort the workplaces
    static void sortByWorkplace(Persons[] person) {
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].company.compareTo(person[j].company) > 0) {
                    String temp = person[i].company;
                    person[i].company = person[j].company;
                    person[j].company = temp;
                }
            }
        }
        System.out.println("The companies of workers sorted in ascending order: ");
        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i].company + " ");
        }
        System.out.println();
    }
}