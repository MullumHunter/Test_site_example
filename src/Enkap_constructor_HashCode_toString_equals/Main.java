package Enkap_constructor_HashCode_toString_equals;

public class Main {
    public static void main(String[] args) {

//        Goose goose = new Goose("Grey", "Koko", "Tolk", 93);
        BabyGoose babyGoose = new BabyGoose("White", "Cicic", "Fight", 23);
        BabyGoose2 babyGoose2 = new BabyGoose2("Yellow", "Pipip", "Tolk", 67);
        Penguin penguin = new Penguin("black-white", "Karl", "Swimming", 100);
        BabyPenguin babyPenguin = new BabyPenguin("black-white", "Liza", "Swimming", 67);
        BabyPenguin babyPenguin2 = new BabyPenguin("black-white", "Liza", "Swimming", 67);


        Goose goose1 = new Goose("Pink", "Pinki", "Dance", 100);
        Goose goose4 = new Goose("Blue", "Pinki", "Dance", 67);
        Goose goose2 = new Goose("Blue", "Blui", "Dance", 67);
        Goose goose3 = new Goose("Green", "Greeni", "Dance", 50);

        Capybara capybara = new Capybara("Bim");
        Capybara capybara2 = new Capybara("Bim");


        System.out.println(capybara.getName() + " " + capybara2.hashCode() + " " + capybara.equals(capybara2));
        System.out.println(capybara.getName() + " " + capybara.hashCode() + " " + capybara.equals(capybara2));
        System.out.println(capybara.hashCode()+ " "+ capybara2.hashCode());
        System.out.println(capybara.hashCode() == capybara2.hashCode());

//        System.out.println(goose4.hashCode()+" "+goose1.hashCode());
//        System.out.println(goose1.equals(goose2));
//        System.out.println(babyPenguin.equals(babyPenguin2));
//        System.out.println(goose1.hashCode()==babyPenguin2.hashCode());

        System.out.println(penguin.getName() + " " + penguin.getColour() + " " + penguin.getSkill() + " " + penguin.getHeight());


//        System.out.print(" " + goose.hashCode());
//        System.out.print(" " + goose.toString());
//
//
//        System.out.print(" " + goose.getColour());
//        System.out.print(" " + goose.getHeight());
//        System.out.print(" " + goose.getSkill());
//        System.out.print(" " + goose.getName());
//        System.out.println();
//        System.out.println();
//
//
//        System.out.print(" " + babyGoose.hashCode());
//        System.out.print(" " + babyGoose.toString());
//
//        System.out.print(" " + babyGoose.getColour());
//        System.out.print(" " + babyGoose.getHeight());
//        System.out.print(" " + babyGoose.getSkill());
//        System.out.print(" " + babyGoose.getName());
//        System.out.println();
//        System.out.println();
//
//
//        System.out.print(" " + babyGoose2.hashCode());
//        System.out.print(" " + babyGoose2.toString());
//
//        System.out.print(" " + babyGoose2.getColour());
//        System.out.print(" " + babyGoose2.getHeight());
//        System.out.print(" " + babyGoose2.getSkill());
//        System.out.println(" " + babyGoose2.getName());
//
//        System.out.println(" " + babyGoose2.equals(goose));
//        System.out.println(" " + goose.equals(babyGoose));
//        System.out.println(" " + babyGoose.equals(babyGoose2));
//
//        System.out.println(" " + goose.getSkill());
//        System.out.println(" " + babyGoose.getSkill());
//        System.out.println(" " + babyGoose2.getSkill());


//        Encapsulation en = new Encapsulation("Shell", 4);
//        miniCapsulation miniEn = new miniCapsulation("Baby shell", 5, 5);
//
//        System.out.println(miniEn.getSize());
//        System.out.println(miniEn.getQuantity());
//        System.out.println(miniEn.getTitle());
//        System.out.println(miniEn.toString());
//        System.out.println(miniEn.hashCode());
//
//        System.out.println();
//
//        System.out.println(en.getQuantity());
//        System.out.println(en.getTitle());
//        System.out.println(en.toString());
//        System.out.println(en.hashCode());

    }
}
