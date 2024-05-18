public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");

        int tempCelsius = 6;
        if (tempCelsius >= 5) {
            System.out.println("На улице " + tempCelsius + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + tempCelsius + " градусов, нужно надеть шапку");
        }

        System.out.println("Task 3");

        int currSpeed = 60;
        if (currSpeed > 60) {
            System.out.println("Если скорость " + currSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + currSpeed + ", то можно ездить спокойно");
        }

        System.out.println("Task 4");

        int ageHuman = 23;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        System.out.println("Task 5");

        int ageChild = 7;
        if (ageChild <= 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild > 5 && ageChild< 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Task 6");

        int amountOfPeople = 34;
        int carriageCapacity = 102;
        int amountOfSeats = 60;
        boolean isSeatPlaceLeft = amountOfPeople < amountOfSeats;
        boolean isStandingPlaceLeft = isSeatPlaceLeft || (carriageCapacity > amountOfPeople);
        if (isSeatPlaceLeft) {
            System.out.println("В вагоне остались сидячие места");
        } else if (isStandingPlaceLeft) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }

        System.out.println("Task 7");

        int one = 3;
        int two = 7;
        int three = 1;

        if (one > two && one > three) {
            System.out.println("Первое число большее");
        } else if (two > one & two > three) {
            System.out.println("Второе число большее");
        } else if (three > one && three > two) {
            System.out.println("Третье число большее");
        }
    }
}
