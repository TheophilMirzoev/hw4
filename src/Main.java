import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // задача про совершеннолетие
        int age = 17;

        if (age > 17) {

            System.out.println(" Поздравляем с совершеннолетием");
        } else {
            System.out.println(" Не поздравляем с совершеннолетием");}





        //Задача про школу университет и работу
        int ageChildOrNotaChild = 24;

        if (ageChildOrNotaChild >= 7 && ageChildOrNotaChild < 18){
            System.out.println(" Школьник");
        } else if (ageChildOrNotaChild >= 18 && ageChildOrNotaChild < 24) {
            System.out.println(" Можно в институт");  
        } else if (ageChildOrNotaChild >= 24) {
            System.out.println(" Пора искать работу");
        }



        // задача про места в поезде
        int wagonCapacity = 102;
       int AmountSittingRoom = 60;
       int amountPassengers = 111;

       if (amountPassengers > AmountSittingRoom && amountPassengers <= wagonCapacity){

           System.out.printf(" стоя");

       } else if (amountPassengers <= AmountSittingRoom && amountPassengers <= wagonCapacity) {

            System.out.printf(" сидя");

        }  else if (amountPassengers > wagonCapacity){

            System.out.printf(" нет мест!");
        }



        // задача про сад работу школу
       int ageOfDude = 23;

        boolean Kindergarten = ageOfDude >= 2 && ageOfDude < 7;
        boolean School = ageOfDude >= 7 && ageOfDude <= 18;
        boolean University = ageOfDude > 18 && ageOfDude < 24;
        boolean Work = ageOfDude > 24;

        if (Kindergarten){
            System.out.printf(" Если возраст человека равен " + ageOfDude + " то ему нужно ходить в сад");
        } else if (School) {
           System.out.printf(" Если возраст человека равен " + ageOfDude + " то ему нужно ходить в школу");
        } else if (University) {
          System.out.printf(" Если возраст человека равен " + ageOfDude + " то ему нужно ходить в университет");
        } else if (Work) {
           System.out.printf(" Если возраст человека равен " + ageOfDude + " то ему нужно ходить на завод");
        }





        // задача про аттракцион
        int ageForAttraction = 14;
        boolean cantUse = ageForAttraction < 5;
        boolean canWithParent = ageForAttraction >= 5 && ageForAttraction < 14;
        boolean canUseItself = ageForAttraction >= 14;

        if(cantUse){
            System.out.printf(" нельзя на аттракционы! ");
        } else if (canWithParent) {
            System.out.printf(" можно в сопровождении ");
        } else if (canUseItself) {
            System.out.printf(" можно ");
        }

          // про числа
        int one = 1;
        int two = 2;
        int free = 3;

        boolean one1 = one < two && one < free;
        boolean two2 = two > one && two < free;
        boolean free3 = free > two && free > one;

        if (one > two){
            System.out.println(one);
        } else if (one > free) {
                System.out.println(one);
        } else if (two > free) {
              System.out.println(two);
        } else if (free > two) {
              System.out.println(free);
        }

    }
}