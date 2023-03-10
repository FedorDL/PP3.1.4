package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.models.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class RoleServiceImpl implements RoleService{
    private final RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }


    @Override
    @Transactional
    public boolean add(Role role) {
        roleDAO.add(role);
        return true;
    }

    @Override
    @Transactional
    public List<Role> getList() {
        return roleDAO.getList();
    }

    @Override
    @Transactional
    public Role getRole(Integer id) {
        return roleDAO.getRole(id);
    }

    @Override
    @Transactional
    public void deleteRole(Integer id) {
        roleDAO.deleteRole(id);
    }

    @Override
    @Transactional
    public void editRole(Role role) {
        roleDAO.editRole(role);
    }

    @Override
    @Transactional
    public List<Role> listByRole(List<String> name) {
        return roleDAO.listByName(name);
    }
}
