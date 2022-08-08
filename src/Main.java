
public class Main {

    @SuppressWarnings({"unused", "IntegerDivisionInFloatingPointContext", "ConstantConditions"})
    public static void main(String[] args) {

        // Задание 1
        System.out.println("\nЗадание 1");
        byte cat=2;
        short mouse=3;
        int dog=7;
        long elephant=110L;
        float a=1.5f;
        double b=4.5;
        boolean c=dog>10;
        char d=33;
        System.out.println(d);

        // Задание 2
        System.out.println("\nЗадание 2");
        double boxer1=78.2;
        double boxer2=82.7;
        double s=boxer1+boxer2;
        double r=boxer2-boxer1;
        System.out.println("Общий вес двух бойцов "+s+" кг");
        System.out.println("Разница между весами бойцов "+Math.abs(boxer1-boxer2)+" кг");

        // Задание 3
        System.out.println("\nЗадание 3");
        double bananas=5*80;
        double milk=200/100*105;
        double plombir=2*100;
        double eggs=4*70;
        double sport=bananas+milk+plombir+eggs;
        double kg=sport/1000;
        System.out.println("Вес спорт-завтрака "+kg+" кг");

        // Задание 4
        System.out.println("\nЗадание 4");
        int ration1=250;
        int ration2=500;
        int gram=7*1000;
        int middle=gram/((ration1+ration2)/2);
        System.out.println("Если спортсмен будет ежедневно терять в весе по 250 гр., то через "+gram/ration1+" дней он вернется в свою весовую категорию");
        System.out.println("Если спортсмен будет ежедневно терять в весе по 500 гр., то через "+gram/ration2+" дней он вернется в свою весовую категорию");
        System.out.println("В среднем спорцмену понадобится "+middle+" день и он вернется в свою весовую категорию");

        // Задание 5
        System.out.println("\nЗадание 5");
        int Masha=67_760;
        int Denis=83_690;
        int Kristina=76_230;
        int Masha1= (int) (Masha*1.1);
        int Denis1= (int) (Denis*1.1);
        int Kristina1= (int) (Kristina*1.1);
        int Masha2=(Masha1-Masha)*12;
        int Denis2=(Denis1-Denis)*12;
        int Kristina2=(Kristina1-Kristina)*12;
        System.out.println("Маша теперь получает "+Masha1+" рублей. Годовой доход вырос на "+Masha2+" рублей");
        System.out.println("Денис теперь получает "+Denis1+" рублей. Годовой доход вырос на "+Denis2+" рублей");
        System.out.println("Кристина теперь получает "+Kristina1+" рублей. Годовой доход вырос на "+Kristina2+" рублей");
    }
}