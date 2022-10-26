public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    // Домашнее задание - 1
    System.out.println("Домашнее задание - 1");
    // Задание 1
    System.out.println("Задание 1");
int user = 19;
    if (user >= 18);{
        System.out.println("Поздравленем пользователя с совершеннолетием");}
    if (user < 18);{
        System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");}
    // Задание 2
    System.out.println("Задание 2");
int user1 = 16;
if (user1 >= 7);{
        System.out.println("Ребенок ходит в школу");}
int user2 = 22;
if (user2 >= 18); {
        System.out.println("человек уже закончил школу и может отправляться в университет");}
int user3 = 26;
if (user3 >=24); {
        System.out.println("человек окончил университет и ему пора искать первую работу");}
        // Задание 3
        System.out.println("Задание 3");
int  capacity = 108;
        System.out.println("Мест в вагоне " + capacity);
        if (capacity >=108); {
            System.out.println("Мест в вагоне нет"); }

byte sit = 60;
        System.out.println("Сидячих мест в вагоне " + sit);
        if (sit >= 60);{
            System.out.println("В вагоне присутствуют стоячие места");}
int stand = capacity - sit;
        System.out.println("Стоячих мест в вагоне "+ stand);
        if (stand >= capacity-sit); {
            System.out.println("В вагоне присутствуют сидячие и стоячие места");}
    // Домашнее задание - 2
        System.out.println("Домашнее задание - 2");
    //Задание 1
        System.out.println("Задание 1");
int user4 = 24;
if (user4 >=18) {
      System.out.println("Поздравление пользователя с совершеннолетием");}
else {System.out.println("Возраст совершеннолетия ещё не наступил");}
    //Задание 2
        System.out.println("Задание 2");
        int user5 = 16;
        if (user5 >= 7 && user5 <18){
            System.out.println("Ребенок ходит в школу");}
        else if (user5 >= 18 && user5 <24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");}
        else if (user5 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");}
    //Задание 3
        System.out.println("Задание 3");
int  capacity1 = 108;
    System.out.println("Мест в вагоне " + capacity1);
byte sit1 = 60;
    System.out.println("Сидячих мест в вагоне " + sit1);
int stand1 = capacity1 - sit1;
    System.out.println("Стоячих мест в вагоне "+ stand1);
    int capacity2 = 46;
    if (capacity2 >= capacity1) {
        System.out.println("Вагон полон");
    }
    else if (capacity2 >= sit1 && capacity2 <capacity1){
        System.out.println("В вагоне присутствуют стоячие места");
    }
    else if (capacity2 <stand1 && capacity2 >0) {
        System.out.println("В вагоне присутствуют сидячие и стоячие места");
    }
 // Домашнее задание - 3
        System.out.println("Домашнее задание - 3");
        //Задание 1
        System.out.println("Задание 1");
int age = 48;
if (age >=2 && age <= 6) {
    System.out.println("Ему нужно ходить в детский сад");
}
    else if (age >= 7 && age <=18) {
    System.out.println("Ему нужно ходить в школу");
}
    else if (age > 18 && age <=24) {
    System.out.println("Его место в университете");
}
    else if (age > 24) {
    System.out.println("Ему пора ходить на работу");
}
    //Задание 2
        System.out.println("Задание 2");
    int age1 = 12;
    if (age1 <5){
        System.out.println("он не может кататься на аттракционе");
    }
    else if (age1 >5 && age1 <14){
        System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
    }
    else if (age1 >14){
        System.out.println("то он может кататься без сопровождения взрослого");
    }
    //Задание 3
        System.out.println("Задание 3");
    int one = 1;
    int two = 2;
    int three = 3;
    if (one > two && one > three) {
        System.out.println("One большее число");
    }
    else if (two > one && two > three){
        System.out.println("Two большее число");
    }
    else if (three > one && three > two){
        System.out.println("three большее число");
    }
}
}