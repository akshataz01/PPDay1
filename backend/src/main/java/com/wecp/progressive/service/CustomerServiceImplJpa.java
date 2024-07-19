// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.repository.CustomerRepository;

// @Service
// public class CustomerServiceImplJpa implements CustomerService {

//     @Autowired
//     private CustomerRepository customerRepository;

//     @Override
//     public List<Customers> getAllCustomers(){
//         // TODO Auto-generated method stub
//         return customerRepository.findAll();
//     //     throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
//     }

//     @Override
//     public Customers getCustomerById(int customerId)  {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
//         return customerRepository.findById(customerId).orElse(null);
//     }

//     @Override
//     public int addCustomer(Customers customers) {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
//         customerRepository.save(customers);
//         return customers.getCustomerId();
//     }

//     @Override
//     public void updateCustomer(Customers customers)  {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
//         Customers c=customerRepository.findById(customers.getCustomerId()).orElse(null);
//         if(c!=null){
//             c.setName(customers.getName());
//             c.setEmail(customers.getEmail());
//             c.setUsername(customers.getUsername());
//             c.setPassword(customers.getPassword());
//             c.setRole(customers.getRole());
//             c.setAccounts(customers.getAccounts());
//             customerRepository.save(c);
//         }
        
//     }

//     @Override
//     public void deleteCustomer(int customerId)  {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
//         Customers c=customerRepository.findById(customerId).orElse(null);
//         if(c!=null){
//             customerRepository.deleteById(customerId);
//         }
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByName(){
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
//         return null;
//     }

//     @Override
//     public List<Customers> getAllCustomersFromArrayList() {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
//         return null;
//     }

//     @Override
//     public List<Customers> addCustomersToArrayList(Customers customers) {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
//         return null;
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
//         return null;
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
        
//     }
    

    
    
// }