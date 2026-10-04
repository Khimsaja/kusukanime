package y1;

/* loaded from: classes.dex */
public final class T {
    public static final T a = new T();

    static {
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 29791;
    }
}
