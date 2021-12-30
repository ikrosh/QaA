package myhw.lesson15.hw;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Popup {
    @SerializedName("menu_item")
    private List<MenuItems> menuItemsResult = new ArrayList<>();

    public List<MenuItems> getMenuItemsResult() {
        return menuItemsResult;
    }

    public void setMenuItemsResult(List<MenuItems> menuItemsResult) {
        this.menuItemsResult = menuItemsResult;
    }
}
