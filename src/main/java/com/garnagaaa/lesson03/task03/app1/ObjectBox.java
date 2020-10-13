package com.garnagaaa.lesson03.task03.app1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksei Garnaga
 * Класс хранилище Objects
 */
public class ObjectBox<T> {

    private List<T> base = new ArrayList<>();

    public List<T> getBase() {
        return base;
    }

    public void setBase(List<T> base) {
        this.base = base;
    }

    /**
     * Метод добавляющий объект в коллекцию
     *
     * @param o Объект
     */
    public void addObject(T o) {
        base.add(o);
    }

    /**
     * Метод проверяющий наличие объекта в коллекции и при наличии удаляющий его.
     *
     * @param o Объект
     */
    public void deleteObject(T o) {
        base.remove(o);
    }

    /**
     * Метод выводящий содержимое коллекции в строку
     *
     * @return Строка содержащая объекты коллекции
     */
    public String dump() {
        return base.toString();
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "base=" + base +
                '}';
    }
}
