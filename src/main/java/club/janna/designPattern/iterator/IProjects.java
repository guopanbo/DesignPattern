package club.janna.designPattern.iterator;


/**
 * @author: 郭攀博
 * @create: 2019-01-02 07:30
 **/
public interface IProjects extends Iterable<IProject> {

    void add(IProject project);
}
