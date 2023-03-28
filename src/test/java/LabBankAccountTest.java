import org.example.LabBankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LabBankAccountTest {
    LabBankAccount labBankAccount;
    @BeforeEach
    public void setUp(){
        labBankAccount = new LabBankAccount("Anna", "Henderson", "May");
    }

//    TESTS FOR GETTERS + SETTERS
    @Test
    public void canReturnFirstName(){
        String actual = labBankAccount.getFirstName();
        String expected = "Anna";
        assertThat(actual).isEqualTo(expected);
    }

   @Test
//    public void canSetNewFirstName(){
//        String actual = labBankAccount.setFirstName();
//        String expected = "name";
//        assertThat(actual).isEqualTo(expected);
//    }

    public void canSetFirstName(){
        labBankAccount.setFirstName("name");
        assertThat(labBankAccount.getFirstName()).isEqualTo("name");
    }
    @Test
    public void canReturnLastName(){
        String actual = labBankAccount.getLastName();
        String expected = "Henderson";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName(){
        labBankAccount.setLastName("name");
        assertThat(labBankAccount.getLastName()).isEqualTo("name");
    }

    @Test
    public void canReturnDateOfBirth(){
        String actual = labBankAccount.getDateOfBirth();
        String expected = "May";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setNewDateOfBirth(){
        labBankAccount.setDateOfBirth("dob");
        assertThat(labBankAccount.getDateOfBirth()).isEqualTo("dob");
    }

    @Test
    public void canReturnAccountNumber(){
        Integer actual = labBankAccount.getAccountNumber();
        Integer expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setNewAccountNumber(){
        labBankAccount.setAccountNumber(43289);
        assertThat(labBankAccount.getAccountNumber()).isEqualTo(43289);
    }

    @Test
    public void canReturnBalance(){
        Double actual = labBankAccount.getBalance();
        Double expected = 0.00;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setNewBalance(){
        labBankAccount.setBalance(123.45);
        assertThat(labBankAccount.getBalance()).isEqualTo(123.45);
    }

//    TEST FOR CUSTOM METHODS
    @Test
    public void balanceAfterDeposit(){
        Double actual = labBankAccount.deposit(321.56);
        Double expected = 321.56;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void balanceAfterWithdrawal(){
        Double actual = labBankAccount.withdrawal(321.56);
        Double expected = 321.56;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPayInterest(){
        Double actual = labBankAccount.payInterest(100.00);
        Double expected = 110.00;
        assertThat(actual).isEqualTo(expected);

    }
}

