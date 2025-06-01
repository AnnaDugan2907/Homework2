//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Объявление переменных (Задача 1)
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog " + dog + ", " + "Cat " + cat + ", " + "Paper " + paper);

        //Увелеченние переменных на 4 (Задача 2)
        var plusDog = dog + 4;
        var plusCat = cat + 4;
        var plusPaper = paper + 4;

        System.out.println("Dog " + plusDog + ", " + "Cat " + plusCat + ", " + "Paper " + plusPaper);

        //Уменьшение переменных на заданное значение (Задача 3)
        var minusDog = dog - 3.5;
        var minusCat = cat - 1.6;
        var minusPaper = paper - 7639;

        System.out.println("Dog " + minusDog + ", " + "Cat " + minusCat + ", " + "Paper " + minusPaper);

        //Задача 4
        var friend = 19;

        var plusFriend = friend + 2;
        var delFriend = plusFriend / 7;

        System.out.println(friend + " " + plusFriend + " " + delFriend);

        //Задача 5
        var frog = 3.5;

        var mulFrog = frog * 10;
        var delFrog = mulFrog / 3.5;
        var plusFrog = delFrog + 4;

        System.out.println(frog + " " + mulFrog + " " + delFrog + " " + plusFrog);

        // Задача 6
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;

        var sumBoxer = oneBoxer + twoBoxer;
        var difBoxer = twoBoxer - oneBoxer;

        System.out.println("Общая масса бойцев " + sumBoxer);
        System.out.println("Разница бойцов " + difBoxer);

        // Остаток деления (Задача 7)
        var delBoxer = twoBoxer % oneBoxer;

        System.out.println(delBoxer);

        // Задача 8.1
        var time = 640;
        var oneTime = 8;

        var employee = time / oneTime;

        System.out.println("Всего работников в компании - " + employee + " человек");

        // Задача 8.2
        var allEmployee = employee + 94;
        var allTime = allEmployee * oneTime;

        System.out.println("Если в компании работает " + allEmployee + " человек, то всего " + allTime + " часов работ может быть поделено между сотрудниками");

    }
}