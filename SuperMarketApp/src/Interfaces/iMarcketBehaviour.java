package Interfaces;

import java.util.List;
import Classes.Actor;

/**
 * Интерфейс методов входа в магазин и выхода из магазина
 */

public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor); // метод входа клиента в магазин
    public void releseFromMarket(List<Actor> actors); // метод выхода клиента из магазина
    public void update(); // метод выполнения действий клиента (получение заказа, выход из очереди и выход из магазина)
}
