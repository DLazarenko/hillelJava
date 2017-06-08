package lesson7;

public class Group {
    private String groupName;
    private Student[] groupList;

    Group(String groupName, Student[] groupList) {
        this.groupName = groupName;
        this.groupList = groupList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getGroupList() {
        return groupList;
    }

    public void setGroupList(Student[] groupList) {
        this.groupList = groupList;
    }

    public void add(Student student) {
        Student[] newGroupList = new Student[groupList.length + 1];
        for (int i = 0; i < groupList.length; i++) {
            newGroupList[i] = groupList[i];
        }
        newGroupList[newGroupList.length - 1] = student;
        groupList = newGroupList;
    }

    public Student getStudentByIndex(int index) {
        return groupList[index];
    }

    public String toString() {
        String string = groupName;
        if (groupList != null) {
            for (Student student : groupList) {
                string = string + "\n " + student;
            }
        }
        return string;
    }

    public boolean contains(String surname, String name) {
        for (int i = 0; i < groupList.length; i++) {
            if (groupList[i].getSurname().equals(surname) && groupList[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String surname, String name) {
        for (int i = 0; i < groupList.length; i++) {
            if (groupList[i].getSurname().equals(surname) && groupList[i].getName().equals(name)) {
                groupList[i] = null;
            }
        }
    }
}