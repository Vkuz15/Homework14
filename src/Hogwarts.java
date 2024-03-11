public class Hogwarts {

    public void compare(Griffendor student1, Griffendor student2, Griffendor student3) {
       int resultStudent1 = student1.getBravery() + student1.getNobility() + student1.getPowerOfMagic() + student1.getHonor() + student1.getTrangressive();
       int resultStudent2 = student2.getBravery() + student2.getNobility() + student2.getPowerOfMagic() + student2.getHonor() + student2.getTrangressive();
       int resultStudent3 = student3.getBravery() + student3.getNobility() + student3.getPowerOfMagic() + student3.getHonor() + student3.getTrangressive();
       if (resultStudent1 > resultStudent2 && resultStudent1 > resultStudent3) {
            System.out.println("Гарри Поттер лучший Гриффендорец, чем Гермиона Грейнджер и Рон Уизлли");
       } if (resultStudent2 > resultStudent1 && resultStudent2 > resultStudent3) {
            System.out.println("Гермиона Грейнджер лучший Гриффендорец, чем Гарри Поттер и Рон Уизлли");
       } if (resultStudent3 > resultStudent1 && resultStudent3 > resultStudent2) {
            System.out.println("Рон Уизлли лучший Гриффендорец, чем Гарри Поттер и Гермиона Грейнджер");
       }
    }
    public void compare(Puffendui student1, Puffendui student2, Puffendui student3) {
        int resultStudent1 = student1.getHardWork() + student1.getHonesty() + student1.getLoyalty() + student1.getPowerOfMagic() + student1.getTrangressive() + student1.hashCode();
        int resultStudent2 = student2.getHardWork() + student2.getHonesty() + student2.getLoyalty() + student2.getPowerOfMagic() + student2.getTrangressive() + student2.hashCode();
        int resultStudent3 = student3.getHardWork() + student3.getHonesty() + student3.getLoyalty() + student3.getPowerOfMagic() + student3.getTrangressive() + student3.hashCode();
        if (resultStudent1 > resultStudent2 && resultStudent1 > resultStudent3) {
            System.out.println("Захария Смит лучший Пуффендуец, чем Седрик Диггори и Джастин Финч-Флетчли");
        } if (resultStudent2 > resultStudent1 && resultStudent2 > resultStudent3) {
            System.out.println("Седрик Диггори лучший Пуффендуец, чем Захария Смит и Джастин Финч-Флетчли");
        } if (resultStudent3 > resultStudent1 && resultStudent3 > resultStudent2) {
            System.out.println("Джастин Финч-Флетчли лучший Пуффендуец, чем Захария Смит и Седрик Диггори");
        }
    }
    public void compare(Kogtevran student1, Kogtevran student2, Kogtevran student3) {
        int resultStudent1 = student1.getCreativity() + student1.getSmart() + student1.getWisdom() + student1.getWit() + student1.hashCode() + student1.getPowerOfMagic() + student1.getTrangressive();
        int resultStudent2 = student2.getCreativity() + student2.getSmart() + student2.getWisdom() + student2.getWit() + student2.hashCode() + student2.getPowerOfMagic() + student2.getTrangressive();
        int resultStudent3 = student3.getCreativity() + student3.getSmart() + student3.getWisdom() + student3.getWit() + student3.hashCode() + student3.getPowerOfMagic() + student3.getTrangressive();
        if (resultStudent1 > resultStudent2 && resultStudent1 > resultStudent3) {
            System.out.println("Чжоу Чанг лучший Когтевранец, чем Падма Патил и Маркус Белби");
        } if (resultStudent2 > resultStudent1 && resultStudent2 > resultStudent3) {
            System.out.println("Падма Патил лучший Когтевранец, чем Чжоу Чанг и Маркус Белби");
        } if (resultStudent3 > resultStudent1 && resultStudent3 > resultStudent2) {
            System.out.println("Маркус Белби лучший Когтевранец, чем Чжоу Чанг и Падма Патил");
        }
    }
    public void compare(Slizeren student1, Slizeren student2, Slizeren student3) {
        int resultStudent1 = student1.getAmbition() + student1.getCunning() + student1.getDetermination() + student1.getPowerOfMagic() + student1.getTrangressive() + student1.getResourcefulness() + student1.hashCode();
        int resultStudent2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getPowerOfMagic() + student2.getTrangressive() + student2.getResourcefulness() + student2.hashCode();
        int resultStudent3 = student3.getAmbition() + student3.getCunning() + student3.getDetermination() + student3.getPowerOfMagic() + student3.getTrangressive() + student3.getResourcefulness() + student3.hashCode();
        if (resultStudent1 > resultStudent2 && resultStudent1 > resultStudent3) {
            System.out.println("Драко Малфой лучший ученик Слизерена, чем Грэхэм Монтегю и Грегори Гойл");
        } if (resultStudent2 > resultStudent1 && resultStudent2 > resultStudent3) {
            System.out.println("Грэхэм Монтегю лучший ученик Слизерена, чем Драко Малфой и Грегори Гойл");
        } if (resultStudent3 > resultStudent1 && resultStudent3 > resultStudent2) {
            System.out.println("Грегори Гойл лучший ученик Слизерена, чем Драко Малфой и Грэхэм Монтегю");
        }
    }
}
