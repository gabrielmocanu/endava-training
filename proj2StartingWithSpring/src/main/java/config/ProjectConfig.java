package config;

import beans.TransactionRepository;
import beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    //@Primary -> primary key for calling in Main in the same context class
    public TransactionRepository transactionRepository1() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 1");

        return transactionRepository;
    }

    @Bean
    @Scope(scopeName = "prototype")
    public TransactionRepository transactionRepository2() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Prototype");

        return transactionRepository;
    }

    @Bean
    public TransactionService transactionService (){
        TransactionService transactionService = new TransactionService();
        return transactionService;
    }

}
