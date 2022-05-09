package homework06;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Person xm=new Person("xm",192);
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎小明来到魔法屋！");
        while(!xm.isSvipflag()){
            System.out.println("是否注册成为超级会员");
            String s1= sc.nextLine();
            if(!s1.equals("是")){
                System.out.println("注册成为超级会员才可享受服务!");
            }else {
                xm.svip();
            }
        }
        System.out.println("恭喜你注册成为超级会员！");
        System.out.println("请输入序号选择服务：");
        boolean flag=true;
        while(flag){
            System.out.println("1.变高");
            System.out.println("2.变矮");
            System.out.println("3.退出魔法屋");
            int num=sc.nextInt();
            if(num==1){
                System.out.println("请输入身高的变化值:");
                int h=sc.nextInt();
                xm.setHeight(xm.getHeight()+h);
                System.out.println("你现在的身高是："+xm.getHeight());
            }else if(num==2){
                System.out.println("请输入身高的变化值:");
                int h=sc.nextInt();
                xm.setHeight(xm.getHeight()-h);
                System.out.println("你现在的身高是："+xm.getHeight());
            }else if(num==3){
                flag=false;
            }

        }

    }
}
