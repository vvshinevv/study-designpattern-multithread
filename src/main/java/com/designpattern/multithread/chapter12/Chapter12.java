package com.designpattern.multithread.chapter12;

import com.designpattern.multithread.chapter12.activeobject.ActiveObject;
import com.designpattern.multithread.chapter12.activeobject.ActiveObjectFactory;

public class Chapter12 {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice", activeObject).start();
        new MakerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
    }
}
