import java.util.*;

public class Project implements Comparable<Project>
{
    String projectName;
    HashSet<String> members;

    public Project(String projectName)
    {
        this.projectName = projectName;
        members = new HashSet<>();
    }

    public int compareTo(Project otherProject)
    {
        int memberDiff = otherProject.members.size() - this.members.size();
        if(memberDiff != 0)
            return memberDiff;
        return this.projectName.compareTo(otherProject.projectName);
    }

    public String toString()
    {
        return projectName + " " + members.size();
    }
}
