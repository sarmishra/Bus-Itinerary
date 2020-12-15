package com.sarojmishra.ex3;

public class DatabaseInfo {
    public static final String BUS_TABLE = "busData";




    public static final String UNIQUE_ID = "id";
    public static final String NAME = "name";

    public static final String KEYWORD = "keyword";



    private int id;
    private String unique_name;
    private String keyword;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    private boolean selected;

    public DatabaseInfo() {
    }
    public static final String CREATE_BUS_TABLE =
            "CREATE TABLE " + BUS_TABLE + "("
                    + NAME + " VARCHAR(255) PRIMARY KEY,"
                    + KEYWORD + " VARCHAR(255) "
                    + ")";






    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }

    private String editTextValue;




        public DatabaseInfo(String name, String keyword) {
        this.unique_name = name;
        this.keyword = keyword;
    }
    public DatabaseInfo(int id, String unique_name, String keyword) {
        this.id = id;
        this.unique_name = unique_name;
        this.keyword = keyword;
    }
    public String getUniqueName() {
        return unique_name;
    }

    public Integer getUniqueId() {
        return id;
    }

    public String getKeyword() {
        return keyword;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUnique_name(String unique_name) {
        this.unique_name = unique_name;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }



}
