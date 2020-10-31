package two;

class Person {
    private String name;                     //姓名
    int healthy;                  //生命值
    private int ATK;                     //攻击力
    private int defense;                //防御力

    public void tell() {
        System.out.println("姓名：" + name + " 生命值：" + healthy + " 攻击力：" + ATK + " 防御力：" + defense);
    }

    //姓名
    public void setName(String name) {
        this.name = name;
    }

    //生命值
    public void setHealthy(int healthy) {
        if (healthy >= 1 && healthy <= 999) {
            this.healthy = healthy;
        } else System.out.println("fault");
    }

    //攻击力
    public void setATK(int ATK) {
        if (ATK >= 1 && ATK <= 999) {
            this.ATK = ATK;
        } else System.out.println("fault");
    }

    //防御力
    public void setDefense(int defense) {
        if (defense >= 1 && defense <= 999) {
            this.defense = defense;
        } else System.out.println("fault");
    }
}

public class lv1 {
    public static void main(String[] args) {
        Game_pre game_pre = new Game_pre();
        Create create = new Create();


        Game_pre.game_pre();    //说明
        Create.create();       //创建人物并战斗


    }
}
