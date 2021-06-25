
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;
    /**
     * Constructor for objects of class BankAccount
     */
    public double getBalance(){
        return balance;}
    public void deposit(double amount){
       balance = balance + amount;} 
    public void withdraw(double amount){
       balance = balance - amount;}
    public String String(){
       return Double.toString(balance);}
}
