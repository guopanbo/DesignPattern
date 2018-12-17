package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:14
 **/
public abstract class SchoolReport {

    /**
     * 成绩单
     */
    public abstract void report();

    /**
     * 签名
     * @param name
     */
    public void sign(String name) {
        System.out.println("\t\t\t签名：" + name);
    }
}
