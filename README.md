Создать систему управления складом(SOLID)

a)  Product должен хранит информацию о товаре, такую как название, количество,
цена и тд. (decreaseQuantity(int amount) , increaseQuantity(int amount))

b)  Warehouse должен управлять запасами товаров на складе, обеспечивает их
хранение и выдачу.(добавление/удаление продукта, увеличение/уменьшение
количества продукта)

c)  Order должен отвечать за обработку заказов на товары со склада.
(processOrder(Product product, int amount)- обработка заказа)


(SOLID)

1. Принцип единственной ответственности (Single Responsibility Principle):

Создать класс Warehouse, который будет отвечать за управление складом. В нем должны быть методы для добавления товаров на склад, удаления товаров со склада, поиска товаров по артикулу увеличение/уменьшениеколичества продукта.

2. Принцип открытости/закрытости (Open/Closed Principle):

Создан интерфейс Product, который будет представлять товар на складе. В интерфейсе должны быть объявлены методы для получения артикула товара, его названия, количества, Стоимость.
Созданы классы, реализующие интерфейс Product, для конкретных типов товаров (например, классы FoodProduct, ElectronicsProduct). В этих классах реализованы все необходимые методы из интерфейса Product.
В классе Warehouse использован интерфейс Product для работы с товарами на складе. Таким образом, класс Warehouse будет открыт для добавления новых типов товаров на склад, но закрыт для изменения уже существующего кода.

3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle):

В коде класса Warehouse использован интерфейс Product вместо конкретных реализаций товаров. Это позволит подставлять вместо объектов классов FoodProduct, ElectronicsProduct и т.д. любой другой объект, реализующий интерфейс Product, без нарушения работы системы.

4. Принцип разделения интерфейсов (Interface Segregation Principle):

Если в системе управления складом будет несколько разных видов пользователей с разными функциональными возможностями, то можно создать отдельные интерфейсы для работы с товарами на складе для каждого вида пользователей. 

Например, для складов, доступных только для чтения, можно создать интерфейс ReadableProduct, содержащий только методы для чтения информации о товаре (например, методы getArticle(), getName() и т.д.). 

Для складов, доступных для изменения товаров, можно создать интерфейс WritableProduct, содержащий методы для изменения информации о товаре (например, методы setQuantity(), setPrice() и т.д.). 

Классы, реализующие интерфейсы ReadableProduct и WritableProduct, могут использовать наследование от соответствующих интерфейсов и добавлять свои собственные методы, если это необходимо.

5. Принцип инверсии зависимостей (Dependency Inversion Principle):

В классе Warehouse использованы абстракции(интерфейсы) вместо конкретных реализаций (классы) для работы с товарами на складе. Например, вместо создания экземпляров классов FoodProduct или ElectronicsProduct, можно использовать интерфейс Product для работы с товарами на складе. Это позволит сделать систему более гибкой, так как можно будет легко заменить конкретные реализации товаров на складе без изменения кода класса Warehouse.