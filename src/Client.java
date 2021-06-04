import com.sun.org.apache.xpath.internal.operations.Or;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setId(1);
        order1.setFruitmap("橙子",1);
        order1.setFruitmap("梨子",2);
        order1.setFruitmap("苹果",3);

        Order order2 = new Order();
        order2.setId(2);
        order2.setFruitmap("香蕉",4);
        order2.setFruitmap("葡萄",2);
        order2.setFruitmap("西红柿",3);

        Operator op = new Operator();
        OrderCommand cmd1 =new OrderCommand(op,order1);
        OrderCommand cmd2 =new OrderCommand(op,order2);

        WaitorInvoker Waitor = new WaitorInvoker();
        Waitor.SetCommand(cmd1);
        Waitor.SetCommand(cmd2);

        Waitor.OrderUp();
    }
}
