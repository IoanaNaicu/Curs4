import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];

        Scanner in = new Scanner (System.in);

        int catIndex=0;
        int dogindex= 0;

        boolean stayInLoop = true;
        while (stayInLoop) {
            System.out.println("Choose an option from below ");
            System.out.println("a) Add a cat: ");
            System.out.println("b) Add a dog: ");
            System.out.println("c) List cats: ");
            System.out.println("d) List dogs: ");
            System.out.println("e) Exit ");
            while (!in.hasNext("[abcde]")) {
                System.out.println("not from list");
                in.next();
            }
            Character input = in.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println("Enter  cat's name: ");
                    String catName = in.next();
                    Cat cat1 = new Cat(catName);
                    cats[catIndex] = cat1;
                    catIndex++;
                    break;
                case 'b':
                    System.out.println("Enter  dog's name: ");
                    String dogName = in.next();
                    Dog dog1 = new Dog(dogName);
                    dogs[dogindex] = dog1;
                    dogindex++;
                    break;
                case 'c':
                    System.out.println("Avem urmatoarele pisici: ");
                    for (int i=0; i < catIndex; i++) {
                        System.out.println(cats[i]);
                    }
                    break;
                case 'd':
                    System.out.println("Avem urmatorii caini: ");
                    for (int i = 0; i < dogindex; i++) {
                        System.out.println(dogs[i]);
                    }
                    break;
                case 'e':
                    System.out.println("you opted to exit");
                    stayInLoop = false;
                    break;

            }
        }

    }
}
