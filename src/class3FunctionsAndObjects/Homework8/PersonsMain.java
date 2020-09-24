package class3FunctionsAndObjects.Homework8;

public class PersonsMain {
    /*
    Ունենք Person class որն ունի անուն, աշխատավայր եւ տարիք։
    Գրել ֆունկցիա, որը տրված մարդկանց զանգվածից կառանեձնեցնի.
     */
    public static void main(String[] args) {
        // 1. այն մարդկանց ովքեր աշխատում են պարամետրով փոխանցված աշխատավայրում
        System.out.println("Homework 8.1");
        PersonsAPI.getPersonsByWorkplace(DataProvider.persons, "GTLT");

        // 2. ամենաերիտասարդ մարդուն
        System.out.println("Homework 8.2");
        int youngestPerson = PersonsAPI.getYoungestPerson(DataProvider.persons);
        System.out.println("The youngest person in the company is aged " + youngestPerson);

        // 3. ամենատարեց մարդուն
        System.out.println("Homework 8.3");
        int oldestPerson = PersonsAPI.getOldestPerson(DataProvider.persons);
        System.out.println("The oldest person in the company is aged " + oldestPerson);

        //4. բոլոր մարդկանց տարիքներից կվերադարձնի ամենաշատ կրկնվող տարիքը
        System.out.println("Homework 8.4");
        int frequentNumber = PersonsAPI.getMostFrequentAge(DataProvider.persons);
        System.out.println("frequentNumber = " + frequentNumber);

        //5. կսորտավորի մարդկանց ըստ տարիքի
        System.out.println("Homework 8.5");
        PersonsAPI.sortAgeByAsc(DataProvider.persons);

        //6. կսորտավորի մարդկանց ըստ անունի
        System.out.println("Homework 8.6");
        PersonsAPI.sortByName(DataProvider.persons);

        //7. կսորտավորի մարդկանց ըստ աշխատատեղի
        System.out.println("Homework 8.7");
        PersonsAPI.sortByWorkplace(DataProvider.persons);
    }
}