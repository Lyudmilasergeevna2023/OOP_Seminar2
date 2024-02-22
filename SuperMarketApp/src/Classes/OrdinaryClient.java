package Classes;

/**
 * Класс описывает структуру обычного клиента
 */

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }


    /**
     * Метод получения флага состояния полученного заказа
     *
     * @return Флаг состояния: клиент получил заказ/не получил заказ
     */   
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }


    /**
     * Метод получения флага состояния сделанного заказа
     *
     * @return Флаг состояния: клиент сделал заказ/не сделал заказ
     */    
    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }


    /**
     * Метод установления флага состояния полученного заказа
     *
     * @param isCreated Переменная состояния заказа(получен или не получен)
     */
    public void setTakeOrder(boolean isCreated) {
        super.isTakeOrder = isCreated;
    }


    /**
     * Метод установления флага состояния сделанного заказа
     *
     * @param isCreated - переменная состояния заказа (сделан или не сделан)
     */
    public void setMakeOrder(boolean isCreated) {
        super.isMakeOrder = isCreated;        
    }


    /**
     * Метод получения экземпляра обычного клиента
     *
     * @return экземпляр обычного клиента
     */
    public Actor getActor() {
        return this;
    }


    /**
     * Метод возвращает имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }


    /**
     * Метод присвает имя клиенту
     * @param String name - присваиваемое клиенту имя
     */
    @Override
    public void setName(String name) {
        super.name = name;
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