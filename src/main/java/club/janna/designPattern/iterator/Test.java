package club.janna.designPattern.iterator;

/**
 * @author: 郭攀博
 * @create: 2019-01-02 07:38
 **/
public class Test {
    public static void main(String[] args) {
        IProjects projects = new Projects();
        projects.add(new Project("项目1", 1, 10));
        projects.add(new Project("项目2", 2, 20));
        projects.add(new Project("项目3", 3, 30));

        IProjectIterator iterator = (IProjectIterator) projects.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getProjectInfo());
    }
}
