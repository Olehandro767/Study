package com.company.Visitor;

public class CppDev implements IDev {
    @Override
    public void create(IProject iProject) {
        if (iProject instanceof DB)
            System.out.println("create conn to db");
        else if (iProject instanceof App)
            System.out.println("create App on C++");
    }
}