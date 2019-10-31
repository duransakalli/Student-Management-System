package java;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class JavaSingletonPattern {
	  private volatile static Singleton instance;
	    public static String str;
	    private Singleton() {}
	    
	    static Singleton getSingleInstance() {
	        if (instance == null) {
	            synchronized (Singleton.class) {
	                if (instance == null) {
	                    instance = new Singleton();
	                }
	            }
	        }
	        return instance;
	    }
}