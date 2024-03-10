import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DataManip implements Const {
    private final HashMap<Integer, String> data;

    public DataManip(){
        data = new HashMap<Integer, String>();
    }
    public String addPhoneNumber(Integer num, String name){
        if ((String.valueOf(num).length()) != PHONE_NUMBER_SIZE ||
                (name.length() > CONTACT_NAME_SIZE || name.isEmpty()))
        {
            return String.format("Invalid %s",
                    (name.length()>CONTACT_NAME_SIZE || name.isEmpty()) ? "name." : "number.");
        }
        else if (data.containsKey(num) || data.containsValue(name)){
            return String.format("This %s already exists, try again with a unique entry",
                    data.containsKey(num) ? "number" : "name");
        }
        else {
            data.put(num, name);
            return SUCCESS;
        }
    }


    public String deletePhoneNumber(Integer num){
        if (num == null)
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);

        if (String.valueOf(num).length() != PHONE_NUMBER_SIZE)
            return "Error, invalid number.";
        else {
            boolean removed = false;
            Set<Integer> keys = new HashSet<>(data.keySet());

            for (Integer key : keys) {
                if (Objects.equals(key, num)) {
                    data.remove(key);
                    removed = true;
                    break;
                }
            }
            return removed ? SUCCESS : "Error, number not in phonebook.";
        }
    }

    /*
    * Maybe create a class to hold phone number and name (?)
    * getters and setters for each
    * check for null in setters
    *
    *
    */
    public String updatePhoneNumber(Object object, Object newData){
        if (object == null || newData == null)
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);

        if (object instanceof Integer){
            // Iterate the HashMap to find the key(phone number) and update it.
            for (Integer key : data.keySet()){
                if (key == object){
                    data.replace(key, (String)newData);
                }
            }
        }
        else if (object instanceof String){
            // Iterate the HashMap to find the value(name) and remove it.
            String obj = "";
            for (Integer key : data.keySet()){
                if (data.get(key).equals(object)){
                    obj = data.get(key);
                    data.remove(key);
                    break;
                }
                else
                    return "Operation unsuccessful";
            }
            assert newData instanceof Integer;
            data.put((Integer)newData, obj);
            return SUCCESS;
        }
        return "";
    }






}
