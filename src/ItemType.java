public enum ItemType {

    Audio("AU"),
    Visual("VI"),
    Audio_Mobile("AM"),
    Visual_Mobile("VM");

    private final String code;

    ItemType(String code) {
        this.code = code;
    }

    /**
     * Gets code for the current item.
     *
     * @return code
     */
    private String getCode() {
        return code;
    }

}
