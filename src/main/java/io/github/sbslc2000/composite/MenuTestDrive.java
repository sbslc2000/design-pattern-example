package io.github.sbslc2000.composite;

public class MenuTestDrive {

    public static void main(String[] args) {
        // mid-level menu
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");

        // adding mid-lvel Menus to root-level Menu
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //adding bottom-level Menu to mid-level menu
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");
        dinerMenu.add(dessertMenu);

        //adding MenuItems to Menus
        pancakeHouseMenu.add(new MenuItem("K&B's pancake breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 4.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 3.99));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake", true, 1.99));
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
