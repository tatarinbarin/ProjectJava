package Project;

public class Notebook { // класс
    
    protected String brand;
    protected int ram;
    protected int hdd;
    protected String opSys;
    protected String color;

    public Notebook(String brand, int ram, int hdd, String opSys, String color) { // конструктор

        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.opSys = opSys;
        this.color = color;

    }

    @Override
    public String toString() { // форматированный вывод
        return brand + "{" + 
        "ram=" + ram + "gb" + ", " + 
        "hdd=" + hdd + "gb" + ", " + 
        "opSys=" + opSys + ", " + 
        "color=" + color + "}\n";
    }
  
    public String getbrand() { // возврат бренда
        return brand;
    }

    public int ram() { // возврат оперативной памяти
        return ram;
    }

    public int hdd() { // возврат жёсткого диска
        return hdd;
    }

    public String opSys() { // возврат операционной системы
        return opSys;
    }

    public String color() { // возврат цвета
        return color;
    }

}
