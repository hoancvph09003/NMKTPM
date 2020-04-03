/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.helper;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DialogHelper {
   /**
    * Hiển thị thông báo cho người dùng
    * @param parent cửa sổ chưa thông báo
    * @param message là thông báo
    */
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
   /**
    * Hiển thị lựa chọn xac nhận cho người dùng
    * @param parent cửa sổ hiển thị thông báo
    * @param message là thông báo
    * @return 
    */
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result==JOptionPane.YES_OPTION;
    }
   /**
    * Hiển thị hộp nhập liệu cho người dùng
    * @param parent cửa sổ hiển thị nhập liệu
    * @param message là thông báo
    * @return 
    */
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
   /**
    * Hiển thị lựa chọn xác nhận cho người dùng
    * @param parent cửa sổ hiển thị không báo
    * @param message là thông báo
    * @param option các lựa chọn xác nhận cho người dùng
    * @return 
    */
    public static int option(Component parent, String message, String option[]){
        int result = JOptionPane.showOptionDialog(parent, message, "Hệ thống quản lý đào tạo"
                , 0, JOptionPane.QUESTION_MESSAGE,null, option, message);
        return result;
    }
}
