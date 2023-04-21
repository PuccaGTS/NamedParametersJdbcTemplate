SELECT order.productName
FROM Order order, Customer customer
WHERE customer.id = order.customer.id and Lower(customer.name) like :name