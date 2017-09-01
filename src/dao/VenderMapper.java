package dao;

import model.Vender;

public interface VenderMapper {
    int addVender(Vender vender);//新增供应商
    int updateVender(Vender vender);//修改和注销供应商

}
