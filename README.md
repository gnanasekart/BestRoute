# BestRoute Services
 
Welcome to the BestRoute Approach for a Food Delivery Boy. Here we come up with some technics using Dijkstra Shortest Path Finder.

The Purpose of this project is build based on Finding the shortest path for an delivery person to reach the destination or customer location, in between need to collect the order from Restaurant. 

Here the project is design to implement the following items like
1. Readability - The application is build to read the data from an standard input format using some readability and re-usability in real time practice. So Implemented the POJO class to validate the Input/Output by Serialization and Deserialization.
2. Encapsulation - Here the instance variables is marked as private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class. For this purpose we used Lombok Library.
3. Extensibility - Implementation of one class can be reused in another place, like we have some Util file which can be reused to calculate the Distance between two Radius.
4. Modularity - Represent the Project in different module level for easy processing.

<h3>**Purpose of BestRoute and the Approach we try to implement**</h3>

- Here We need to build a standard solution using existing approach/algorithm available in the market.
- We Assume the Input data can be JSON Object (also can be any type). 
- We Utilize the haversine distance calculating method to find the distance between location using Latitude and Longitude. 
- Applied the Dijkstra Shortest path finding Algorithm by analysing the Distance in Km between two place and identifying the Min value to travel towards that place.


<h3>Improvement factors</h3>
- We utilize the Data by assuming the Food Preparation time as a constant one. If in case it might be extend to any duration it based upon the type, count and items chosen by customer.


<h3> We come up with some Scenarios in different perspective </h3>

- The Delivery person can deliver the Food based up on the Restaurant in different location distance - we find the minimum distance to get the food and delivery to respective customer.
- Assume the Booking customer may be in the same society apartment or same locality nearby means, Batching the order.
- The Delivery Executive will get the no of order from the same Restaurant or nearby Restaurant in same area But the delivery in same location and direction.
- The Delivery Executive will get the no of order from the same Restaurant or nearby Restaurant in same area But the delivery in same location and direction.
- 