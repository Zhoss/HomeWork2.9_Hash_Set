package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Passport zhosanDS = new Passport(5465165146L, "Жосан", "Денис", "Сергеевич", LocalDate.of(1990, 12, 15));
        Passport makarovAV = new Passport(4872159729L, "Макаров", "Алексей", "", LocalDate.of(1978, 5, 23));
        Passport soninKA = new Passport(3187624932L, "Сонин", "Кирилл", "Александрович", LocalDate.of(1963, 8, 9));
        Passport ivanovPP = new Passport(7268216942L, "Иванов", "Петр", "Петрович", LocalDate.of(1985, 1, 30));

        Passport rybakovAS = new Passport(5465165146L, "Рыбаков", "Андрей", "Савельевич", LocalDate.of(1987, 3, 12));

        Set<Passport> passports = new HashSet<>();
        addPassport(zhosanDS, passports);
        addPassport(makarovAV, passports);
        addPassport(soninKA, passports);
        addPassport(ivanovPP, passports);
        addPassport(rybakovAS, passports);

        System.out.println(passports);

        System.out.println(findPassport(5465165146L, passports));
    }

    public static void addPassport(Passport passport, Set<Passport> set) {
        if (!set.contains(passport)) {
            set.add(passport);
        } else {
            for (Passport passport1 : set) {
                if (passport1.getPassportNumber() == passport.getPassportNumber()) {
                    passport1.setPersonLastName(passport.getPersonLastName());
                    passport1.setPersonName(passport.getPersonName());
                    passport1.setPersonPatronymic(passport.getPersonPatronymic());
                    passport1.setPersonBirthDate(passport.getPersonBirthDate());
                }
            }
        }
    }

    public static Passport findPassport(long passportNumber, Set<Passport> set) {
        for (Passport passport : set) {
            if (passport.getPassportNumber() == passportNumber) {
                return passport;
            }
        }
        return null;
    }
}
