package ru.itpark;

import ru.itpark.comparator.PriceAscComparator;
import ru.itpark.domain.Phone;
import ru.itpark.domain.Product;
import ru.itpark.domain.Shirt;
import ru.itpark.domain.TV;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Добавление (один метод для добавления любого товара)
        ProductService service = new ProductService(new ProductRepository());
        service.add(new Phone(100_000,"iPhone","Phone", "+793032012"));
        service.add(new Phone(55_000,"Samsung","Phone", "+793032011"));
        service.add(new TV(19_990, "Samsung","TV", 40));
        service.add(new TV(29_990, "Sony","TV", 25));
        service.add(new Shirt(1_990,"Nike", "Shirt","M", "Red"));
        service.add(new Shirt(2_990,"Ostin","Shirt", "L", "Black"));

        //Поиск по названию – возвращается список всех найденных (из всех категорий,
        //отсортированный по названию)
        System.out.println("Поиск по названию: "+service.findByName("Samsung"));
        //Просмотр по категории – возвращается список товаров из категории (отсортированный по
        //названию)
        List<Product> shirt = service.findByCategory("Shirt");
        System.out.println("Поиск по категории: "+shirt);

        //Сортировка товаров (по возрастанию цены)
        System.out.println("Сортировка по возрастанию цены: "+service.getSorted(new PriceAscComparator()));
    }

}
