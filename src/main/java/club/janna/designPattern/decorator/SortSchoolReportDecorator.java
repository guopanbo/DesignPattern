package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:23
 **/
public class SortSchoolReportDecorator extends SchoolReportDecorator {
    public SortSchoolReportDecorator(SchoolReport report) {
        super(report);
    }

    public void sort() {
        System.out.println("这次我在班里的排名第30名");
    }

    @Override
    public void report() {
        super.report();
        this.sort();
    }
}
