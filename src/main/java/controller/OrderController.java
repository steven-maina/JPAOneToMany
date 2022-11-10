package controller;

import dto.OrderRequest;
import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.CustomerRepository;
import repository.ProductRepository;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
     @Autowired
     private ProductRepository productRepository;
    @PostMapping("/placeOrder")
     public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/allOrders")
    public List<Customer>findAllOrders(){
        return customerRepository.findAll();
    }

}
