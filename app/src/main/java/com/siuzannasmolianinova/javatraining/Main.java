package com.siuzannasmolianinova.javatraining;

/**
 * Практическое задание
 * Все задачи должны быть реализованы в одном файле и разделены комментариями, указывающими на номер или текст задания.
 * Важно! Весь код должен быть написан по предоставленному Java Code Conventions
 * <p>
 * 1. Настроить проект для java 8
 * 2. Написать простое лямбда-выражение в переменной myClosure, лямбда-выражение должно выводить в
 * консоль фразу "I love Java". Вызвать это лямбда-выражение. Далее написать функцию, которая будет
 * запускать заданное лямбда-выражение заданное количество раз. Объявить функцию так:
 * public void repeatTask (int times, Runnable task). Функция должна запускать times раз
 * лямбда-выражение task . Используйте эту функцию для печати "I love Java" 10 раз.
 */
public class Main {
    public static void main (String[] args){

        Runnable myClosure = () -> System.out.println("I love Java");
        repeatTask(10, myClosure);
    }

    public static void repeatTask(int times, Runnable task){
        for(int i = 1; i <= times; i++){
            task.run();
        }
    }
}


