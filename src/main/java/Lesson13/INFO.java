package Lesson13;

public class INFO {
/*      АННОТАЦИИ:

        @Component - аннотация, указание Spring создать бин
        @Autowired - аннотация, указание зависимости между бинами
        @Qualifier - аннотация для уточнения id бина для внедрения зависимости (id бина указывается в скобках "id")
        @Value - аннотация для подгрузки properties из файла (ключ указывается в скобках "${key}")
        @Scope - аннотация, которая указывает область видимости (в скобках указывается тип области singleton/prototype и др.
        @PostConstruct - аннотация, с помощью которой помечается init-method (у метода не должно быть аргументов)
        @PreDestroy - аннотация, с помощью которой помечается destroy-method (у метода не должно быть аргументов)
        *для работы аннотаций @PostConstruct и @PreDestroy в Java 11 и выше необходимо добавить в pom.xlm дополнительную зависимость.
        @Configuration - аннотация-маркер для конфигурационного класса (аналог с XML)
        @ComponentScan - аннотация для сканирования аннотаций в указанном пакете (в скобках указывается дирректория пакета)
        *аналог команды <context:component-scan base-package="Lesson11"/> для XML
        @PropertySource - аннотация для указания файла со свойствами
        *аналог команды <context:property-placeholder location="musicPlayer.properties"/> для XML


        Если мы в качестве аргумента конструктора или сеттера передаем интерфейс, то Spring сканирует все бины, которые
        реализует данный интерфейс
        В случае, если под аннотацию @Autowired подходит несколько бинов (например @Component есть у двух классов,
        реализующих данный интерфейс), то Spring выдаст ошибку, т.к. не понимает для какого бина прописывать зависимость.

        КЛАССЫ:

        Для получения контекста из файла XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Для получения контекста из класс Java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        XML - КОМАНДЫ:

        xml-команда для сканирования аннотаций @Component в указанном пакете
        <context:component-scan base-package="Lesson11"/>
        xml-команда для указания файла со свойствами
        <context:property-placeholder location="musicPlayer.properties"/>
*/
}
