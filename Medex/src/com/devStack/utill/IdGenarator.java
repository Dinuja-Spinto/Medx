package com.devStack.utill;

import com.devStack.db.DBConnection;

import java.sql.*;

public class IdGenarator {
    public int genId(){
        try{
            ResultSet rst = CrudUtil.execute("SELECT id FROM user ORDER BY id DESC LIMIT 1");
            if(rst.next()){
                return rst.getInt(1)+1;
            }

        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return 1;
    }
}
