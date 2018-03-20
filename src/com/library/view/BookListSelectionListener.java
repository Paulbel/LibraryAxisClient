package com.library.view;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BookListSelectionListener implements ListSelectionListener {
    private MainFrame mainFrame;


    public BookListSelectionListener(MainFrame mainFrame) {
        super();
        this.mainFrame = mainFrame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            mainFrame.revalidateView();
        }
    }
}
