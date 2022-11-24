package org.example;

import org.example.D.Architect;
import org.example.D.Builder;
import org.example.D.Project;

public class Main {
    public static void main(String[] args) {
        Builder b1 = new Builder("Cameron");
        Architect a1 = new Architect("Abdullah");

        Project p1 = new Project(b1);
        Project p2 = new Project(a1);

        p1.jobDone();
        p2.jobDone();
    }
}