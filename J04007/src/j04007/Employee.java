/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04007;

/**
 *
 * @author ADMIN
 */
public class Employee {
    private String ID;
    private String name;
    private String sex;
    private String DOB;
    private String address;
    private String taxCode;
    private String contractDate;

    public Employee(String name, String sex, String DOB, String address, String taxCode, String contractDate) {
        this.name = name;
        this.sex = sex;
        this.DOB = DOB;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }

    
    public String StandardizedDate(String Date){
        String[] res = Date.split("/");
        for(byte i=0; i<2; i++){
            if (res[i].length() == 1)
                res[i] = "0" + res[i];
        }
        return res[0] + "/" + res[1] + "/" + res[2];
    }
    
    @Override
    public String toString() {
        return "00001 " + name + " " + sex + " " + StandardizedDate(DOB) + " " + address + " " + taxCode + " " + StandardizedDate(contractDate);
    }
}
