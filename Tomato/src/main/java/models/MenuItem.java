package models;

public class MenuItem {

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String name;
    private String price;

    public MenuItem(String code, String name, String price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }



}
