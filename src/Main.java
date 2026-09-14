public class Main {
    public static void main(String[] args) {
        System.out.println("SpendMax Proof of Concept");
        System.out.println("");
        String expenseCategory = "Dining";
        double amount = 45.50;
        System.out.println("Simulate Purchase");
        System.out.println("Expense Category: " + expenseCategory);
        System.out.println("Amount: $" + amount);

        String recommendation = "";

        if (expenseCategory.equals("Dining")) {
            recommendation = "U.S. Bank Altitude Go";
        } else if (expenseCategory.equals("Transit")) {
            recommendation = "Citi Custom Cash";
        } else {
            recommendation = "Default 2% Cash Back Card";
        }
        
        System.out.println("Recommendation: Pay with " + recommendation + " to maximize rewards.");
    }
}
