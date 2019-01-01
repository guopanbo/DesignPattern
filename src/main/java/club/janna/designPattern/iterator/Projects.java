package club.janna.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 郭攀博
 * @create: 2019-01-02 07:33
 **/
public class Projects implements IProjects {

    private List<IProject> projects = new ArrayList<>();

    @Override
    public ProjectIterator iterator() {
        return new ProjectIterator(projects);
    }

    @Override
    public void add(IProject project) {
        this.projects.add(project);
    }
}
