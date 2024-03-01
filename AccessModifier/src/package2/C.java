package package2;

import package1.*;
public class C {


    //    public: visible in all classes in all packages
//    protected: visible to all classes in the same package or classes in other packages that are a subclass
//    default: visible to all classes in the same package
//    private: visible only in the same class

    public String pubMessage = "This is a public message";
    protected String proMessage = "This is confidential";

    private String privMessage = "This is Private";
    String defMessage = "This is a default message";
}
