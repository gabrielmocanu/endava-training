package beans;

public class TransactionService {
    private TransactionRepository transactionRepository;


    @Override
    public String toString() {
        return "TransactionService{" +
                "transactionRepository=" + transactionRepository +
                '}';
    }

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}
