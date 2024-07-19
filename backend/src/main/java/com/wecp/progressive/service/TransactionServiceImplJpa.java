// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.repository.TransactionRepository;

// @Service
// public class TransactionServiceImplJpa implements TransactionService{

//     @Autowired
//     private TransactionRepository transactionRepository;

//     @Override
//     public List<Transactions> getAllTransactions() throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getAllTransactions'");
//         return transactionRepository.findAll();
//     }

//     @Override
//     public Transactions getTransactionById(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
//         return transactionRepository.findById(transactionId).get();
//     }

//     @Override
//     public int addTransaction(Transactions transaction) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
//         transactionRepository.save(transaction);
//         return transaction.getAccountId();
//     }

//     @Override
//     public void updateTransaction(Transactions transaction) throws SQLException {
//         // TODO Auto-generated method stub
//         //throw new UnsupportedOperationException("Unimplemented method 'updateTransaction'");
//         Transactions t=transactionRepository.findById(transaction.getAccountId()).orElse(null);
//         if(t!=null){
//             t.setAccount(transaction.getAccount());
//             t.setAmount(transaction.getAmount());
//             t.setTransaction_date(transaction.getTransaction_date());
//             t.setTransaction_type(transaction.getTransaction_type());
//             transactionRepository.save(t);
//         }
//     }

//     @Override
//     public void deleteTransaction(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
//         Transactions t=transactionRepository.findById(transactionId).get();
//         if(t!=null){
//             transactionRepository.deleteById(transactionId);
//         }
//     }

//     @Override
//     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
//         return transactionRepository.getTransactionsByCustomerId(customerId);
//     }



    

// }
