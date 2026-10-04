package C;

/* loaded from: classes.dex */
public abstract class e {
    public static final d a = a();

    public static final d a() {
        c cVar = new c(50);
        return new d(cVar, cVar, cVar, cVar);
    }

    public static final d b(float f5) {
        b bVar = new b(f5);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static d c(float f5, float f7, float f8, int i7) {
        if ((i7 & 2) != 0) {
            f7 = 0;
        }
        if ((i7 & 4) != 0) {
            f8 = 0;
        }
        return new d(new b(f5), new b(f7), new b(f8), new b(0));
    }
}
