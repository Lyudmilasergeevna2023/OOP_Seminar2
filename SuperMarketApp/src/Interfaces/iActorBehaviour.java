package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения всех видов клиентов
 */

public interface iActorBehaviour {
    public boolean isTakeOrder(); // метод получения флага состояния полученного заказа
    public boolean isMakeOrder(); // метод получения флага состояния сделанного заказа
    public void setTakeOrder(boolean val); // метод установки флага получения заказа
    public void setMakeOrder(boolean val); // метод установки флага формирования заказа
    public Actor getActor(); // метод получения экземпляра клиента
}
