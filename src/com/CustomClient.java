package com;

import com.library.contoller.Controller;
import com.library.view.MainFrame;

import java.rmi.RemoteException;

public class CustomClient {


    public static void main(String[] args) throws RemoteException {
        MainFrame mainFrame = new MainFrame(new Controller());

    }
}
