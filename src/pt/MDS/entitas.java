/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.MDS;

/**
 *
 * @author efron
 */
public class entitas {
    private static String idmember;
    private static String username;
    private static String fullname;
    private static String level;

    public static String getIdmember() {
        return idmember;
    }

    public static void setIdmember(String idmember) {
        entitas.idmember = idmember;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        entitas.username = username;
    }
    
    public static String getFullname() {
        return fullname;
    }

    public static void setFullname(String fullname) {
        entitas.fullname = fullname;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        entitas.level = level;
    }
    
}
