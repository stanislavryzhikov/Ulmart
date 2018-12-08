package ru.itpark.service;

import ru.itpark.comparator.PriceAscComparator;
import ru.itpark.comparator.ProductNameAscComparator;
import ru.itpark.domain.Product;
import ru.itpark.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }
    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getSorted(Comparator<Product> comparator) {
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<Product> findByName(String name) {

        List<Product> result = new ArrayList<Product>();

        for (Product product : repository.getAll()) {

            String productName = product.getName();
            if (productName.equals(name)) {
                result.add(product);
            }

        }
        return result;
    }
    public List<Product> findByCategory(String category) {

        List<Product> result = new ArrayList<Product>();

        for (Product product : repository.getAll()) {

            String productCategory = product.getCategory();
            if (productCategory.equals(category)) {
                result.add(product);
            }

        }

        return result;
    }
}
