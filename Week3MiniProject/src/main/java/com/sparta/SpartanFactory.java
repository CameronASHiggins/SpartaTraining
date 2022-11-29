package com.sparta;

public class SpartanFactory {

    public Spartan getSpartan(String spartanRole, String name){
//        if (spartanRole == null){
//            return null;
//        }
        if ("javadev".equalsIgnoreCase(spartanRole)){
            return new JavaDev(name);
        }
        else if ("javasdet".equalsIgnoreCase(spartanRole)){
            return new JavaSDET(name);
        }
        else if ("c#dev".equalsIgnoreCase(spartanRole) || "csharpdev".equalsIgnoreCase(spartanRole)){
            return new CSharpDev(name);
        }
        else if ("c#sdet".equalsIgnoreCase(spartanRole) || "csharpsdet".equalsIgnoreCase(spartanRole)){
            return new CSharpSDET(name);
        }else if ("dataengineer".equalsIgnoreCase(spartanRole)){
            return new DataEngineer(name);
        }else if ("devopsengineer".equalsIgnoreCase(spartanRole)){
            return new DevOpsEngineer(name);
        } else if ("businessanalyst".equalsIgnoreCase(spartanRole)) {
            return new BusinessAnalyst(name);
        }
        return null;
    }

}
