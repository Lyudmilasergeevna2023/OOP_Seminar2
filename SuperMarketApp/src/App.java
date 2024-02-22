import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("Иван");
        Actor client2 = new OrdinaryClient("Мария");
        Actor client3 = new SpecialClient("Президент", 7);
        TaxInspector client4 = new TaxInspector();
        ActionClient client5 = new ActionClient("Михаил", 5);
        ActionClient client6 = new ActionClient("Юрий", 6);
        ActionClient.setCountOfActionClient(6);
        client5.setNameOfAction("15% на макаронные изделия");
        client5.showActionClient();
        //ActionClient.setCountOfActionClient(7);
        client6.setNameOfAction("10% на соки");        
        client6.showActionClient();


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
        client5.returnOrder();
    }
}
