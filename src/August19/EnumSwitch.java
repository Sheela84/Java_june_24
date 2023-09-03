package August19;

public class EnumSwitch {
    public static void main(String[] args)
    {
        BankEnum bank=BankEnum.DEBIT;

        switch(bank)
        {
            case CRDIT:
                System.out.println(" pay by credit");
                break;
            case DEBIT:
                System.out.println(" pay by debit");
                break;
            case CASH:
                System.out.println(" pay by cash");
                break;

        }
    }
}
