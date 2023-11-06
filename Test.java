/**
 * ClassName: Test
 * Description:
 *
 * @Author 小黄
 * @Create 2023/11/6  18:26
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("小白",'公',"黑色");

        dog.talk();
        dog.eat();

        Cat cat = new Cat("小黑",'母',5);

        cat.talk();
        cat.eat();
    }
}
