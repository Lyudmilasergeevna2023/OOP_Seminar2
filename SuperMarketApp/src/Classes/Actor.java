package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает структуру абстрактного клиента
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); // Метод возвращает имя клиента
    public abstract void setName(String name); // Метод присвает имя клиенту
        
}
