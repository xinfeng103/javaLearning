package Chapter5;

import java.util.Arrays;

public enum SizeEnum {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
    public static void main(String[] args) {
        System.out.println(SizeEnum.SMALL);

        SizeEnum[] values = SizeEnum.values();
        System.out.println(values);
        System.out.println(Arrays.toString(values));

        System.out.println(SizeEnum.LARGE.ordinal());

        System.out.println(SizeEnum.SMALL.compareTo(SizeEnum.MEDIUM));
    }
}


