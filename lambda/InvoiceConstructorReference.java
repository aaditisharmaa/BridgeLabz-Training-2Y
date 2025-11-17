import java.util.*;
import java.util.stream.*;

class Invoice {
    String txnId;

    Invoice(String txnId) {
        this.txnId = txnId;
        System.out.println("Invoice created for: " + txnId);
    }
}

public class InvoiceConstructorReference {
    public static void main(String[] args) {

        List<String> txnList = Arrays.asList("TXN-101", "TXN-102", "TXN-103");

        List<Invoice> invoices = 
            txnList.stream()
                   .map(Invoice::new)   // constructor reference
                   .collect(Collectors.toList());
    }
}
