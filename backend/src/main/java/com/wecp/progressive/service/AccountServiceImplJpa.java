// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.repository.AccountRepository;

// public class AccountServiceImplJpa implements AccountService {

//     @Autowired
//     private AccountRepository accountRepository;

//     @Override
//     public List<Accounts> getAllAccounts() throws SQLException {
//         // TODO Auto-generated method stub
//         //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
//         return accountRepository.findAll();

//     }

//     @Override
//     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
//         // TODO Auto-generated method stub
//        // throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
//        Accounts acc=accountRepository.findById(userId).get();
//        if(acc!=null){
//         return accountRepository.getAccountsByUserId(userId);
//        }
//        return null;

//     }

//     @Override
//     public Accounts getAccountById(int accountId) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
//         return accountRepository.findById(accountId).get();
//     }

//     @Override
//     public int addAccount(Accounts accounts) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
//         accountRepository.save(accounts);
//         return accounts.getAccountId();
//     }

//     @Override
//     public void updateAccount(Accounts accounts) throws SQLException {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
//         Accounts acc=accountRepository.findById(accounts.getAccountId()).orElse(null);
//         if(acc!=null){
//             acc.setBalance(accounts.getBalance());
//             acc.setTransactions(accounts.getTransactions());
//             acc.setCustomer(accounts.getCustomer());
//             accountRepository.save(acc);

//         }
//     }

//     @Override
//     public void deleteAccount(int accountId) throws SQLException {
//         // TODO Auto-generated method stub
//         //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
//         Accounts acc=accountRepository.findById(accountId).get();
//         if(acc!=null){
//             accountRepository.deleteById(accountId);
//         }
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
//     }

//     @Override
//     public List<Accounts> getAllAccountsFromArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
//     }

//     @Override
//     public List<Accounts> addAccountToArrayList(Accounts accounts) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
//     }
    
// }