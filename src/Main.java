public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();

        Griffendor griffendor1 = new Griffendor("Гарри", "Поттер", 44,35, 31,34,45);
        Griffendor griffendor2 = new Griffendor("Гермиона", "Грейнджер", 32,40,24,41,32);
        Griffendor griffendor3 = new Griffendor("Рон", "Уизлли", 40, 37,24,35,25);
        hogwarts.compare(griffendor1, griffendor2, griffendor3);


        Puffendui puffendui1 = new Puffendui("Захария", "Смит", 43,43,42,34,54);
        Puffendui puffendui2 = new Puffendui("Седрик", "Дигори", 47, 25, 34, 56, 35);
        Puffendui puffendui3 = new Puffendui("Джастин", "Финч-Флетчи", 35, 24, 27, 40, 34);
        hogwarts.compare(puffendui1, puffendui2, puffendui3);

        Kogtevran kogtevran1 = new Kogtevran("Чжоу", "Чанг", 12,32,62,50,12,14);
        Kogtevran kogtevran2 = new Kogtevran("Падма","Патил",54,74,23,41,23,64);
        Kogtevran kogtevran3 = new Kogtevran("Маркус", "Белби",48,20,52,42,31,20);
        hogwarts.compare(kogtevran1, kogtevran2, kogtevran3);

        Slizeren slizeren1 = new Slizeren("Драко", "Малфой",27,23,40,24,56,41,32);
        Slizeren slizeren2 = new Slizeren("Грэхэм", "Монтегю",21,41,23,41,20,14,12);
        Slizeren slizeren3 = new Slizeren("Грегори", "Гойл", 20, 35, 20, 14, 22, 21, 13);
        hogwarts.compare(slizeren1, slizeren2, slizeren3);

        hogwarts.compare(griffendor1, puffendui1);
    }
}