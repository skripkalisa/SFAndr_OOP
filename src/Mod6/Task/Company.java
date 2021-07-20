package Mod6.Task;

abstract class Company {

    protected String relation;
    protected boolean active;

//    public Company() {
//        //
//    }

    protected Company(String relation, boolean active) {
        this.relation = relation;
        this.active = active;
    }

    protected void message(){
        System.out.println("Company class is used");
    }
    abstract protected void action();
}
