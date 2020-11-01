package two;

import java.util.Scanner;


//人物和怪的定义
public class Create {
    public static void create() {

        //人物
        System.out.println("定义你的角色");
        Person person1 = new Person();
        Scanner per = new Scanner(System.in);
        System.out.print("name:" + "\n");//输入姓名
        String name = per.next();
        person1.setName("" + name);
        System.out.print("healthy:" + "\n");//输入生命值
        int healthy = per.nextInt();
        person1.setHealthy(healthy);
        System.out.print("atk" + "\n");//输入攻击力
        int ATK = per.nextInt();
        person1.setATK(ATK);
        System.out.print("defense" + "\n");//输入防御力
        int defense = per.nextInt();
        person1.setDefense(defense);
        //怪
        System.out.println("定义BOSS");
        Person person2 = new Person();
        Scanner per2 = new Scanner(System.in);

        System.out.print("name:" + "\n");//输入姓名
        String name2 = per2.next();
        person2.setName("" + name2);
        System.out.print("healthy:" + "\n");//输入生命值
        int healthy2 = per2.nextInt();
        person2.setHealthy(healthy2);
        System.out.print("atk" + "\n");//输入攻击力
        int ATK2 = per2.nextInt();
        person2.setATK(ATK2);
        System.out.print("defense" + "\n");//输入防御力
        int defense2 = per2.nextInt();
        person2.setDefense(defense2);
        person1.tell();
        person2.tell();

        //战斗
        System.out.println("战斗开始");
        Scanner fight = new Scanner(System.in);
        int i = 1;                                         //i表回合数
        while (healthy2 > 0 && healthy > 0) {
            //角色行动
            System.out.println("回合" + i + "开始");
            System.out.println("请选择你的行动：");
            System.out.println("1.fight");
            System.out.println("2.defense");
            System.out.println("3.rest");
            int act = fight.nextInt();
            switch (act) {
                case 1:
                    if (ATK > defense2) {
                        healthy2 = healthy2 - (ATK - defense2);
                    } else {
                        healthy2 = healthy2 - 1;
                    }
                    break;
                case 2:
                   healthy=healthy2-ATK2;
                   healthy2=healthy2-defense/2;
                    break;
                case 3:
                    healthy=healthy+defense2;
                    break;
                default:
                    System.out.println("wrong");
            }
            System.out.println("boss还剩" + healthy2 + "血");
            System.out.println("you还剩" + healthy + "血");
            System.out.println("BOSS的行动");
            if (ATK2 > defense) {
                healthy = healthy - (ATK2 - defense);
            } else {
                healthy = healthy - 1;
            }
            System.out.println("boss还剩" + healthy2 + "血");
            System.out.println("you还剩" + healthy + "血");
            i = i + 1;
        }
        System.out.println("战斗结束");
        if (healthy > healthy2) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
        }
        System.out.println("all use " + (i - 1) + " turns");

    }
}
