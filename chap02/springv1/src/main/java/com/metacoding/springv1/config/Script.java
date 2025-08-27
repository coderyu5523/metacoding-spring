package com.metacoding.springv1.config;

public class Script {

    public static String alertBack(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("alert('"+msg+"');");
        sb.append("history.back();");
        sb.append("</script>");
        return sb.toString();
    }

    public static String href(String path) {

        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("location.href='"+path+"';");
        sb.append("</script>");
        return sb.toString();
    }

    public static String alertHref(String path, String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("alert('"+msg+"');");
        sb.append("location.href='"+path+"';");
        sb.append("</script>");
        return sb.toString();
    }
}