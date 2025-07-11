# REST API Quản Lý Sản Phẩm bằng Spring Boot

Đây là một project nhỏ mình thực hiện để **làm quen với REST API** trong Spring Boot. Mục tiêu chính là hiểu cách tạo một ứng dụng backend có thể thực hiện các chức năng **thêm, sửa, xoá, hiển thị sản phẩm** (CRUD) và kết nối với **CSDL MySQL**.

---

## Các chức năng chính

| Chức năng        | Mô tả                           | Phương thức | URL                         |
|------------------|---------------------------------|-------------|------------------------------|
|    Xem danh sách | Lấy toàn bộ sản phẩm            | `GET`      | `/api/products`             |
|    Xem chi tiết  | Lấy thông tin 1 sản phẩm theo ID| `GET`      | `/api/products/{id}`        |
|    Thêm mới      | Thêm sản phẩm mới               | `POST`     | `/api/products`             |
|    Cập nhật      | Sửa thông tin sản phẩm theo ID  | `PUT`      | `/api/products/{id}`        |
|    Xoá           | Xoá sản phẩm theo ID            | `DELETE`   | `/api/products/{id}`        |

---

## Cấu trúc project

- `entity/Product.java`: class đại diện cho bảng `product` trong MySQL.
- `repository/ProductRepository.java`: kế thừa `JpaRepository`, dùng để thao tác với DB.
- `service/ProductService.java`: chứa logic xử lý chính.
- `controller/ProductController.java`: định nghĩa các API.

---

## Cấu hình database

File: `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quanlysanphamrestapi
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8083
