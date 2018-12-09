package club.janna.designPattern.prototype;

import java.util.Random;

/**
 * @author: 郭攀博
 * @create: 2018-12-10 07:13
 **/
public class Test {

    private static final char[] metadate = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    public static void main(String[] args) {
        Mail mail = new Mail(new AdvTemplate("xxx银行活动", "原型模式，了解一下..."));
        mail.setTail("XXX公司 版权所有 @Copyright 2018");

        for(int i = 0; i < 10; i ++) {
            new Thread(() -> {
                Mail cloneMail = null;
                try {
                    cloneMail = mail.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                cloneMail.setReceiver(String.format("%s@%s.com", getRandomString(8), getRandomString(3)));
                sendMail(cloneMail);
            }).start();
        }
    }

    public static void sendMail(Mail mail) {
        System.out.printf("发送邮件 [%s] - %s, %s, %s\n", mail.getReceiver(), mail.getSubject(), mail.getContext(), mail.getTail());
    }

    public static String getRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(metadate[random.nextInt(metadate.length)]);
        }
        return stringBuilder.toString();
    }
}
