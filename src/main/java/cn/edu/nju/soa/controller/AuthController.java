package cn.edu.nju.soa.controller;

import cn.edu.nju.soa.model.AuthVerifyType;
import cn.edu.nju.soa.model.VerifyType;
import cn.edu.nju.soa.webservice.IdNotFoundFault;
import cn.edu.nju.soa.webservice.PswErrorFault;
import cn.edu.nju.soa.webservice.StudentAuthInterface;


public class AuthController implements StudentAuthInterface {
    @Override
    public VerifyType verify(AuthVerifyType parameters) throws IdNotFoundFault, PswErrorFault {
        return null;
    }
}
