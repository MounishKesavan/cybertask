import java.time.*;

public class TryZonedDateTime {
    public void zonedDateTime() {
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("India/Kolkata"));
        ZonedDateTime zonedDateTimeParse = ZonedDateTime.parse("2021-06-12T15:45+02:00[India/Kolkata]");
        ZonedDateTime zonedDate = ZonedDateTime.now(ZoneId.of("India/Kolkata"));
        ZonedDateTime defaultZone = ZonedDateTime.of(LocalDate.of(202, 06, 30), LocalTime.of(15, 0), ZoneId.systemDefault());

//        Set<String> zonedIds = ZoneId.getAvailableZoneIds();
//        System.out.println("zonedIds = " + zonedIds);

        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
        System.out.println("zonedDateTimeParse = " + zonedDateTimeParse);
        System.out.println("defaultZone = " + defaultZone);
        System.out.println("zonedDate = " + zonedDate);

        System.out.println("zonedDateTimeOf.getDayOfWeek() = " + zonedDateTimeOf.getDayOfWeek());
        System.out.println("zonedDateTimeOf.getYear() = " + zonedDateTimeOf.getYear());
        System.out.println("zonedDateTimeOf.toLocalDate() = " + zonedDateTimeOf.toLocalDate());
        System.out.println("zonedDateTimeOf.getOffset() = " + zonedDateTimeOf.getOffset());

        System.out.println("zonedDateTimeOf.isAfter(zonedDateTimeNow) = " + zonedDateTimeOf.isAfter(zonedDateTimeNow));
        System.out.println("zonedDateTimeNow.isEqual(zonedDateTimeOf) = " + zonedDateTimeNow.isEqual(zonedDateTimeOf));
    }
}
