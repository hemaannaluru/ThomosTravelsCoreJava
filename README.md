# ThomosTravelsCoreJava

This project is designed to automate the management of driver data for Thomas Travels, a travel services company. The core of the project is a Java-based system that encompasses several classes and methods to handle various operations related to drivers.

Here's an overview of the components:

Driver Class: This is a data model class that represents a driver within the Thomas Travels system. Each driver has an ID, name, category (which can be Auto, Car, or Lorry), and a record of the total distance they have traveled.

Travel Class: This class contains methods to manipulate and retrieve information about drivers:

isCarDriver(Driver): Checks if a driver is in the "Car" category.
RetrieveByDriverId(ArrayList<Driver>, driverID): Searches for a driver by their ID and returns a formatted string with their details.
RetrieveCountOfDriver(ArrayList<Driver>, String): Counts how many drivers belong to a specific category.
RetrieveDriver(ArrayList<Driver>, String): Retrieves a list of drivers who belong to a specified category.
RetrieveMaximumDistanceTravelledDriver(ArrayList<Driver>): Finds the driver who has traveled the maximum distance.
Tester Class: This would be the executable class that demonstrates the functionalities of the Driver and Travel classes. It could contain a main method that creates instances of Driver, adds them to an ArrayList<Driver>, and then calls the various methods in the Travel class to perform operations and display results.

The purpose of the project is to streamline the process of managing driver data, making it easy to keep track of their categories, distances traveled, and other relevant information. By automating these processes, Thomas Travels can enhance operational efficiency and provide better service to its customers. T
