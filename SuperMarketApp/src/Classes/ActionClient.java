package Classes;

/**
 * Класс описывает структуру акционного клиента
 */

public class ActionClient extends Actor {
    private String nameOfAction; // название акции
    private int id; // id-клиента
    private static int countOfActionClient; // количество участников в акции
    
    public ActionClient(String name, int id) {
        super(name);
        this.id = id;
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
        this.isTakeOrder = isCreated;
    }

    /**
     * Метод установления флага состояния сделанного заказа
     *
     * @param isCreated - переменная состояния заказа (сделан или не сделан)
     */
    public void setMakeOrder(boolean isCreated) {
        this.isMakeOrder = isCreated;
    }

    /**
     * Метод получения экземпляра акционного клиента
     *
     * @return экземпляр акционного клиента
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Метод получения имени акционного клиента
     *
     * @return имя акционного клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени акционному клиенту
     *
     * @param name - присваемое имя акционного клиента
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Метод возвращает id клиента
     *
     * @return id клиента
     */
    public int getId() {
        return id;
    }

    /**
     * Метод устанавливает id клиента.
     *
     * @param id - присваиваемый id клиента
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод возвращает количество участников акции
     *
     * @return количество участников акции
     */
    public static int getCountOfActionClient() {
        return countOfActionClient;
    }

    /**
     * Метод задает количество участников акции
     *
     * @param countOfActionClient - количество участников акции
     */
    public static void setCountOfActionClient(int countOfActionClient) {
        ActionClient.countOfActionClient = countOfActionClient;
    }

    /**
     * Метод возвращает название акции
     *
     * @return название акции
     */
    public String getNameOfAction() {
        return nameOfAction;
    }

    /**
     * Метод задает название акции.
     *
     * @param nameOfAction - название акции
     */
    public void setNameOfAction(String nameOfAction) {
        this.nameOfAction = nameOfAction;
    }

    /**
     * Метод показывает, является ли клиент участником текущей акции.
     */
    public void showActionClient() {
        if (id <= countOfActionClient) {
            System.out.println("Клиент " + super.name + " c id:" + this.id + " участвует в акции " + this.nameOfAction);
        } else
            System.out.println("Клиент " + super.name + " c id:" + this.id + " не участвует в акции " + this.nameOfAction);
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
