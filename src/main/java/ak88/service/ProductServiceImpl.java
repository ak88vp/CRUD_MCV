package ak88.service;

import ak88.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> productMap;
    static {
        productMap=new HashMap<>();
        productMap.put(1,new Product(1,"Tivi",100,"good","ak88"));
        productMap.put(2,new Product(2,"Tu Lanh",50,"good","AK"));
        productMap.put(3,new Product(3,"Noi Com",112,"fail","ak11"));
        productMap.put(4,new Product(4,"May Bom",243,"fail","JAVA"));
        productMap.put(5,new Product(5,"Iphone",369,"Good","NTD"));
    }
    @Override
    public List<Product> printAll() {
        return new ArrayList<>(productMap.values());
    }
    @Override
    public void add(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);

    }

    @Override
    public Product findName(String name) {

        return null;
    }

    @Override
    public int findID(int id) {
        return  productMap.get(id).getId();
    }
}
