# Nimap_task_Machine_Code
Nimap_task_Machine_Code

Name :- Bhosle Abhishek Wamanrao

1. Dependency Injection
Dependency injection (DI) is a design pattern used to implement IoC (Inversion of Control), where the control of object creation is transferred to the container. In a Spring Boot application, DI helps in wiring beans together to provide their dependencies automatically.

For example, if you have a CategoryService and a ProductService, DI ensures that these services are injected into their respective controllers automatically.

2. Creating POJO Classes (Entities)
The first step is to create the Category and Product classes in the entity package. These classes will represent the database tables, and each class will have its properties annotated with JPA annotations (@Entity, @Id, @GeneratedValue, etc.).

3. Service Layer
Next, you create services that interact with the database via repositories. These services will handle business logic like insertion, update, deletion, and retrieval of records.

4. Repository Layer
The CategoryRepository and ProductRepository interfaces extend JpaRepository and provide built-in methods for database operations.

5. Controller Layer
The controllers handle HTTP requests and respond accordingly. They will call the service methods to perform CRUD operations.

The controller receives the HTTP request, processes it through the service layer, and returns a response.

6. Handling Dependency Between Category and Product
The Product class has a ManyToOne relationship with Category, which signifies that multiple products can belong to a single category. By managing these relationships in your service and repository, you ensure that data is appropriately handled.

