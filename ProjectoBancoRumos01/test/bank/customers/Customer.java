package bank.customers;

import java.util.ArrayList;

/**
 *
 * @author Castro
 */
public class Customer {
    private static int id = 0;
    private String name;
    private String telephone;
    private String email;
    private String profession;
    private Account account;
    private ArrayList<Account> account;
    private Card debitCard;
    private ArrayList<Card> cards;
}
