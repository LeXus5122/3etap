// Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, определяющих базовый функционал класса(за основу можно взять наработки с семинара). Создать два экземпляра класса Cat и вывести информацию о них на экран.
public class z61 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кузя", 2, 'm', 4.5);
        Cat cat2 = new Cat("Ева", 8, 'f', 5.2);

        cat1.drink();
        System.out.println(cat2.speak());
        cat1.aboutCat();
        cat2.aboutCat();
    }
}
