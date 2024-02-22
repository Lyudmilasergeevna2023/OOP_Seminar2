package Interfaces;

/**
 * Интерфейс методов движения покупателя в магазине
 */

public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor); // метод добавления клиента в очередь
    public void releaseFromQueue(); // метод удаления клиента из очереди
    public void takeOrder (); // метод формирования заказа клиентом в магазине
    public void giveOrder (); // метод получения заказа клиентом в магазине
   
}
