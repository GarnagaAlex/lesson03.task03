package com.garnagaaa.lesson03.task03.app1;

import java.util.Objects;

/**
 * @author Aleksei Garnaga
 * Класс MathBox
 */
public class MathBox extends ObjectBox<Number> {

    /**
     * Конструктор
     * @param number Массив чисел
     */
    public MathBox(Number[] number) {
        for (Number value : number) {
            super.addObject(value);
        }

    }

    /**
     * Метод возвращающий сумму элементов
     * @return Сумма элементов
     */
    public double summator() {
        double sum = 0;
        for (Number num : getBase()) {
            sum += num.doubleValue();
        }
        return sum;
    }

    /**
     * Метод выполняющий поочередное деление всех элементов
     * @param divider Делитель
     */
    public void splitter(Number divider) {
        for (int i = 0; i < getBase().size(); i++) {
            getBase().set(i, getBase().get(i).doubleValue() / divider.doubleValue());
        }
    }

    /**
     * Метод удаления элемента из коллекции
     * @param element Элемент
     */
    public void remove(int element) {
        super.deleteObject(element);
    }

    @Override
    public String toString() {
        return super.dump();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(getBase(), mathBox.getBase());
    }

    @Override
    public int hashCode() {
        return getBase().hashCode();
    }

}
