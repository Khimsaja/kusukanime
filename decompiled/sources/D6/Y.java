package D6;

/* loaded from: classes.dex */
public final class Y implements X {
    public static final Y a = new Y();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return X.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof X;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + X.class.getName() + "()";
    }
}
