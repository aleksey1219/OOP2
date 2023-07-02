public class ServiceStation {
    public void service(Transport transport) {
        System.out.println("Начинаем обслуживание");
        transport.service();
        System.out.println("закончили");
    }
}
