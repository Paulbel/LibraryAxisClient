package com.library.view;



import com.ModelCustomServiceStub;

import javax.swing.*;
import java.util.List;

public class BookListModel extends AbstractListModel {
    private List<ModelCustomServiceStub.Book> bookList;

    public BookListModel(List<ModelCustomServiceStub.Book> bookList) {
        this.bookList = bookList;
    }


    @Override
    public int getSize() {
        return bookList.size();
    }

    @Override
    public String getElementAt(int index) {
        ModelCustomServiceStub.Book book = bookList.get(index);
        return book.getName();
    }
}
