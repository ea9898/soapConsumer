package ru.studio.utils;


//import com.sun.xml.internal.ws.util.ByteArrayDataSource;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.studio.exception.CustomException;

import javax.activation.DataHandler;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Класс для конвертации значений.
 *
 */
public class DatatypeConverter {
    /** формат даты */
    private static final String YYYY_MM_DD = "yyyy-MM-dd";
    private static final String ENCODING_UTF_8 = "UTF-8";

    private static final DateTimeFormatter DEFAULT_TIME_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZZ");
    private static final DateTimeFormatter DEFAULT_TIME_FORMAT_2 = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    private static final Logger logger = LoggerFactory.getLogger(DatatypeConverter.class);
    private static final DateTimeFormatter DEFAULT_TIME_FORMAT_3 = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");

    private static final DateTimeFormatter[] formats = {
            DEFAULT_TIME_FORMAT,
            DEFAULT_TIME_FORMAT_2,
            DEFAULT_TIME_FORMAT_3
    };

    /**
     * Обрабатывает строку, преобразуя её в дату.
     * @param date дата в строковом представлении
     * @return дата
     */
    public static Date parseDate(String date) {
        if (date == null) {
            return null;
        }
        Date result = null;
        try {
            result = new SimpleDateFormat(YYYY_MM_DD).parse(date);
        } catch (ParseException e) {
            throw new EnotIlligaArgumentException("Invalid date format");
        }
        return result;
    }


    /**
     * Преобразует base64Binary в строку
     * @Author Борисов Тимофей Юрьевич
     * @param handler base64Binary
     * @return строка
     * */
    public static final String base64BinaryToString(DataHandler handler) throws CustomException
    {
        try {
            String result = null;
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                handler.writeTo(baos);
                baos.flush();
                result = baos.toString(ENCODING_UTF_8);
            }
            return result;
        }
        catch (Exception e)
        {
            throw new CustomException(e);
        }
    }

//    /**
//     * Преобразует строку s base64Binary
//     * Author Борисов Тимофей Юрьевич
//     * @param data строка
//     * @return base64Binary
//     * */
//    public static DataHandler stringToBase64Binary(String data)
//    {
//        DataHandler result = null;
//        if ((data == null)||(data.equals("")))
//            return null;
//        final byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
//        ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(bytes,"application/octet-stream");
//        result = new DataHandler(byteArrayDataSource);
//        return result;
//    }

    /**
     * Преобразует строку s base64Binary
     * Author Борисов Тимофей Юрьевич
     * @param data строка
     * @return base64Binary
     * */
//    public static DataHandler stringToBase64Binary(byte[] data)
//    {
//        DataHandler result = null;
//        if ((data == null)||(data.length<1))
//            return null;
//
//        ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(data,"application/octet-stream");
//        result = new DataHandler(byteArrayDataSource);
//
//        return result;
//    }

    /**
     * Преобразовывает дату в строку.
     * @param date дата
     * @return дата в строковом представлении
     */
    public static final String dateToString(Date date) {
        if (date == null) {
            return null;
        }

        String result = new SimpleDateFormat(YYYY_MM_DD).format(date);
        return result;
    }



    private static Date generateDate(String dateTime, DateTimeFormatter format)
    {
        try {

            Date result = format.parseDateTime(dateTime).toDate();

            return result;
        }
        catch ( Exception e)
        {
            logger.info("String format - " + format + "doent suit to " + dateTime);
            return null;
        }
    }

    /**
     * Обрабатывает строку, преобразуя её в дату.
     * @param dateTime дата в строковом представлении
     * @return дата
     */
    public static Date parseDateTime(String dateTime) {
        if (dateTime == null) {
            return null;
        }



        Date result = null;

        for (DateTimeFormatter format:formats
        ) {
            result = generateDate(dateTime,format);
            if (result != null)
            {
                return result;
            }
        }
        return result;
    }

    /**
     * Преобразовывает дату в строку.
     * @param dateTime дата
     * @return дата в строковом представлении
     */
    public static final String dateTimeToString(Date dateTime) {
        if (dateTime == null) {
            return null;
        }

        return new DateTime(dateTime).toString(DEFAULT_TIME_FORMAT);
    }

    /**
     * Пропуск разбора элемента
     * @param string
     * @return
     */
    public static final String skipMarshalling(String string) {
        return string;
    }

    /**
     * Пропуск разбора элемента
     * @param string
     * @return
     */
    public static final String skipUnMarshalling(String string) {
        return string;
    }

    private static class EnotIlligaArgumentException extends IllegalArgumentException {
        public EnotIlligaArgumentException() {
        }

        public EnotIlligaArgumentException(String s) {
            super(s);
        }

        public EnotIlligaArgumentException(String message, Throwable cause) {
            super(message, cause);
        }

        public EnotIlligaArgumentException(Throwable cause) {
            super(cause);
        }
    }
}
