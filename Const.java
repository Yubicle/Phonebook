public interface Const {
    final int PHONE_NUMBER_SIZE = 10;
    final int CONTACT_NAME_SIZE = 12;
    final String NULL_ARG_MSG = "Field cannot be empty";
    final String ILLEGAL_ARG_MSG = "Invalid object type";
    final String SUCCESS = "Operation successful";

    /*
    // TODO: Rewrite updatePhoneNumber(Object, Object)
    public String updatePhoneNumber(Object object, Object newData) {
        if (object == null || newData == null) {
            throw new IllegalArgumentException(NULL_ARG_MSG);
        }

        if (object instanceof Integer) {
            Integer key = (Integer) object;
            if (!data.containsKey(key)) {
                return "Number not found";
            }
            data.replace(key, (String) newData);
            return SUCCESS;
        } else if (object instanceof String) {
            String name = (String) object;
            Integer key = null;
            for (Integer existingKey : data.keySet()) {
                if (data.get(existingKey).equals(name)) {
                    key = existingKey;
                    break;
                }
            }
            if (key == null) {
                return "Name not found";
            }
            data.put(key, (String) newData);
            return SUCCESS;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }*/
}
