/**
 * Лабораторна робота №3
 * Виконав: Овер'янов Богдан, ст. гр. ІК-24, ФІОТ
 * Варіант №11
 *
 * Створити клас із виконавчим методом, в якому створити масив з об’єктів класу
 * визначеному варіантом (п. 2). Відсортувати масив, за одним з полів за зростанням,
 * а за іншим — за спаданням, використовуючи при цьому стандартні засоби сортування ().
 * Після цього знайти в масиві об’єкт, який ідентичний заданому. Всі змінні повинні бути
 * описані та значення їх задані у виконавчому методі. Код повинен бути детально
 * задокументований. Код повинен відповідати стандартам Java Code Conventions
 * (або Google Java Style Guide) та бути завантаженим на GitHub
 *
 * Головний клас програми. Демонструє роботу з масивом об'єктів
 * класу EducationalInstitutions, сортування та пошук об'єктів.
 */
public class Main {
    public static void main(String[] args) {

        // Створення масиву об'єктів EducationalInstitution
        EducationalInstitutions[] institutions = {
                new EducationalInstitutions("КПІ ім. Ігоря Сікорського", "Київ", 18458, 1, 1898),
                new EducationalInstitutions("НУ Львівська Політехніка", "Львів", 35000, 3, 1816),
                new EducationalInstitutions("ХНУ ім. В. Н. Каразіна", "Харків", 19678, 4, 1804),
                new EducationalInstitutions("КНУТД", "Київ", 10642, 27, 1930),
                new EducationalInstitutions("СУМДУ", "Суми", 14000, 5, 1948),
                new EducationalInstitutions("ДНУ ім. Олеся Гончара", "Дніпро", 15000, 16, 1918),
                new EducationalInstitutions("ХНМУ", "Харків", 6167, 22, 1805),
                new EducationalInstitutions("КНУТШ", "Київ", 25000, 2, 1834),
        };

        // Виведення масиву до сортування
        System.out.println("\nСписок навчальних закладів до сортування:");
        for (EducationalInstitutions institution : institutions) {
            System.out.println(institution);
        }

        // Сортування за містом за зростанням, а потім за кількістю студентів за спаданням
        java.util.Arrays.sort(institutions, (o1, o2) -> {
            int compareByCity = o1.getCity().compareTo(o2.getCity());
            if (compareByCity != 0) {
                return compareByCity; // Зростання за назвою міста
            }
            return Integer.compare(o2.getStudentsCount(), o1.getStudentsCount()); // Спадання за кількістю студентів
        });

        // Виведення відсортованого масиву
        System.out.println("\nВідсортований список навчальних закладів:");
        for (EducationalInstitutions institution : institutions) {
            System.out.println(institution);
        }

        // Пошук об'єкта, ідентичного заданому
        EducationalInstitutions target = new EducationalInstitutions("СУМДУ", "Суми", 14000, 5, 1948);
        boolean found = false;
        for (EducationalInstitutions institution : institutions) {
            if (institution.equals(target)) {
                found = true;
                System.out.println("\nЗнайдено ідентичний об'єкт:");
                System.out.println(institution);
                break;
            }
        }

        if (!found) {
            System.out.println("\nІдентичний об'єкт не знайдено =(");
        }
    }
}