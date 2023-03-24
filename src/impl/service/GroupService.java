package impl.service;

import db.Datadase;
import impl.GroupServiceImpl;
import model.Group;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GroupService implements GroupServiceImpl {

Datadase datadase = new Datadase();

    @Override
    public String addNewGroup(Group group) {
       datadase.getGroups().add(group);
       return  " ";
    }

    @Override
    public String getGroupById(int id) {
        datadase.getGroups().stream().filter(x->x.getId()==id);




        return "qwe456789p";
    }

    @Override
    public List<Group> getAllGroups() {

        System.out.println(datadase.getGroups().toString());

        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
