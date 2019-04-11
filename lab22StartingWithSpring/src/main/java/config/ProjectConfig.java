package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.TransactionRepository;

@Configuration
@ComponentScan(basePackages = {"repositories","service"})
public class ProjectConfig {

    @Bean
    //@Primary -> primary key for calling in Main in the same context class
    public TransactionRepository transactionRepository1() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setName("Transaction 1");

        return transactionRepository;
    }
}
