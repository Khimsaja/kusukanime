package y1;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: b, reason: collision with root package name */
    public static final X f18016b;
    public final j3.G a;

    static {
        j3.E e7 = j3.G.f12277l;
        f18016b = new X(j3.X.f12304o);
        B1.K.B(0);
    }

    public X(j3.G g4) {
        this.a = j3.G.s(g4);
    }

    public final boolean a(int i7) {
        int i8 = 0;
        while (true) {
            j3.G g4 = this.a;
            if (i8 >= g4.size()) {
                return false;
            }
            W w7 = (W) g4.get(i8);
            boolean[] zArr = w7.f18015e;
            int length = zArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (!zArr[i9]) {
                    i9++;
                } else if (w7.f18012b.f17970c == i7) {
                    return true;
                }
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((X) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
