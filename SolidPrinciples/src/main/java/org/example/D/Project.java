package org.example.D;


//public class Project {
//    Architect a1 = new Architect("Hannibal");
//
//    public Project(Architect a1){
//        this.a1 = a1;
//    }
//
//}

public class Project {
    public Worker worker;

    public Project(Worker worker){
        this.worker = worker;
    }

    public void jobDone(){
        System.out.println("Job is done by " + worker.getName());
    }

}