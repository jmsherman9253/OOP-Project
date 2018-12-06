import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

    Scanner scanner = new Scanner(System.in);

    StringBuilder name;
    String code;
    String deptId;
    Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
    Scanner in;

    public EmployeeInfo() {
        setName();
        setDeptId();
    }

    public StringBuilder getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName() {
        String sName = inputName();
        name = new StringBuilder(sName);
        createEmployeeCode(name);
    }

    public void createEmployeeCode(StringBuilder name) {
        if (checkName(name)) {
            code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
        } else
            code = "Guest";
    }

    private String inputName() {

        System.out.println("Enter first and last name: ");
        String nameString = scanner.nextLine();
        return nameString;
    }

    private boolean checkName(StringBuilder name) {
        if (name.indexOf(" ") != -1)
            return true;
        else
            return false;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId() {
        String hold;
        System.out.println("Enter the department id: ");
        hold = scanner.nextLine();
        if (validId(hold)) {
            this.deptId = hold;
        } else {
            this.deptId = "Xxxx00";
        }
    }

    private String getId() {
        if (validId(this.deptId)) {
            return deptId;
        } else {
            return "Xxxx00";
        }
    }

    private boolean validId(String id) {
        Matcher m = p.matcher(id);
        if (m.matches()) {
            return true;
        } else
            return false;
    }

    public String toString() {
        return "Code: " + code + "\n" +
                "Department Id: " + deptId;
    }

    public String reverseString(String id) {
        String reverse = "";
        for (int i = id.length(); i > 0; i--) {
            reverse += id.charAt(i - 1);
        }
        return reverse;
    }
}
