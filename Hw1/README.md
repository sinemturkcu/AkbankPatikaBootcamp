# HOMEWORK CONTENT
* Create 3 house types as House, Villa, Resort. Create at least 3
* House, Villa and Summer objects in a class and write the methods that return these examples to you. 
* Write the following methods in a service class:
  * A method to return the total prices of houses
  * A method to return the total prices of villas
  * A method to return the total prices of resorts
  * A method to return the total prices of all types of houses
  * A method to return the average square meters of houses
  * A method to return the average square meters of villas
  * A method to return the average square meters of all types of houses
  * A method to return the average square meters of all types of houses filter
  * A method to return all types of houses according to the number of rooms and halls method

# My Solution Details
I used *factory design pattern* in Java for creating different types of houses, namely Home, Villa, and Resort. The HouseFactory interface serves as the abstract factory, with concrete factory classes such as HomeFactoryImpl, VillaFactoryImpl, and ResortFactoryImpl responsible for creating instances of the respective house types.

The Home, Villa, and Resort classes implement the House interface, defining common methods such as getPrice() and getSquareMeters(). These classes encapsulate specific details and characteristics of each house type, allowing for easy extensibility and flexibility in adding new house types.

The HouseService class acts as a service class, providing various methods to interact with houses. It allows adding houses to a list, retrieving the house list, calculating total prices, average square meters, and filtering houses based on the number of rooms and living rooms. The service class uses the Factory design pattern to create instances of houses, ensuring separation of concerns and enabling easy addition of new house types.

By utilizing the Factory design pattern, the code adheres to good software engineering principles, such as modularity, encapsulation, and extensibility. The Factory pattern allows for centralized creation of objects, reducing code duplication and promoting code reusability. Overall, the code design follows clean code principles, making it more maintainable and scalable for future enhancements.

# Output of code
![image](https://github.com/sinemturkcu/AkbankPatikaBootcamp/assets/42895382/d95215ef-935c-4d9f-99da-bd0fd39ea652)
