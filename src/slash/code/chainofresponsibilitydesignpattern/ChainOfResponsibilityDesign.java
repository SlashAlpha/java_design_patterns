package slash.code.chainofresponsibilitydesignpattern;

public class ChainOfResponsibilityDesign {

    /*
    The chain of responsibility  pattern creates a chain of receiver object for a request
    Also decouples the user from the object that is serving the request, the user is not aware
    which object is actually serving its request.

     */

    public static void main(String[] args) {
        Manager manager=new Manager();


        Director director=new Director();
        VicePresident vicePresident=new VicePresident();
        manager.setNextLoanApproval(director);
        director.setNextLoanApproval(vicePresident);
        Loan loan=new Loan(1130000);
        manager.approveLoan(loan);

    }
}

    class Loan {
    private int amount;

    public Loan(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
    abstract class LoanApproval{
    protected LoanApproval nextLoanApproval;

        public void setNextLoanApproval(LoanApproval nextLoanApproval) {
            this.nextLoanApproval = nextLoanApproval;
        }

        public abstract void approveLoan(Loan loan);

    }
    class Manager extends LoanApproval{

        @Override
        public void approveLoan(Loan loan) {
            if (loan.getAmount()<=100000){
                System.out.println("Approved By the Bank Manager");
            }else {
                nextLoanApproval.approveLoan(loan);
            }
        }
    }
    class Director extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount()<=250000){
            System.out.println("Approved By the Bank Director");
        }else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
    class VicePresident extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount()>=250000){
            System.out.println("Approved By the Bank VicePresident");
            }
        }
}

