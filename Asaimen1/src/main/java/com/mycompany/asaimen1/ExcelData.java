/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asaimen1;

/**
 *
 * @author Maccik
 */
public class ExcelData {
    private String data0;
    private String data1;
    private String data2;
    
    public ExcelData(){
        
    }
    
    public ExcelData(String data0, String data1, String data2){
        this.data0 = data0;
        this.data1 = data1;
        this.data2 = data2;
    }
    
    
    public void setData0(String data0) {
        this.data0 = data0;
    }

    public String getData0() {
        return data0;
    }
    
    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData1() {
        return data1;
    }
    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData2() {
        return data2;
    }
}
