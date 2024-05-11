public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Масса двух бойцов = " + summaryWeight);

        var discrepancyWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в массе двух бойцов = " + discrepancyWeight);

        System.out.println("Task 7");
        var restOf = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления масс  двух бойцов = " + restOf);

        System.out.println("Task 8");
        var allTimeAmount = 640;
        var oneWorkerTimeAmount = 8;

        var oldWorkersAmount = allTimeAmount / oneWorkerTimeAmount;
        System.out.println("«Всего работников в компании — " + oldWorkersAmount + " человек»");

        var newWorkerAmount = oldWorkersAmount + 94;
        var newOneWorkerTimeAmount = allTimeAmount / newWorkerAmount;
        System.out.println("«Если в компании работает " + newWorkerAmount + " человек, то всего " + newOneWorkerTimeAmount + " часа работы может быть поделено между сотрудниками»");
    }
}