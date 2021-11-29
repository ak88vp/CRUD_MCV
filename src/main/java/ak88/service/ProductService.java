package ak88.service;

import ak88.model.Product;

import java.util.List;

public interface ProductService {

    //    Hiển thị danh sách sản phẩm
    List<Product> printAll();
//    Tạo sản phẩm mới
 void add(Product product);
//    Cập nhật thông tin sản phẩm
    void update(int id,Product product);
//    Xoá một sản phẩm
    void delete(int id);
//    Xem chi tiết một sản phẩm

//    Tìm kiếm sản phẩm theo tên
    Product findName(String name);
    int findID(int id);
}
