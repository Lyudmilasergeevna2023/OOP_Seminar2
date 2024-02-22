package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс описывает работу магазина
 * Методы класса работают с клиентами, которые представляют собой экземпляры классов, 
 * наследующихся от абстрактного класса Actor, который реализует интерфейс iActorBehaviour. 
 */

public class Market implements iMarcketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }


     /**
     * Метод фиксирует приход клиента в магазин
     *
     * @param actor - клиент, пришедший в магазин
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }


    /**
     * Метод добавляет клиента в очередь в магазине
     *
     * @param actor - клиент, добавляемый в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }


    /**
     * Метод фиксирует выход клиента из магазина
     *
     * @param actors - список клиентов, покинувших очередь
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }


    /**
     * Метод выполнения действий клиента в магазине: оформление заказа, получение заказа, выход из очереди и магазина
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }


    /**
     * Метод фиксирует выдачу заказа клиенту
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }


    /**
     * Метод показывает клиентов, которые получили заказ и покинули очередь
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }


    /**
     * Метод фиксирует оформление заказа клиентом
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }

    }

}
