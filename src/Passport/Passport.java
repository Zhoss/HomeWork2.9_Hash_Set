package Passport;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Passport {
    private long passportNumber;
    private String personLastName;
    private String personName;
    private String personPatronymic;
    private LocalDate personBirthDate;

    public Passport(long passportNumber, String personLastName, String personName, String personPatronymic, LocalDate personBirthDate) {
        setPassportNumber(passportNumber);
        setPersonLastName(personLastName);
        setPersonName(personName);
        setPersonPatronymic(personPatronymic);
        this.personBirthDate = personBirthDate;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonPatronymic() {
        return personPatronymic;
    }

    public LocalDate getPersonBirthDate() {
        return personBirthDate;
    }

    public void setPassportNumber(long passportNumber) {
        if (passportNumber >= 1_000_000_000L && passportNumber <= 9_999_999_999L) {
            this.passportNumber = passportNumber;
        } else {
            System.out.println("Номер паспорта указан некорректно");
        }
    }

    public void setPersonLastName(String personLastName) {
        if (personLastName != null && !personLastName.isEmpty() && !personLastName.isBlank()) {
            this.personLastName = personLastName;
        } else {
            System.out.println("Фамилия гражданина указано некорректно");
        }
    }

    public void setPersonName(String personName) {
        if (personName != null && !personName.isEmpty() && !personName.isBlank()) {
            this.personName = personName;
        } else {
            System.out.println("Имя гражданина указано некорректно");
        }
    }

    public void setPersonPatronymic(String personPatronymic) {
        if (personPatronymic != null && !personPatronymic.isBlank()) {
            this.personPatronymic = personPatronymic;
        } else {
            this.personPatronymic = "";
        }
    }

    public void setPersonBirthDate(LocalDate personBirthDate) {
            this.personBirthDate = personBirthDate;
    }

    @Override
    public String toString() {
        return "Паспорт номер " + passportNumber +
                ", Ф.И.О " + personLastName + " " + personName + " " +  personPatronymic +
                ", дата рождения " + personBirthDate + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
