package com.example.admin.todolist2;

/**
 * Created by Admin on 07-10-2016.
 */
public class Student {

        private String ListItem;
        private boolean checkbox;

        public Student(String listItem, boolean checkbox) {
            ListItem = listItem;
            this.checkbox = checkbox;
        }

        public String getListItem() {
            return ListItem;
        }

        public void setListItem(String listItem) {
            ListItem = listItem;
        }

        public boolean isCheckbox() {
            return checkbox;
        }

        public void setCheckbox(boolean checkbox) {
            this.checkbox = checkbox;
        }
    }


