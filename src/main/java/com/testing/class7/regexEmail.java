package com.testing.class7;
import java.util.Scanner;

//邮箱格式：xxxx@qq.com
// a-zA-z0-9  长度5-11位
//后缀为qq.com  mail.com  163.com  yahoo.com
public class regexEmail {
    public static void main(String[] args) {
        int i=1;
        while (i==1) {
            System.out.println("是否开始检查邮箱格式，是输入1，否输出0！");
            Scanner inputmsg=new Scanner(System.in);
            int msg=inputmsg.nextInt();
            if(msg==0){
                System.out.println("检查结束！");
                i++;
            }else if(msg==1) {
                System.out.println("请输入邮箱：");
                Scanner sc = new Scanner(System.in);
                String Emil = sc.nextLine();
                String regex = "[a-zA-Z0-9]{5,12}@(qq|mail|163|yahoo)\\.com";
//                System.out.println(Emil.matches(regex));
                if(Emil.matches(regex)){
                    System.out.println("输入的是邮件格式。");
                }else {
                    System.out.println("输入的不是邮件格式......");
                }
            }
        }
    }

}
