package Project;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Shop {

    static Set<Notebook> noteBooks = new LinkedHashSet<>();
    public static void main(String[] args) {

        allFill(noteBooks);
        autoBot();

    }

    public static void commands() {  // КОМАНДЫ

        System.out.println();
        System.out.println("<- КОМАНДЫ ->\n");
        System.out.println("1 -> ПОКАЗАТЬ ВЕСЬ ТОВАР\n");
        System.out.println("2 -> ПОИСК ПО КРИТЕРИЯМ\n");
        System.out.println("3 -> ЗАВЕРШИТЬ РАБОТУ\n");

    }

    public static void autoBot() {  // АВТОБОТ

        while (true) {

            commands();

            Scanner sc = new Scanner(System.in, "cp866");
            System.out.printf("Введите команду > ");
            String command = sc.next();
            System.out.println();

            if(command.equals("1")) {
                printAll();
            } else if(command.equals("2")) {
                search();
            } else {
                System.out.println("Работа завершена!");
                break;
            }
        }

    }

    public static Set<Notebook> allFill(Set<Notebook> nb) {  // ЗАПОЛНЕНИЕ СПИСКА

        Notebook s1 = new Notebook("Samsung", 4, 500, "Windows", "black");
        Notebook s2 = new Notebook("Samsung", 4, 500, "Windows", "white");
        Notebook s3 = new Notebook("Samsung", 4, 500, "Windows", "grey");
        Notebook s4 = new Notebook("Samsung", 4, 500, "Windows", "blue");
        Notebook s5 = new Notebook("Samsung", 8, 1000, "Windows", "black");
        Notebook s6 = new Notebook("Samsung", 8, 1000, "Windows", "white");
        Notebook s7 = new Notebook("Samsung", 8, 1000, "Windows", "grey");
        Notebook s8 = new Notebook("Samsung", 8, 1000, "Windows", "blue");
        Notebook s9 = new Notebook("Samsung", 16, 3000, "Windows", "black");
        Notebook s10 = new Notebook("Samsung", 16, 3000, "Windows", "white");
        Notebook s11 = new Notebook("Samsung", 16, 3000, "Windows", "grey");
        Notebook s12 = new Notebook("Samsung", 16, 3000, "Windows", "blue");

        Notebook a1 = new Notebook("Apple", 4, 500, "MacOs", "black");
        Notebook a2 = new Notebook("Apple", 4, 500, "MacOs", "white");
        Notebook a3 = new Notebook("Apple", 4, 500, "MacOs", "grey");
        Notebook a4 = new Notebook("Apple", 4, 500, "MacOs", "blue");
        Notebook a5 = new Notebook("Apple", 8, 1000, "MacOs", "black");
        Notebook a6 = new Notebook("Apple", 8, 1000, "MacOs", "white");
        Notebook a7 = new Notebook("Apple", 8, 1000, "MacOs", "grey");
        Notebook a8 = new Notebook("Apple", 8, 1000, "MacOs", "blue");
        Notebook a9 = new Notebook("Apple", 16, 3000, "MacOs", "black");
        Notebook a10 = new Notebook("Apple", 16, 3000, "MacOs", "white");
        Notebook a11 = new Notebook("Apple", 16, 3000, "MacOs", "grey");
        Notebook a12 = new Notebook("Apple", 16, 3000, "MacOs", "blue");

        Notebook d1 = new Notebook("Dell", 4, 500, "Linux", "black");
        Notebook d2 = new Notebook("Dell", 4, 500, "Linux", "white");
        Notebook d3 = new Notebook("Dell", 4, 500, "Linux", "grey");
        Notebook d4 = new Notebook("Dell", 4, 500, "Linux", "blue");
        Notebook d5 = new Notebook("Dell", 8, 1000, "Linux", "black");
        Notebook d6 = new Notebook("Dell", 8, 1000, "Linux", "white");
        Notebook d7 = new Notebook("Dell", 8, 1000, "Linux", "grey");
        Notebook d8 = new Notebook("Dell", 8, 1000, "Linux", "blue");
        Notebook d9 = new Notebook("Dell", 16, 3000, "Linux", "black");
        Notebook d10 = new Notebook("Dell", 16, 3000, "Linux", "white");
        Notebook d11 = new Notebook("Dell", 16, 3000, "Linux", "grey");
        Notebook d12 = new Notebook("Dell", 16, 3000, "Linux", "blue");

        noteBooks.add(s1);
        noteBooks.add(s2);
        noteBooks.add(s3);
        noteBooks.add(s4);
        noteBooks.add(s5);
        noteBooks.add(s6);
        noteBooks.add(s7);
        noteBooks.add(s8);
        noteBooks.add(s9);
        noteBooks.add(s10);
        noteBooks.add(s11);
        noteBooks.add(s12);

        noteBooks.add(a1);
        noteBooks.add(a2);
        noteBooks.add(a3);
        noteBooks.add(a4);
        noteBooks.add(a5);
        noteBooks.add(a6);
        noteBooks.add(a7);
        noteBooks.add(a8);
        noteBooks.add(a9);
        noteBooks.add(a10);
        noteBooks.add(a11);
        noteBooks.add(a12);

        noteBooks.add(d1);
        noteBooks.add(d2);
        noteBooks.add(d3);
        noteBooks.add(d4);
        noteBooks.add(d5);
        noteBooks.add(d6);
        noteBooks.add(d7);
        noteBooks.add(d8);
        noteBooks.add(d9);
        noteBooks.add(d10);
        noteBooks.add(d11);
        noteBooks.add(d12);

        return nb;
    }

    public static void printAll() {  // ВЫВОД ВСЕГО СПИСКА

        System.out.println("<- ОБЩИЙ СПИСОК ->");
        System.out.println();
        for (Notebook notebook : noteBooks) {
            System.out.println(notebook);
        }
        System.out.println();

    }

    public static void search() {  // ПОИСК ПО КРИТЕРИЯМ

        Scanner sc = new Scanner(System.in, "cp866");
        
        System.out.println();
        System.out.println("1 -> НАЗВАНИЕ БРЕНДА\n");
        System.out.println("2 -> ОПЕРАТИВНАЯ ПАМЯТЬ\n");
        System.out.println("3 -> ОБЪЁМ ЖЁСТКОГО ДИСКА\n");
        System.out.println("4 -> ОПЕРАЦИОННАЯ СИСТЕМА\n");
        System.out.println("5 -> ЦВЕТ");
        System.out.println();
        System.out.printf("Выберите критерий поиска > ");
        String command = sc.next();

        if(command.equals("1")) searchBrand();
        else if(command.equals("2")) searchRam();
        else if(command.equals("3")) searchHdd();
        else if(command.equals("4")) searchOpSys();
        else if(command.equals("5")) searchColor();
        else System.out.println("Такого критерия нет!");

    }

    public static void searchBrand() {  // СТРУКТУРА ПОИСКА ПО БРЕНДУ

        System.out.println();
        System.out.println("1 -> SAMSUNG");
        System.out.println("2 -> APPLE");
        System.out.println("3 -> DELL");

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите команду > ");
        String cm = sc.next();
        System.out.println();

        if(cm.equals("1")) {
            for (Notebook i : noteBooks) {
                if(i.getbrand().equals("Samsung")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("2")) {
            for (Notebook i : noteBooks) {
                if(i.getbrand().equals("Apple")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("3")) {
            for (Notebook i : noteBooks) {
                if(i.getbrand().equals("Dell")) {
                    System.out.println(i);
                }
            }
        } else System.out.println("Такой команды нет!");

        System.out.println();

    }

    public static void searchRam() {  // СТРУКТУРА ПОИСКА ПО ОПЕРАТИВНОЙ ПАМЯТИ

        System.out.println();
        System.out.println("1 -> 4 GB");
        System.out.println("2 -> 8 GB");
        System.out.println("3 -> 16 GB");

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите команду > ");
        String cm = sc.next();       
        System.out.println();

        if(cm.equals("1")) {
            for (Notebook i : noteBooks) {
                if(i.ram() == 4) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("2")) {
            for (Notebook i : noteBooks) {
                if(i.ram() == 8) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("3")) {
            for (Notebook i : noteBooks) {
                if(i.ram() == 16) {
                    System.out.println(i);
                }
            }
        } else System.out.println("Такой команды нет!");

        System.out.println();        

    }

    public static void searchHdd() {  // СТРУКТУРА ПОИСКА ПО ОБЪЁМУ ЖЁСТКОГО ДИСКА 

        System.out.println();
        System.out.println("1 -> 500 GB");
        System.out.println("2 -> 1000 GB");
        System.out.println("3 -> 3000 GB");

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите команду > ");
        String cm = sc.next();        
        System.out.println();

        if(cm.equals("1")) {
            for (Notebook i : noteBooks) {
                if(i.hdd() == 500) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("2")) {
            for (Notebook i : noteBooks) {
                if(i.hdd() == 1000) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("3")) {
            for (Notebook i : noteBooks) {
                if(i.hdd() == 3000) {
                    System.out.println(i);
                }
            }
        } else System.out.println("Такой команды нет!");

        System.out.println();          

    }

    public static void searchOpSys() {  // СТРУКТУРА ПОИСКА ПО ОПЕРАЦИОННОЙ СИСТЕМЕ

        System.out.println();
        System.out.println("1 -> WINDOWS");
        System.out.println("2 -> MacOs");
        System.out.println("3 -> LINUX");

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите команду > ");
        String cm = sc.next();        
        System.out.println();

        if(cm.equals("1")) {
            for (Notebook i : noteBooks) {
                if(i.opSys().equals("Windows")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("2")) {
            for (Notebook i : noteBooks) {
                if(i.opSys().equals("MacOs")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("3")) {
            for (Notebook i : noteBooks) {
                if(i.opSys().equals("Linux")) {
                    System.out.println(i);
                }
            }
        } else System.out.println("Такой команды нет!");

        System.out.println();         

    }

    public static void searchColor() {  // СТРУКТУРА ПОИСКА ПО ЦВЕТУ

        System.out.println();
        System.out.println("1 -> BLACK");
        System.out.println("2 -> WHITE");
        System.out.println("3 -> GREY");
        System.out.println("4 -> BLUE");

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите команду > ");
        String cm = sc.next();        
        System.out.println();

        if(cm.equals("1")) {
            for (Notebook i : noteBooks) {
                if(i.color().equals("black")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("2")) {
            for (Notebook i : noteBooks) {
                if(i.color().equals("white")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("3")) {
            for (Notebook i : noteBooks) {
                if(i.color().equals("grey")) {
                    System.out.println(i);
                }
            }
        } else if(cm.equals("4")) {
            for (Notebook i : noteBooks) {
                if(i.color().equals("blue")) {
                    System.out.println(i);
                }
            }
        } else System.out.println("Такой команды нет!");

        System.out.println();         

    }

}
