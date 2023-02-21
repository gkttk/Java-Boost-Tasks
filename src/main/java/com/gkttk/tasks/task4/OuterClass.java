package com.gkttk.tasks.task4;

//Create nested classes example.
public class OuterClass {

    public static final int publicStaticOuterVariable = 20;
    private static final int privateStaticOuterVariable = 10;

    static {
        System.out.println("Static block from OuterClass");
    }

    private final int privateOuterVariable = 5;

    {
        /*Локальный класс может быть определен в любом блоке кода, этот класс можно использовать только в этом же блоке кода*/
        class LocaleClass {

            //С Java 16 inner классам появилась возможность добавлять статические members
            public static final int localeStaticVariable = 50;

            static {
                System.out.print("Static block from LocaleClass" + localeStaticVariable);
            }

            public static void localeClassStaticMethod() {

            }

            public void localeClassMethod() {
                //Есть доступ ко всем переменным и методам Outer класса
                System.out.println(publicStaticOuterVariable);
                System.out.println(privateStaticOuterVariable);
                System.out.println(privateOuterVariable);
                outerClassStaticMethod();
                outerClassPrivateMethod();
                outerClassMethod();
            }
        }
    }

    public static void outerClassStaticMethod() {

        System.out.println("Outer static method");
    }

    public void outerClassMethod() {

        System.out.println("Outer method");
    }

    private void outerClassPrivateMethod() {

        System.out.println("Outer private method");
    }

    /*Статический вложенный класс*/
    static class StaticMemberClass {

        //С Java 16 inner классам появилась возможность добавлять статические members
        public static int staticMemberClassStaticVariable = 55;

        static {
            System.out.println("Static block from StaticMemberClass");
        }

        public int staticMemberClassVariable = 70;

        public static void staticMethodForStaticMemberClass() {
            //Из статического метода имеем доступ только к статике outer класса
            System.out.println(privateStaticOuterVariable);
            System.out.println(publicStaticOuterVariable);
            outerClassStaticMethod();
            //Для доступа к нестатическим членам outer класса нужен экземпляр
            //Не имеем доступа к нестатическим членам своего класса, нужен экземпляр
        }

        public void methodForStaticMemberClass() {
            //Из нестатического метода имеем доступ ко всем members outer класса
            System.out.println(privateStaticOuterVariable);
            System.out.println(publicStaticOuterVariable);
            outerClassStaticMethod();
            //Для доступа к нестатическим членам outer класса нужен экземпляр
            //Имеем доступ к нестатическим членам своего класса
            System.out.println(staticMemberClassVariable);
        }

    }


    /*Внутренний класс*/
    class InnerClass {

        //С Java 16 inner классам появилась возможность добавлять статические members
        public static int innerClassStaticVariable = 5;

        static {
            System.out.println("From InnerClass");
        }


        private final int innerClassVariable = 90;

        public static void innerClassStaticMethod() {
            //Из статического метода имеем доступ только к статике outer класса
            System.out.println(privateStaticOuterVariable);
            System.out.println(publicStaticOuterVariable);
            outerClassStaticMethod();
            //Для доступа к нестатическим членам outer класса
            //Не имеем доступа к нестатическим членам своего класса
        }

        public void innerClassMethod() {
            //Из нестатического метода имеем доступ ко всем members outer класса
            System.out.println(privateStaticOuterVariable);
            System.out.println(publicStaticOuterVariable);
            outerClassStaticMethod();
            outerClassMethod();
            System.out.println(privateOuterVariable);
            //Для доступа к нестатическим членам outer класса
            //Имеем доступ к нестатическим членам своего класса
            System.out.println(innerClassVariable);
        }


    }


}
