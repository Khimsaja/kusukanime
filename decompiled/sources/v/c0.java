package v;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c0 {
    public static String a(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static StringBuilder b(String str, int i7, String str2, int i8, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        sb.append(i8);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void d(int i7, int i8, int i9, int i10, int i11) {
        B1.K.B(i7);
        B1.K.B(i8);
        B1.K.B(i9);
        B1.K.B(i10);
        B1.K.B(i11);
    }

    public static /* synthetic */ void e(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String f(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
