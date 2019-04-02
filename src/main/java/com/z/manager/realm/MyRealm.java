package com.z.manager.realm;

import com.z.manager.entity.Student;
import com.z.manager.service.IStudentService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IStudentService studentService;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        String username=token.getUsername();
        if(username!=null&&username!=""){
            Student student=studentService.getStudentByName(username);
            if(student!=null){
                ByteSource byteSource=ByteSource.Util.bytes(username);
                return new SimpleAuthenticationInfo(student,student.getPassword(),byteSource,this.getName());
            }
        }
        return null;
    }
}
