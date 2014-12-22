package com.chathurangaonline.samples.dao.impl;

import com.chathurangaonline.samples.dao.UserRoleDao;
import com.chathurangaonline.samples.model.UserRole;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository("userRoleDao")
public class UserRoleDaoImpl extends GenericDaoImpl<UserRole> implements UserRoleDao{


}
