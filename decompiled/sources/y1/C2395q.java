package y1;

/* renamed from: y1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2395q {
    public final long a;

    static {
        new C2395q(new V1.r());
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
        B1.K.B(4);
        B1.K.B(5);
        B1.K.B(6);
    }

    public C2395q(V1.r rVar) {
        rVar.getClass();
        int i7 = B1.K.a;
        this.a = rVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2395q)) {
            return false;
        }
        C2395q c2395q = (C2395q) obj;
        c2395q.getClass();
        return this.a == c2395q.a;
    }

    public final int hashCode() {
        long j7 = this.a;
        return ((((int) 0) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 29791;
    }
}
