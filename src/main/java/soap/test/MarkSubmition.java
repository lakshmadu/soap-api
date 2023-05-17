package soap.test;

import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://test.soap/", portName = "MarkSubmitionPort", serviceName = "MarkSubmitionService")
public class MarkSubmition {
	private static HashMap<String, Integer> marksMapStore = new HashMap<String, Integer>();
    private static String[] validCourseCodes = {"ITE3742", "ITE2722", "ITE3242","ITE6482", "ITE2160"};
    private static String[] validIndexNumbers = {"E2041351", "E12345679", "E1237865", "E11456325", "E45621536","E3456761"};

    @WebMethod(operationName = "storeMarks", action = "urn:StoreMarks")
	public static void setMarks(@WebParam(name = "arg0") String indexNumber, @WebParam(name = "arg1") String courseCode, @WebParam(name = "arg2") int marks) {
        String key = courseCode + indexNumber;
        if (!isValidCourseCode(courseCode) || !isValidIndexNumber(indexNumber)) {
            System.out.println("Invalid....! Please reche your course code and index Number.");
        } else {
            marksMapStore.put(key, marks);
        }
    }

    @WebMethod(operationName = "retrieveMarks", action = "urn:RetrieveMarks")
	public static int getMarks(@WebParam(name = "arg0") String indexNumber, @WebParam(name = "arg1") String courseCode) {
        String key = courseCode + indexNumber;
        if (!isValidCourseCode(courseCode) || !isValidIndexNumber(indexNumber)) {
            System.out.println("Invalid....! Please reche your course code and index Number.");
            return -1;
        } else if (marksMapStore.containsKey(key)) {
            return marksMapStore.get(key);
        } else {
            return -1;
        }
    }

    private static boolean isValidCourseCode(String courseCode) {
        for (String code : validCourseCodes) {
            if (code.equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidIndexNumber(String indexNumber) {
        for (String index : validIndexNumbers) {
            if (index.equals(indexNumber)) {
                return true;
            }
        }
        return false;
    }

}
