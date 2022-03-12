package users;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Total Users: ");
            int total = Integer.parseInt(scanner.nextLine());
            if (total > 1) {
                //define users array
                User[] users = new User[total];
                //initialization the array
                for (int i = 0; i < users.length; i++) {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter family: ");
                    String family = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    User user = new User(name, family, age);
                    users[i] = user;
                }
                //find duplicate user
                for (int i = 0; i < users.length; i++) {
                    for (int j = users.length - 1; j > i; j--) {
                        if (users[i].getName().equals(users[j].getName())) {
                            if (users[i].getFamily().equals(users[j].getFamily())) {
                                if (users[i].getAge() == users[j].getAge()) {
                                    throw new UsersException(users[i].getName() + " " + users[i].getFamily() + " Duplicate User!");
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("You Should Enter Number Bigger than 1!");
            }
        } catch (NumberFormatException | UsersException e) {
            System.out.println(e.getMessage());
        }
    }

}
