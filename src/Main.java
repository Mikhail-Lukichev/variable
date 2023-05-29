public class Main {
    public static void main(String[] args) {
        System.out.println("Kindly check below. Thank you!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog +4;
        cat = cat +4;
        paper = paper +4;

        dog = dog -3.5;
        cat  = cat -1.6;
        paper = paper -7636;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend *2;
        System.out.println(friend);

        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        var boxerWeightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Масса первого боксера " + firstBoxerWeight + "кг. Масса второго боксера "+ secondBoxerWeight +"кг. Масса двух боксеров " + totalBoxersWeight +"кг. Разница в массе боксеров " + boxerWeightDifference +"кг.");
        boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Масса первого боксера " + firstBoxerWeight + "кг. Масса второго боксера "+ secondBoxerWeight +"кг. Масса двух боксеров " + totalBoxersWeight +"кг. Разница в массе боксеров " + boxerWeightDifference +"кг.");

        var totalWorkHours = 640;
        var workdayDuration = 8;
        var employeeCount = totalWorkHours / workdayDuration;
        System.out.println("Всего в компании " + employeeCount + " работников.");

        employeeCount = employeeCount +94;
        totalWorkHours = employeeCount * workdayDuration;
        System.out.println("Если в компании работает " + employeeCount + " человек, то всего " + totalWorkHours +" часов работы может быть поделено между сотрудниками.");


    }
}