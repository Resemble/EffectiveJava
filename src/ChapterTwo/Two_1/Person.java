package ChapterTwo.Two_1;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package ChapterTwo.Two_1
 * @Description:
 * @date 2017/5/10 21:02
 */
class Person {

    private final String birthdayDate;
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    Person(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public boolean isBabyBoomer() {
        return birthdayDate.compareTo(String.valueOf(BOOM_START)) >= 0 && birthdayDate.compareTo(String.valueOf(BOOM_END)) < 0;
    }


}
