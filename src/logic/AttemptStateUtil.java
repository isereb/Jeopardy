package logic;

import models.AttemptState;

public class AttemptStateUtil {

    public static String getClassByAttemptState(AttemptState attemptState) {
        String btnClass;
        switch (attemptState) {
            case CORRECT:
                btnClass = "correct";
                break;
            case INCORRECT:
                btnClass = "incorrect";
                break;
            case SEEN:
                btnClass = "seen";
                break;
            case NEW:
            default:
                btnClass = "";
                break;
        }
        return btnClass;
    }

}
