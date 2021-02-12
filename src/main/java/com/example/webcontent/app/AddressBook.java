package com.example.webcontent.app;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> list;
//
//    private List<View> views;

    private String name;



    public AddressBook() {

        list = new ArrayList<BuddyInfo>();
//        views = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<BuddyInfo> getList() {
        return list;
    }

//    public void addView(View view){
//        views.add(view);
//    }


    public void setList(List<BuddyInfo> list) {
        this.list = list;
    }

    public void addBuddy(BuddyInfo buddy) {

        if (buddy != null) {
            list.add(buddy);
        }
    }

    public void removeBuddy(int i) {
        if (i >= 0 && i < list.size()) {
            list.remove(i);
        }
    }
/*
    public String toString(){
        String str= "";
        for (com.example.webcontent.app.BuddyInfo buddyInfo : list) {
            str+=buddyInfo.toString()+"\n";
        }
        return str;
    }
*/
//    public void handleUpdate(BuddyInfo buddy){
//        for (View view : views) {
//            view.handleUpdate(new AddressBookEvent(this,buddy));
//        }
//    }
//
//    public String handleName(){
//        String str="";
//        for (View view : views) {
//            str = view.handleName();
//        }
//        return str;
//    }
//
//    public String handlePhone(){
//        String str="";
//        for (View view : views) {
//            str = view.handlePhone();
//        }
//        return str;
//    }

    public int getSize(){
        return list.size();
    }

/*    public static void main(String[] args) {


        AddressBook addressBook = new AddressBook("Police");
        addressBook.addBuddy(new BuddyInfo("police",  "911"));
        addressBook.addBuddy(new BuddyInfo("bob",  "110"));
//        System.out.println(addressBook.toString());
    }*/
}
