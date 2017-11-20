package com.lc.prototypePattern;

import com.lc.model.ProductOne;

import java.io.*;

public class Prototype implements Cloneable, Serializable {
    private int i;
    public String test;
    public TestModel testModel;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public TestModel getTestModel() {
        return testModel;
    }

    public void setTestModel(TestModel testModel) {
        this.testModel = testModel;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Prototype clone() {
        Object obj = null;

        try {
            obj = super.clone();
            return (Prototype) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Prototype deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Prototype) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
