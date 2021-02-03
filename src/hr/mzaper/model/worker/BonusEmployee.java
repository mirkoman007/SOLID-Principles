package hr.mzaper.model.worker;

public final class BonusEmployee extends Employee{
    private static BonusEmployee instance;

    private BonusEmployee() {
        super(0.11f);
    }

    public static BonusEmployee getInstance(){
        if(instance==null)
            instance=new BonusEmployee();
        return instance;
    }
}
