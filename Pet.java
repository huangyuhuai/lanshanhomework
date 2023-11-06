/**
 * ClassName: Pet
 * Description:
 *
 * @Author 小黄
 * @Create 2023/11/6  18:12
 * @Version 1.0
 */
public abstract class Pet {
    private String name;
    private char sex;

    public Pet(String name,char sex){
        this.name = name;
        this.sex = sex;
    }

    public abstract void talk();

    public abstract void eat();

}
