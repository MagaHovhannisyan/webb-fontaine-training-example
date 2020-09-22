package class3FunctionsAndObjects.Homework8;

import java.util.Arrays;

public class DataProvider {
    static Persons[] persons = new Persons[5];
    static {
        persons[0] = new Persons("Ani", "GTLT", 19);
        persons[1] = new Persons("Mane", "WF", 30);
        persons[2] = new Persons("Ashot", "Microsoft", 29);
        persons[3] = new Persons("Nare", "DataCamp", 25);
        persons[4] = new Persons("Karen", "UFAR", 25);
    }
}