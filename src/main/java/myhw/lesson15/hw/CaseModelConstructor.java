package myhw.lesson15.hw;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class CaseModelConstructor {
    public static void main(String[] args) {
        CaseModelConstructor caseModelConstructor = new CaseModelConstructor();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(caseModelConstructor.getCaseModel()));
    }

    public CaseMenu getCaseModel() {

        MenuItems menuItems = new MenuItems();
        menuItems.setValue("New");
        menuItems.setOnclick("CreateNewDoc()");

        MenuItems menuItems2 = new MenuItems();
        menuItems2.setValue("Open");
        menuItems2.setOnclick("OpenDoc()");

        MenuItems menuItems3 = new MenuItems();
        menuItems3.setValue("Close");
        menuItems3.setOnclick("CloseDoc()");

        List<MenuItems> menuItemsResult = new ArrayList<>();
        menuItemsResult.add(menuItems);
        menuItemsResult.add(menuItems2);
        menuItemsResult.add(menuItems3);

        Popup popup = new Popup();
        popup.setMenuItemsResult(menuItemsResult);

        Menu menu = new Menu();
        menu.setId("file");
        menu.setValue("File");
        menu.setPopup(popup);

        CaseMenu caseMenu = new CaseMenu();
        caseMenu.setMenu(menu);
        return caseMenu;
    }
}
