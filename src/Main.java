//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Задача №1
        System.out.println();
        System.out.println("         Задача №1");
        short age = 128;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("но совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

//        Задача №2
        System.out.println();
        System.out.println("         Задача №2");
        byte temperature = 23;
        System.out.print("На улице " + temperature + " градусов, ");
        if (temperature <= 5) {
            System.out.println("нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("можно идти без шапки.");
        }

        //        Задача №3
        System.out.println();
        System.out.println("         Задача №3");
        short speed = 83;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed >= 60) {
            System.out.println("придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("можно ездить спокойно.");
        }

        //        Задача №4
        System.out.println();
        System.out.println("         Задача №4");
        short age2 = 7;
        System.out.print("Если возраст человека равен " + age2);
        if (age2 >= 2 && age2 <= 6) {
            System.out.println(", то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println(", то ему нужно ходить в школу.");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println(", то его место в университете.");
        }
        if (age2 > 24) {
            System.out.println(", то ему пора ходить на работу.");
        }

        //        Задача №5
        System.out.println();
        System.out.println("         Задача №5");
        byte ageChild = 5;
        System.out.print("Если возраст ребенка равен " + ageChild + ", то ему ");
        if (ageChild < 5) {
            System.out.println("нельзя кататься на аттракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageChild >= 14) {
            System.out.println("можно кататься без сопровождения взрослого.");
        }

        //        Задача №6
        System.out.println();
        System.out.println("         Задача №6");
        byte capacityOfTheCarriage = 102;
        byte seating = 60;
        short numberOfPeople = 30;
        if (numberOfPeople < seating) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            if (numberOfPeople >= seating && numberOfPeople < capacityOfTheCarriage) {
                System.out.println("В вагоне остались только стоячие места.");
            } else {
                System.out.println("В вагоне нет мест.");
            }
        }

        //        Задача №7
        System.out.println();
        System.out.println("         Задача №7");
        int one = 11;
        int two = 8;
        int three = 4;
        boolean oneBig = one > two && one > three;
        boolean twoBig = two > one && two > three;
        System.out.print("Больше всех число ");
        if (oneBig) {
            System.out.println("one = " + one);
        } else {
            if (twoBig) {
                System.out.println("two = " + two);
            } else {
                System.out.println("three = " + three);
            }
        }


    }
}