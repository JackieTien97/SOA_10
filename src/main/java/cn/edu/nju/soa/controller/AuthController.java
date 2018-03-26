package cn.edu.nju.soa.controller;

import cn.edu.nju.soa.model.AuthLevel;
import cn.edu.nju.soa.model.AuthVerifyType;
import cn.edu.nju.soa.model.VerifyType;
import cn.edu.nju.soa.webservice.IdNotFoundFault;
import cn.edu.nju.soa.webservice.PswErrorFault;
import cn.edu.nju.soa.webservice.StudentAuthInterface;

import java.util.ArrayList;
import java.util.List;

public class AuthController implements StudentAuthInterface{
    @Override
    public VerifyType verify(AuthVerifyType parameters) throws IdNotFoundFault, PswErrorFault {
        //啊啊啊啊啊作业太难了啊啊啊啊啊
        //没精力搞别的了，只能用死数据了

        //假设他们都用同一个密码（逃
        String password="11223344";
        List<String> ids=new ArrayList<>();
        ids.add("151250162@smail.nju.edu.cn");
        ids.add("MF151250162@smail.nju.edu.cn");
        ids.add("151250162@nju.edu.cn");
        
        VerifyType vt=new VerifyType();

        String account=parameters.getAccount();
        boolean in=false;
        for(int i=0;i<ids.size();i++){
            if(account.equals(ids.get(i))){
                in=true;
                break;
            }
        }

        if(!in){
            throw new IdNotFoundFault();
        }
        if(!parameters.getPassword().equals(password)){
            throw new PswErrorFault();
        }

        if(account.startsWith("MF")){
            vt.setLevel(AuthLevel.研究生);
        }else if(account.endsWith("@nju.edu.cn")){
            vt.setLevel(AuthLevel.教师);
        }else{
            vt.setLevel(AuthLevel.普通学生);
        }

        return vt;
    }
}
