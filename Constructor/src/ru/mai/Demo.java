package ru.mai;

import ru.mai.builders.TankBuilder;
import ru.mai.builders.TankManualBuilder;
import ru.mai.tanks.Tank;
import ru.mai.tanks.Characteristic;
import ru.mai.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        TankBuilder builder = new TankBuilder();
        director.constructMBT(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Tank tank = builder.getResult();
        System.out.println("Танк построен:\n" + tank.getTankType());


        TankManualBuilder manualBuilder = new TankManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructMBT(manualBuilder);
        Characteristic tankCharacteristic = manualBuilder.getResult();
        System.out.println("\nЛист ТТХ танка построен:\n" + tankCharacteristic.print());
    }

}
