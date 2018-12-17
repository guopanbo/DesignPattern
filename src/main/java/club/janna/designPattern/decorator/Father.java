package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:17
 **/
public class Father {
    public static void main(String[] args) {
        SchoolReport report = new FourGradeSchoolReport();
        report = new SortSchoolReportDecorator(report);
        report = new HighScoreSchoolReportDecorator(report);

        report.report();
    }
}
