package Classes;

/**
 * Класс описывает структуру vip-клиента
 */
public class SpecialClient extends Actor {

    private int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
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
     * Метод получения экземпляра vip-клиента
     *
     * @return экземпляр vip-клиента
     */
    public Actor getActor() {
        return this;
    }


    /**
     * Метод получения имени vip-клиента
     *
     * @return имя vip-клиента
     */
    @Override
    public String getName() {
        return super.name;
    }


    /**
     * Метод присвоения имени vip-клиенту
     *
     * @param name - присваеваемое имя vip-клиента
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }


     /**
     * Метод получения id vip-клиента
     *
     * @return id vip-клиента
     */    
    public int getIdVip() {
        return this.idVip;
    }


    /**
     * Метод присвоения id vip-клиенту
     *
     * @param idVip - присваеваемый id vip-клиента
     */    
    public void setIdVip(int idVip) {
        this.idVip = idVip;
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
