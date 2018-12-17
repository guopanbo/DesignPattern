package club.janna.designPattern.decorator;

/**
 * @author: 郭攀博
 * @create: 2018-12-18 07:18
 **/
public abstract class SchoolReportDecorator extends SchoolReport {

    private SchoolReport report;

    public SchoolReportDecorator(SchoolReport report) {
        this.report = report;
    }

    @Override
    public void report() {
        report.report();
    }
}
