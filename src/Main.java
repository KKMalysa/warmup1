import java.util.ArrayList;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        HashSet<String> studentSet = new HashSet<>();

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Adam Mada");
        studentList.add("Ada Mada");
        studentList.add("Adrian Mada");
        studentList.add("Antoni Mada");
        studentList.add("Arkadiusz Mada");
        studentList.add("Adrianna Mada");
        studentList.add("Anna Mada");
        studentList.add("Amelia Mada");
        studentList.add("Jan Nowak");
        studentList.add("Joanna Nowak");
        studentList.add("Janina Nowak");
        studentList.add("Janusz Nowak");
        studentList.add("Jan Nowak");
        studentList.add("Janina Nowak");
        studentList.add("Jan Nowak");
        studentList.add("Adam Mada");


//        for (String student : studentList) {
//            System.out.println(student);
//        }

//        System.out.println(countDuplicates(studentList));

//        printOddIndexes(studentList);
//        System.out.println();
//        printEvenIndexes(studentList);

//        fromListToSet(studentList, studentSet);
    }

    public static int countDuplicates(ArrayList<String> studentList) {
    int duplicateCount = 0;

    for(int i = 0; i<studentList.size(); i++) {
       for(int j = i+1; j < studentList.size(); j++) {
           if(studentList.get(i).equals(studentList.get(j))){
               duplicateCount++;
               System.out.println("znalazłem duplikat: " + studentList.get(i) + " " + i + " oraz " + studentList.get(j) + " " + j);
           }
       }

    }
    return duplicateCount;
    }

    public static void printOddIndexes(ArrayList<String> studentList) {
        for (int i = 0; i<studentList.size(); i++) {
            if(i>0 && i%2 == 0){
                System.out.println(i + " " + studentList.get(i));
            }
        }
    }
    public static void printEvenIndexes(ArrayList<String> studentList) {
        for (int i = 0; i<studentList.size(); i++) {
            if(i%2 != 0){
                System.out.println(i + " " + studentList.get(i));
            }
        }
    }

    public static void fromListToSet(ArrayList<String>studentList, HashSet<String> studentSet ){
    for (int i=0; i<studentList.size(); i++){
        studentSet.add(studentList.get(i));
    }
        System.out.println();
        System.out.println("Przeniesiono wszystkie lementy z listy do zbioru. Zawiera on " + studentSet.size() + " unikalnych elementów ");
        System.out.println(studentSet);

    }

}
