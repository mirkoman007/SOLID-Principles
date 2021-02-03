package hr.mzaper.model.worker;

public final class BasicEmployee extends Employee{
    private static BasicEmployee instance;

    private BasicEmployee() {
        super(0.1f);
    }

    public static BasicEmployee getInstance() {
        if (instance == null)
            instance = new BasicEmployee();
        return instance;

    }
}
