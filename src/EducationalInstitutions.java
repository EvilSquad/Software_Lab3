/**
 * Клас, яким визначаємо модель "навчального закладу", з якого створюються об'єкти.
 */
public class EducationalInstitutions {

    // Поля класу навчального закладу
    private String name;      // Назва закладу
    private String city;      // Місто
    private int studentsCount; // Кількість студентів
    private int ranking;      // Рейтинг серед університетів України
    private int foundationYear; // Рік заснування

    /**
     * Конструктор класу EducationalInstitutions.
     *
     * @param name Назва навчального закладу
     * @param city Місто розташування
     * @param studentsCount Кількість студентів
     * @param ranking Рейтинг серед університетів України
     * @param foundationYear Рік заснування
     */
    public EducationalInstitutions(String name, String city, int studentsCount, int ranking, int foundationYear) {
        this.name = name;
        this.city = city;
        this.studentsCount = studentsCount;
        this.ranking = ranking;
        this.foundationYear = foundationYear;
    }

    // Геттери для доступу до полів (робив тільки ті, які
    // використовуються в лабораторній роботі).
    public String getCity() {
        return city;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    // Перевизначення методу toString для виведення до консолі
    @Override
    public String toString() {
        return "EducationalInstitution{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", studentsCount=" + studentsCount +
                ", ranking=" + ranking +
                ", foundationYear=" + foundationYear +
                '}';
    }

    // Перевизначення методу equals для порівняння
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EducationalInstitutions that = (EducationalInstitutions) obj;
        return name.equals(that.name) &&
                city.equals(that.city) &&
                studentsCount == that.studentsCount &&
                ranking == that.ranking &&
                foundationYear == that.foundationYear;
    }
}