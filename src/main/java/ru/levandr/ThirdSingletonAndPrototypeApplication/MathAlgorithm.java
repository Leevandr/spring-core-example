package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class MathAlgorithm {

    public MathAlgorithm() {
        String calc = "00101100";
        System.out.println("Algorithm for\n" + calc);
        System.out.println(calculate(calc));
    }

    public void printArray(List<int[]> jmas){
        for (int[] array : jmas){
            System.out.println(Arrays.toString(array));
        }
    }

    public String calculate(String input) {
        if (!Pattern.matches("[01]{8}", input)) {
            throw new IllegalArgumentException("Input must consist of eight digits (zero or one)");
        }

        List<int[]> jmas = new ArrayList<>();
        int[] f = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        jmas.add(f);

        for (int i = 0; i < 7; i++) {
            jmas.add(masinput(jmas.get(jmas.size() - 1)));
        }
        printArray(jmas);

        int[] alfa = new int[8];
        for (int i = 0; i < 8; i++) {
            alfa[i] = jmas.get(i)[0];
        }

        String[] stroke = {"1", "X", "Y", "Z", "XY", "XZ", "YZ", "XYZ"};
        List<String> itog = new ArrayList<>();
        for (int i = 0; i < stroke.length; i++) {
            if (alfa[i] == 1) {
                itog.add(stroke[i]);
            }
        }

        String itogstr = String.join("+", itog);
        return "P(X,Y,Z) = " + itogstr;
    }

    private int[] masinput(int[] a) {
        int[] result = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            result[i] = a[i] != a[i + 1] ? 1 : 0;
        }
        return result;
    }
}
