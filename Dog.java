/**
 * ClassName: Dog
 * Description:
 *
 * @Author 小黄
 * @Create 2023/11/6  18:19
 * @Version 1.0
 */
public class Dog extends Pet{
    private String color;

    public Dog(String name, char sex, String color) {
        super(name, sex);
        this.color = color;
    }
    public void ability(){
        System.out.println("狗能看家");
    }

    @Override
    public void talk() {
        System.out.println("汪汪汪...");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
