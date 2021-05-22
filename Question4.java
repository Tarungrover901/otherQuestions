package Question4;

public class Question4 {

	public static void main(String[] args) {
		// Database Queries
		
		a) SELECT Orders.OrderID, Customers.CustomerName FROM Orders, Customers WHERE Orders.CustomerId = Customers.CustomerId;
		
		// Not able to join resultSet of these two queries
		b) SELECT Orders.OrderID, Customers.CustomerName FROM Orders, Customers WHERE Orders.CustomerId = Customers.CustomerId
			SELECT Customers.CustomerName from Customers WHERE Customers.CustomerId NOT IN (SELECT CustomerID FROM Orders);
		// Not able to join resultSet of these two queries
		c) SELECT Employees.FirstName, Orders.CustomerID FROM Employees, Orders WHERE Orders.EmployeeID = Orders.CustomerID;		
			SELECT Orders.CustomerID from Orders WHERE Orders.EmployeeId NOT IN (SELECT EmployeeId FROM Employees);

	}

}
