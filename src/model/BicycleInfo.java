package model;
//车辆状态信息
public class BicycleInfo {

    private int bicycle_id;//车辆id
    private String bicycle_code;//车辆编号
    private String status;//车辆状态
    private int pile_id;//所在车桩
    private String destroy_date;//车辆销毁日期
    private int user_id;//操作人
    private String operator_time;//操作时间
    private int card_id;//租车卡id
    private String remark;//备注

    public int getBicycle_id() {
        return bicycle_id;
    }

    public void setBicycle_id(int bicycle_id) {
        this.bicycle_id = bicycle_id;
    }

    public String getBicycle_code() {
        return bicycle_code;
    }

    public void setBicycle_code(String bicycle_code) {
        this.bicycle_code = bicycle_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPile_id() {
        return pile_id;
    }

    public void setPile_id(int pile_id) {
        this.pile_id = pile_id;
    }

    public String getDestroy_date() {
        return destroy_date;
    }

    public void setDestroy_date(String destroy_date) {
        this.destroy_date = destroy_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOperator_time() {
        return operator_time;
    }

    public void setOperator_time(String operator_time) {
        this.operator_time = operator_time;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
