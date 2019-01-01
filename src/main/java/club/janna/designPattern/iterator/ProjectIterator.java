package club.janna.designPattern.iterator;


import java.util.List;

/**
 * @author: 郭攀博
 * @create: 2019-01-02 07:34
 **/
public class ProjectIterator implements IProjectIterator {

    List<IProject> projects;

    private int index;

    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        return index < projects.size();
    }

    @Override
    public IProject next() {
        return projects.get(index ++);
    }
}
