package main;

import beans.TransactionRepository;
import beans.TransactionService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            TransactionRepository transactionRepository1 =
                    context.getBean("transactionRepository1",TransactionRepository.class); // by type vs by name
            TransactionRepository transactionRepository2 =
                        context.getBean("transactionRepository2",TransactionRepository.class); // by type vs by name

            transactionRepository2.setName("Singleton");
          //  System.out.println(transactionRepository1);
          //  System.out.println(transactionRepository2);
        }

        try( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            TransactionRepository transactionRepositoryPrototype1 =
                    context.getBean("transactionRepository1",TransactionRepository.class); // by type vs by name
            TransactionRepository transactionRepositoryPrototype2 =
                    context.getBean("transactionRepository2",TransactionRepository.class); // by type vs by name

            //System.out.println(transactionRepositoryPrototype1);
            //System.out.println(transactionRepositoryPrototype2);

            TransactionService transactionService =
                    context.getBean(TransactionService.class);

            transactionService.setTransactionRepository(new TransactionRepository());
            System.out.println(transactionService);
        }
    }
}
