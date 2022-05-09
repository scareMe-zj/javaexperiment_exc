package homeworl05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Person xm = new Person("小明", 140);
        System.out.println("进入魔法屋前");
        System.out.println("小明的身高是:" + xm.getHeight() + "厘米");
        System.out.println("========");

        System.out.println("小明可以吃面包长高（输入面包）");
        System.out.println("小明也可以尝试魔法机器长高（输入魔法机器）");
        System.out.println("输入结束，表示小明心满意足了");
        System.out.println("=========");

        System.out.println("请输入:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("结束")) {
            if (s.equals("面包")) {
                xm.eatBread(new Bread());
                System.out.println("小明吃了片面包");
                System.out.println("现在，小明的身高是" + xm.getHeight() + "厘米");
                System.out.println("========");
            } else if (s.equals("魔法机器")) {
                xm.magic(new Magicroom());
                System.out.println("小明用了魔法机器");
                System.out.println("现在，小明的身高是" + xm.getHeight() + "厘米");
                System.out.println("========");
            } else {
                System.out.println("小明不明白什么意思");
            }
            System.out.println("请输入：");
            s = sc.nextLine();
        }
        System.out.println("小明心满意足的回去了！");
        System.out.println("############################");
        System.out.println("魔法屋的故事续集1--vip会员真不错！");
        System.out.println("############################");
        System.out.println("老板：欢迎光临魔法屋！");
        System.out.println("老板：同学，现在注册会员免费喔。。。");
        System.out.println("老板：走过，路过，不要错过。。。");
        System.out.println("==========");
        List<Person> list = new ArrayList<Person>();
        Person xz = new Person("小张", 140, true);
        Person xf = new Person("小芳", 130, false);
        list.add(xz);
        list.add(xf);
        System.out.println("小芳：这不是霸王条款吗？");
        System.out.println("小张：为了圆梦，忍忍吧！反正咱们又不花钱！");


        System.out.println("是否注册会员?");
        String n = sc.nextLine();
        if (n.equals("是")) {
            System.out.println("请输入注册会员人数:");
            int number = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < number; i++) {
                System.out.println("请详细阅读会员注册须知，阅读完后请签名");
                System.out.println("会员" + (i + 1) + "签名:");
                n = sc.nextLine();
                //判断签名是否是小张，小芳，若不是，则创建新对象(初始身高为0)加入list
                boolean judge = false;
                for (Person p : list) {
                    if (p.getName().equals(n)) {
                        p.vip();
                        judge = true;
                    }
                }
                if (!judge) {
                    Person p = new Person(n, 0);
                    list.add(p);
                }
            }
            System.out.println("魔法会员注册完成。。。");
        } else {
            System.out.println("不注册，你搁着玩呐！");
            return;
        }
        System.out.println("=========");
        System.out.println("进入魔法屋前");
        System.out.println("小芳的身高是:" + xf.getHeight() + "厘米");
        System.out.println("小张的身高是:" + xz.getHeight() + "厘米");
        System.out.println("=========");
        System.out.println("进入魔法屋");
        System.out.println("请输入使用者的数量：");
        int x = sc.nextInt();
        sc.nextLine();
        //检测是否是会员
        for (int i = 0; i < x; i++) {
            System.out.println("请输入使用者" + (i + 1) + "的姓名");
            n = sc.nextLine();
            boolean vipsf = false;
            for (Person p : list) {
                if (p.getName().equals(n) && p.isVipflag()) {
                    vipsf = true;
                    System.out.println("会员身份确认成功！");
                    System.out.println("************************");
                    System.out.println("魔法机器：尊贵的VIP,感谢宁体验魔法机器");
                    //识别性别
                    if (p.isSex()) {
                        //男
                        System.out.println("魔法机器：机器识别出宁是：男生");
                        System.out.println("机器将使宁增高：40厘米");
                        p.setHeight(p.getHeight() + 40);
                    } else {
                        System.out.println("魔法机器：机器识别出宁是：女生");
                        System.out.println("机器将使宁增高：30厘米");
                        p.setHeight(p.getHeight() + 30);
                    }
                    System.out.println("现在，" + p.getName() + "的身高是：" + p.getHeight() + "厘米");
                    System.out.println("========");

                }
            }
            if (!vipsf) {
                System.out.println("宁不是会员！");
            }
        }
        System.out.println("========");
        System.out.println("小芳：嘻。。。嘻嘻嘻。。。");
        System.out.println("小张：嘿。。。嘿嘿嘿。。。");
        System.out.println("老板：哈哈哈哈。。。。。。");
    }
}

