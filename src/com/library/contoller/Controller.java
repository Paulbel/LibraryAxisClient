package com.library.contoller;

import com.ModelCustomServiceStub;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private final static String END_POINT = "http://localhost:8080/axis2/services/model.CustomService?wsdl";
    private final ModelCustomServiceStub stub;

    public Controller() throws AxisFault {
        stub = new ModelCustomServiceStub(END_POINT);
    }


    public List<ModelCustomServiceStub.Book> getBookList() {
        try {
            ModelCustomServiceStub.GetBookList getBook = new ModelCustomServiceStub.GetBookList();
            ModelCustomServiceStub.GetBookListResponse response = null;

            response = stub.getBookList(getBook);
            ModelCustomServiceStub.Book[] object = response.get_return();
            return Arrays.asList(object);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void changeBookInfo(ModelCustomServiceStub.Book book) {
        try {
            ModelCustomServiceStub.ChangeBookInfo changeBookInfo = new ModelCustomServiceStub.ChangeBookInfo();
            changeBookInfo.setBook(book);
            stub.changeBookInfo(changeBookInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public List<ModelCustomServiceStub.Person> getPersonList() {
        try {
            ModelCustomServiceStub.GetPersonList getPersonList = new ModelCustomServiceStub.GetPersonList();
            ModelCustomServiceStub.GetPersonListResponse response = null;

            response = stub.getPersonList(getPersonList);
            ModelCustomServiceStub.Person[] object = response.get_return();
            return Arrays.asList(object);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ModelCustomServiceStub.Organisation> getOrganisationList() {
        try {
            ModelCustomServiceStub.GetOrganisationList getOrganisationList = new ModelCustomServiceStub.GetOrganisationList();
            ModelCustomServiceStub.GetOrganisationListResponse response = null;

            response = stub.getOrganisationList(getOrganisationList);
            ModelCustomServiceStub.Organisation[] object = response.get_return();
            return Arrays.asList(object);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void addBook(ModelCustomServiceStub.Book book) {
        try {
            ModelCustomServiceStub.AddBook addBook = new ModelCustomServiceStub.AddBook();
            addBook.setBook(book);
            stub.addBook(addBook);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public List<ModelCustomServiceStub.Book> findBook(String name) {
        try {
            ModelCustomServiceStub.FindBook findBook = new ModelCustomServiceStub.FindBook();
            ModelCustomServiceStub.FindBookResponse response = null;
            findBook.setName(name);
            response = stub.findBook(findBook);
            ModelCustomServiceStub.Book[] object = response.get_return();
            return Arrays.asList(object);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

}
