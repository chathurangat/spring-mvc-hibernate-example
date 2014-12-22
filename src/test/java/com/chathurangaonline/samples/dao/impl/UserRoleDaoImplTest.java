package com.chathurangaonline.samples.dao.impl;


import com.chathurangaonline.samples.dao.UserRoleDao;
import com.chathurangaonline.samples.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

//@Test
@ContextConfiguration("classpath*:applicationContext-test.xml")
public class UserRoleDaoImplTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private UserRoleDao userRoleDao;

    @Test
    public void testSave(){
        UserRole userRole = new UserRole();
        userRole.setRoleNameEnglish("nameEn");
        userRole.setRoleNameSinhala("nameSi");
        userRole.setRoleNameTamil("nameTa");
        userRoleDao.save(userRole);
    }
}
