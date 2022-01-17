package ru.sibsutis.lab1pleasework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * Метод для поиска максимального числа из двух данных
     * @param v1 Первое число для сравнения
     * @param v2 Второе число для сравнения
     * @return int Максимум из чисел v1 и v2
     */
    public static int Max(int v1, int v2){
        if(v2>v1)
            return v2;
        return v1;
    }
    /**
     * Метод для поиска минимального числа из двух данных
     * @param v1 Первое число для сравнения
     * @param v2 Второе число для сравнения
     * @return int Минимум из чисел v1 и v2
     */
    public static int Min(int v1, int v2){
        if(v2<v1)
            return v2;
        return v1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
