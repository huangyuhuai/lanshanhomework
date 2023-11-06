/**
 * ClassName: Cat
 * Description:
 *
 * @Author 小黄
 * @Create 2023/11/6  18:24
 * @Version 1.0
 */
public class Cat extends Pet{
    private double weight;

    public Cat(String name, char sex, double weight) {
        super(name, sex);
        this.weight = weight;
    }
    public void ability(){
        System.out.println("猫捉老鼠");
    }
    @Override
    public void talk() {
        System.out.println("喵喵喵...");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
