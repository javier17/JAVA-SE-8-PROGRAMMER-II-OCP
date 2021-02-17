package mx.com.hittechs;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx.com.hittechs.model.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class HumanResourcesTest {
       
    enum Countries {
        ARGENTINA("Argentina"),
        CHILE("Chile"),
        COLOMBIA("Colombia"),
        ECUADOR("Ecuador"),
        GUATEMALA("Guatemala"),
        MEXICO("Mexico"),
        PERU("Peru"),
        VENEZUELA("Venezuela");

        private final String name;

        Countries(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @Before
    public void init() {
    }

    @Test
    public void test_older_than_20() {
    }

    @Test
    public void test_older_than_30() {
    }

    @Test
    public void test_older_than_60() {
    }

    @Test
    public void test_age_is_between_25_50() {
    }

    @Test
    public void test_age_is_between_50_60() {
    }

    @Test
    public void test_country_is_mexico() {
    }

    @Test
    public void test_country_is_colombia() {
    }

    @Test
    public void test_year_is_1999() {
    }

    @Test
    public void test_year_is_2000() {
    }

    @Test
    public void test_order_by_lastName() {

        List<Integer> ids = Arrays.asList(75, 67, 31, 6, 105, 17, 68, 73, 93, 52, 30, 70, 86, 88, 49, 55, 11, 89, 20, 43, 3, 87, 90, 61, 5, 48, 94, 10, 103, 98, 82, 71, 22, 91, 36, 84, 107, 79, 100, 9, 64, 53, 102, 106, 19, 4, 76, 80, 96, 23, 16, 1, 57, 2, 74, 38, 28, 66, 78, 8, 34, 29, 32, 65, 44, 104, 95, 59, 27, 25, 26, 99, 54, 33, 69, 47, 7, 41, 92, 37, 14, 42, 15, 35, 46, 85, 12, 40, 62, 60, 72, 39, 83, 58, 77, 81, 18, 51, 56, 13, 45, 63, 24, 97, 21, 101, 50);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_order_by_firstName() {

        List<Integer> ids = Arrays.asList(22, 97, 48, 4, 16, 86, 59, 76, 68, 88, 94, 5, 80, 54, 63, 43, 10, 64, 6, 52, 66, 15, 8, 99, 100, 50, 73, 75, 49, 84, 19, 70, 37, 105, 27, 12, 78, 28, 32, 57, 34, 82, 90, 101, 11, 40, 46, 77, 13, 41, 26, 87, 20, 47, 89, 25, 98, 36, 79, 30, 3, 60, 69, 61, 14, 83, 65, 21, 35, 102, 31, 9, 85, 55, 2, 56, 103, 58, 23, 45, 51, 53, 44, 92, 38, 95, 93, 62, 24, 106, 17, 18, 39, 1, 29, 67, 74, 104, 33, 71, 91, 42, 7, 96, 72, 107, 81);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_order_by_salary() {

//        employees.forEach(System.out::println);
        List<Integer> ids = Arrays.asList(33, 29, 37, 28, 36, 20, 32, 41, 45, 83, 92, 19, 44, 99, 100, 27, 40, 18, 31, 84, 96, 17, 35, 91, 88, 98, 16, 43, 82, 97, 26, 39, 81, 95, 30, 34, 87, 42, 38, 90, 89, 94, 93, 86, 8, 85, 101, 6, 7, 25, 5, 103, 74, 68, 80, 67, 24, 104, 66, 14, 56, 62, 79, 65, 73, 72, 55, 61, 12, 13, 23, 21, 54, 60, 11, 22, 107, 78, 77, 76, 4, 10, 53, 59, 52, 58, 64, 71, 51, 57, 70, 105, 50, 63, 15, 49, 75, 69, 9, 48, 106, 102, 47, 46, 2, 3, 1);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_order_by_hireDate_asc_then_by_deparment_desc() {

//        employees.forEach(System.out::println);
        List<Integer> ids = Arrays.asList(68, 74, 67, 29, 66, 37, 84, 50, 65, 100, 80, 92, 36, 14, 56, 25, 49, 20, 83, 99, 79, 33, 73, 64, 96, 72, 88, 8, 28, 55, 19, 62, 27, 35, 91, 45, 95, 87, 98, 97, 78, 41, 54, 77, 70, 44, 13, 82, 40, 7, 81, 71, 17, 61, 63, 31, 39, 24, 12, 11, 30, 53, 103, 90, 18, 26, 6, 89, 22, 52, 76, 69, 48, 60, 94, 86, 32, 51, 43, 47, 46, 59, 21, 34, 75, 58, 102, 93, 57, 85, 42, 38, 16, 23, 15, 9, 10, 105, 104, 106, 107, 3, 5, 4, 2, 101, 1);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_filter_by_age_older_than_60() {

//        employees.forEach(System.out::println);
        List<Integer> ids = Arrays.asList(3, 4, 18, 36, 53, 59, 74, 84);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_filter_by_firstName_start_with_e_and_order_by_firstName() {

//        employees.forEach(System.out::println);
        List<Integer> ids = Arrays.asList(50, 73, 75);
//        Assert.assertArrayEquals(ids.toArray(), employees.stream().map(Employee::getId).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_everyone_earns_more_than_15000() {
        boolean match = false;
        
        System.out.println(match);
        Assert.assertFalse(match);
    }

    @Test
    public void test_someone_earns_more_than_22000() {
        boolean match = true;
        
        System.out.println(match);
        Assert.assertTrue(match);
    }

    @Test
    public void test_nobody_earns_less_than_2500() {
        boolean match = false;
        
        System.out.println(match);
        Assert.assertFalse(match);
    }

    @Test
    public void test_find_fist_salary_less_than_2800() {
        Employee emp = new Employee();

//        Assert.assertEquals(19, emp.getId());
    }

    @Test
    public void test_phone_numbers_from_mexico() {
        List<String> numbers = null;

        List<String> nums = Arrays.asList("515.123.4567", "515.123.4568", "515.123.4569", "011.44.1644.429263", "515.123.5555", "603.123.6666", "515.123.7777");
        Assert.assertArrayEquals(nums.toArray(), numbers.toArray());
    }

    @Test
    public void test_average_age() {
        Double average = 36.0;

        Assert.assertEquals(36, average.intValue());
    }

    @Test
    public void test_average_salary() {
        Double average = 6461.0;
        Assert.assertEquals(6461, average.intValue());
    }

    @Test
    public void test_add_10_percent_salary_employees_over_50_years_old() {
        
        List<Double> salaries = Arrays.asList(18700.0, 9900.0, 13200.0, 9020.0, 3080.0, 2860.0, 2640.0, 2970.0, 10450.0, 9900.0, 9900.0, 6710.0, 6820.0, 3080.0, 4290.0);
//        Assert.assertArrayEquals(salaries.toArray(), employees.stream().map(Employee::getSalary).collect(Collectors.toList()).toArray());
    }

    @Test
    public void test_count_employees_over_35_years_old() {
        long count = 53;

        Assert.assertEquals(53, count);
    }

    @Test
    public void test_get_youngest_employee() {
        Employee emp = new Employee();

        System.out.println(emp);
//        Assert.assertEquals(10, emp.getId());
    }

    @Test
    public void test_get_oldest_employee() {
        Employee emp = new Employee();

        System.out.println(emp);
//        Assert.assertEquals(84, emp.getId());
    }

    @Test
    public void test_sum_salary() {
        Double sum = 691400.0;
        
        Assert.assertEquals(Double.valueOf(691400.0), sum);
    }

    @Test
    public void test_group_by_hireDate() {
        Map<LocalDate, List<String>> result = new HashMap<>();
        
        List<String> names
                = Arrays.asList("Susan", "Hermann", "Shelley", "William");
        Assert.assertArrayEquals(names.toArray(), result.get(LocalDate.of(1994, Month.JUNE, 07)).toArray());
    }

    @Test
    public void test_count_by_depatment() {
        Map<String, Long> count = new HashMap<>();

        Assert.assertEquals(1L, count.get("Administration").longValue());
        Assert.assertEquals(34L, count.get("Sales").longValue());
        Assert.assertEquals(6L, count.get("Purchasing").longValue());
        Assert.assertEquals(3L, count.get("Executive").longValue());
        Assert.assertEquals(1L, count.get("Public Relations").longValue());
        Assert.assertEquals(2L, count.get("Accounting").longValue());
        Assert.assertEquals(6L, count.get("Finance").longValue());
        Assert.assertEquals(45L, count.get("Shipping").longValue());
        Assert.assertEquals(5L, count.get("IT").longValue());
        Assert.assertEquals(1L, count.get("Human Resources").longValue());
        Assert.assertEquals(3L, count.get("Marketing").longValue());
    }
}
