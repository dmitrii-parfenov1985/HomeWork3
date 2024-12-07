public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte a = 123;
        short b = 12000;
        int c = 123000000;
        long d = 145000000000L;
        float e = 1.2f;
        double f = 1.69;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);


        System.out.println("Задача 2");
        float q = 27.12f;
        long l = 987678965549L;
        float w = 2.786f;
        short r = 569;
        short t = -159;
        short u = 27897;
        byte o = 67;
        System.out.println(q);
        System.out.println(l);
        System.out.println(w);
        System.out.println(r);
        System.out.println(t);
        System.out.println(u);
        System.out.println(o);

        System.out.println("Задача 3");
        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short totalPapersOnGroups = 480;
        int totalStudents = studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna;
        int paperOnOneStudent = totalPapersOnGroups / totalStudents;
        System.out.println("На каждого ученика расчитано " + paperOnOneStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte perfomanceBottlesPer2minutes = 16;
        int perfomanceBottlesPer1minute = perfomanceBottlesPer2minutes / 2;
        int perfomanceBottlesPer20Minutes = perfomanceBottlesPer1minute * 20;
        int perfomanceBottlesPerDay = perfomanceBottlesPer1minute * 1440;
        int perfomanceBottlesPer3days = perfomanceBottlesPerDay * 3;
        int perfomanceBottlesPerMonth = perfomanceBottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + perfomanceBottlesPer20Minutes + " бутылок");
        System.out.println("За сутки машина произвела " + perfomanceBottlesPerDay + " бутылок");
        System.out.println("За три дня машина произвела " + perfomanceBottlesPer3days + " бутылок");
        System.out.println("За месяц машина произвела " + perfomanceBottlesPerMonth + " бутылок");

        System.out.println("Задача 5");
        int totalPaints = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int paintPerOneCabinet = whitePaint + brownPaint;
        int totalCabinets = totalPaints / paintPerOneCabinet;
        int canOfPaintWhite = totalCabinets * whitePaint;
        int canOfPaintBrown = totalCabinets * brownPaint;
        System.out.println("В школе, где " + totalCabinets + " классов, нужно " + canOfPaintWhite + " банок белой краски  и " + canOfPaintBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int icecream = 100 * 2;
        int eggs = 4 * 70;
        int breakfast = bananas+milk+icecream+eggs;
        float brekfastKg = breakfast / 1000f;
        System.out.println("Вес завтрака составляет " + breakfast + " грамм");
        System.out.println("Вес завтрака составляет " + brekfastKg + " килограмм");

        System.out.println("Задача 7");
        int needWeight = 7000;
        int slowWeightLoss = needWeight / 250;
        int fastWeightLoss = needWeight / 500;
        int midleWeightLoss = (slowWeightLoss + fastWeightLoss) / 2;
        System.out.println("Если терять по 250 граммов в день, то похудеть на 7 кг можно за " + slowWeightLoss);
        System.out.println("Если терять по 500 граммов в день, то похудеть на 7 кг можно за " + fastWeightLoss);
        System.out.println("В среднем похудеть можно за " + midleWeightLoss);

        System.out.println("Задача 8");
        int salaryMasha = 67760;
        float increaseSalaryMasha10percent = (salaryMasha / 100f) * 10f;
        int salaryDenis = 83690;
        float increaseSalaryDenis10percent = (salaryDenis / 100f) * 10f;
        int salaryKristina = 76230;
        float increaseSalaryKristina10percent = (salaryKristina / 100f) * 10f;
        float newSalaryMasha = salaryMasha + increaseSalaryMasha10percent;
        float newSalaryDenis = salaryDenis + increaseSalaryDenis10percent;
        float newSalaryKristina = salaryKristina + increaseSalaryKristina10percent;
        int salaryMashaInYear = salaryMasha * 12;
        int salaryDenisInYear = salaryDenis * 12;
        int salaryKristinaInYear = salaryKristina * 12;
        float increaseSalaryMashaInYear = (salaryMashaInYear / 100f) * 10f;
        float increaseSalaryDenisInYear = (salaryDenisInYear / 100f) * 10f;
        float increaseSalaryKristinaInYear = (salaryKristinaInYear / 100f) * 10f;
        float newSalaryMashaInYear = salaryMashaInYear + increaseSalaryMashaInYear;
        float newSalaryDenisInYear = salaryDenisInYear + increaseSalaryDenisInYear;
        float newSalaryKristinaInYear = salaryKristinaInYear + increaseSalaryKristinaInYear;
        float diffSalaryMasha = newSalaryMashaInYear - salaryMashaInYear;
        float diffSalaryDenis = newSalaryDenisInYear - salaryDenisInYear;
        float diffSalaryKristina = newSalaryKristinaInYear - salaryKristinaInYear;
        System.out.println("Зарплата Маши после повышения на 10 процентов от текущей будет " + newSalaryMasha + " рублей в месяц");
        System.out.println("Зарплата Дениса после повышения на 10 процентов от текущей будет " + newSalaryDenis + " рублей в месяц");
        System.out.println("Зарплата Кристины после повышения на 10 процентов от текущей будет " + newSalaryKristina + " рублей в месяц");
        System.out.println("Годовая зараплата Маши до повышения " + salaryMashaInYear + " рублей");
        System.out.println("Годовая зараплата Дениса до повышения " + salaryDenisInYear + " рублей");
        System.out.println("Годовая зараплата Кристины до повышения " + salaryKristinaInYear + " рублей");
        System.out.println("Маша теперь получает " + newSalaryMashaInYear + " рублей в год. Годовой доход вырос на " + diffSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenisInYear + " рублей в год. Годовой доход вырос на " + diffSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristinaInYear + " рублей в год. Годовой доход вырос на " + diffSalaryKristina + " рублей");
    }
}