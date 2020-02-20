package kafka;

import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.reflect.ReflectData;

public class Employee implements IndexedRecord {
    private String fName;
    private String lName;
    private int age;
    private String phoneNumber;

    public Employee(String fName, String lName, int age, String phoneNumber) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void put(int i, Object v) {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Schema getSchema() {
        return ReflectData.get().getSchema(Employee.class);
    }
}