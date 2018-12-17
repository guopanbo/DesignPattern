package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:16
 **/
public class FourGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("-------成绩单---------");
        System.out.println("语文：60，数学：63，英语：20");
        System.out.println("---------------------");
    }
}
