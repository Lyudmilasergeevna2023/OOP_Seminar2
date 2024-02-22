package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает структуру налогового инспектора
 */

public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name;
    private boolean isTakeOrder;  // флаг состояния: инспектор получил заказ
    private boolean isMakeOrder;  // флаг состояния: инспектор сделал заказ
    

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }


    /**
     * Метод получения имени налогового инспектора
     *
     * @return имя налогового инспектора
     */    
    public String getName()
    {
        return name;
    }


    /**
     * Метод получения флага состояния полученного заказа
     *
     * @return Флаг состояния: клиент получил заказ/не получил заказ
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }


    /**
     * Метод получения флага состояния сделанного заказа
     *
     * @return Флаг состояния: клиент сделал заказ/не сделал заказ
     */
    public boolean isMakeOrder() {
        return isMakeOrder; 
    }


    /**
     * Метод установления флага состояния полученного заказа
     *
     * @param isCreated - переменная состояния заказа (получен или не получен)
     */
    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;
    }


    /**
     * Метод установления флага состояния сделанного заказа
     *
     * @param isCreated - переменная состояния заказа (сделан или не сделан)
     */
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;        
    }


    /**
     * Метод возвращает экземпляр обычного клиента при запросе экземпляра класса налоговый инспектор
     * @return экземпляр класса обычного клиента с именем по умолчанию "Тайный клиент"
     */    
    public Actor getActor() {
        return new OrdinaryClient("Тайный клиент");
    }


    /**
     * Метод для возврата заказа 
     */
    public void returnOrder() {
        if (isTakeOrder) {
            System.out.println(this.getName() + " клиент вернул заказ ");
            this.setTakeOrder(false);
        }
    }
    
}
