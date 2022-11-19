package immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class ImmutableC {

    private final int id;
    private final String name;
    private final Map<String, String> skills;

    /*
   1- We are creating a new copy of Date field otherwise reference to dob field may leak
   2- We are returning defensive copy of Date field instead of directly returning the reference of
    instance variable.
     */
    private Date dob;


    public ImmutableC(int id, String name, Map<String, String> skills,Date dob) {
        this.id = id;
        this.name = name;
        Map<String, String> temp = new HashMap<>();
        if (skills != null) {
            temp = new HashMap<>(skills);
        }
        this.skills = temp;
        this.dob = new Date(dob.getTime()); // 1
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getSkills() {
        Map<String, String> temp;
        temp = new HashMap<>(skills);
        return temp;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // 2
    }
}
