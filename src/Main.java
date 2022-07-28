
public class Main {

    @SuppressWarnings({"unused", "IntegerDivisionInFloatingPointContext", "ConstantConditions"})
    public static void main(String[] args) {

        // Задание 1
        byte cat=1;
        short mouse=3;
        int dog=7;
        long elephant=110L;
        float a=1.5f;
        double b=4.5;
        boolean c=dog>10;
        char d=33;

        // Задание 2
        double boxer1=78.2;
        double boxer2=82.7;
        double s=boxer1+boxer2;
        double r=boxer2-boxer1;
        System.out.println("Общий вес двух бойцов "+s+" кг");
        System.out.println("Разница между весами бойцов "+r+" кг");

        // Задание 3
        double banan=5*80;
        double milk=200/100*105;
        double plombir=2*100;
        double eggs=4+70;
        double sport=banan+milk+plombir+eggs;
        double kg=sport/1000;
        System.out.println("Вес спорт-завтрака "+kg+" грамм");

        // Задание 4
        int racion1=7*1000/250;
        int racion2=7*1000/500;
        int seredina=(racion1+racion2)/2;
        System.out.println("Если спортсмен будет ежедневно терять в весе по 250 гр., то через "+racion1+" дней он вернется в свою весовую категорию");
        System.out.println("Если спортсмен будет ежедневно терять в весе по 500 гр., то через "+racion2+" дней он вернется в свою весовую категорию");
        System.out.println("В среднем спорцмену понадобится "+seredina+" день и он вернется в свою весовую категорию");

        // Задание 5
        int Masha=67760;
        int Denis=83690;
        int Kristina=76230;
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