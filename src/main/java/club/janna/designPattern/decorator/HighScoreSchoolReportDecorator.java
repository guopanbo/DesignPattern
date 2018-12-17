package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:21
 **/
public class HighScoreSchoolReportDecorator extends SchoolReportDecorator {
    public HighScoreSchoolReportDecorator(SchoolReport report) {
        super(report);
    }

    public void highScore() {
        System.out.println("这次考试班里最高分：语文：75，数学：80，英语：40");
    }

    @Override
    public void report() {
        this.highScore();
        super.report();
    }
}
